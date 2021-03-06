package co.elastic.tealess;

import co.elastic.tealess.io.Transaction;

import javax.net.ssl.SSLEngine;
import javax.net.ssl.SSLEngineResult;
import javax.net.ssl.SSLException;
import javax.net.ssl.TrustManager;
import java.nio.BufferOverflowException;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class TealessSSLEngine extends SSLEngineProxy {
  private final String[] cipherSuites;
  private final TrustManager[] trustManagers;

  private final List<Transaction<?>> log = new LinkedList<>();
  private final ByteBuffer input = ByteBuffer.allocate(16384);
  private final ByteBuffer output = ByteBuffer.allocate(16384);
  private boolean outputFull = false;
  private boolean inputFull = false;


  public TealessSSLEngine(SSLEngine engine, String[] cipherSuites, TrustManager[] trustManagers) {
    super(engine);
    this.cipherSuites = cipherSuites;
    this.trustManagers = trustManagers;

    try {
      engine.setEnabledCipherSuites(cipherSuites);
    } catch (IllegalArgumentException e) {
      // XXX: If this failed because we tried to use a strong cipher, let's help the operator.
      // XXX: Oracle Java ships with strong ciphers disabled and requires operators to install a special
      // XXX: security policy file ("unlimited-strength cryptography") to enable them.
      // XXX: So we should detect this and give the operator a very clear action to resolve the problem.
      // Provide a more informative exception when an invalid ciphersuite is selected.
      throw new IllegalArgumentException(e.getMessage() + ". Supported ciphersuites are: " + Arrays.asList(engine.getSupportedCipherSuites()), e);
    }
  }

  private void recordOutput(ByteBuffer buffer) {
    if (!outputFull && buffer.position() > 0) {
      final ByteBuffer dup = buffer.duplicate();
      dup.position(0);
      dup.limit(buffer.position());
      log.add(Transaction.create(Transaction.Operation.Output, dup.remaining()));
      try {
        output.put(dup);
      } catch (BufferOverflowException e) {
        outputFull = true;
      }
    }
  }

  private void recordInput(ByteBuffer buffer) {
    if (!inputFull && buffer.remaining() > 0) {
      System.out.printf("input %s %d\n", buffer, buffer.remaining());
      buffer.mark();
      log.add(Transaction.create(Transaction.Operation.Input, buffer.remaining()));
      try {
        input.put(buffer);
      } catch (BufferOverflowException e) {
        inputFull = true;
      } finally {
        buffer.reset();
      }
    }
  }

  @Override
  public SSLEngineResult wrap(ByteBuffer srcs, ByteBuffer dst) throws SSLException {
    try {
      SSLEngineResult result = super.wrap(srcs, dst);
      if (!outputFull) {
        recordOutput(dst);
      }
      return result;
    } catch (SSLException e) {
      diagnose(e);
      throw e;
    }
  }


  @Override
  public SSLEngineResult wrap(ByteBuffer[] srcs, ByteBuffer dst) throws SSLException {
    try {
      SSLEngineResult result = super.wrap(srcs, dst);
      if (!outputFull) {
        recordOutput(dst);
      }
      return result;
    } catch (SSLException e) {
      DiagnosticTLSObserver.diagnoseException(log, input, output, e, trustManagers);
      throw e;
    }
  }

  @Override
  public SSLEngineResult wrap(ByteBuffer[] srcs, int i, int i1, ByteBuffer dst) throws SSLException {
    try {
      SSLEngineResult result = super.wrap(srcs, i, i1, dst);
      if (!outputFull) {
        recordOutput(dst);
      }
      return result;
    } catch (SSLException e) {
      diagnose(e);
      throw e;
    }
  }

  @Override
  public SSLEngineResult unwrap(ByteBuffer src, ByteBuffer dst) throws SSLException {
    if (!inputFull) {
      recordInput(src);
    }
    try {
      return super.unwrap(src, dst);
    } catch (SSLException e) {
      diagnose(e);
      throw e;
    }
  }

  @Override
  public SSLEngineResult unwrap(ByteBuffer src, ByteBuffer[] dsts) throws SSLException {
    if (!inputFull) {
      recordInput(src);
    }
    try {
      return super.unwrap(src, dsts);
    } catch (SSLException e) {
      diagnose(e);
      throw e;
    }
  }

  @Override
  public SSLEngineResult unwrap(ByteBuffer src, ByteBuffer[] dsts, int i, int i1) throws SSLException {
    if (!inputFull) {
      recordInput(src);
    }
    try {
      return super.unwrap(src, dsts, i, i1);
    } catch (SSLException e) {
      diagnose(e);
      throw e;
    }
  }

  private void diagnose(SSLException e) throws SSLException {
    input.flip();
    output.flip();
    DiagnosticTLSObserver.diagnoseException(log, input, output, e, trustManagers);
  }
}
