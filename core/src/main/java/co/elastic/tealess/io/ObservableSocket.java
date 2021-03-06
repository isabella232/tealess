package co.elastic.tealess.io;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class ObservableSocket extends SocketProxy {
  private final OutputStream outputStream;
  private final InputStream inputStream;
  private final IOException deferredOutputStreamException;
  private final IOException deferredInputStreamException;

  public ObservableSocket(Socket socket, InputObserver inputObserver, OutputObserver outputObserver, ExceptionObserver exceptionObserver) {
    super(socket);

    IOException deferredInputStreamException1;
    InputStream inputStream1;
    try {
      inputStream1 = new ObservableInputStream(socket.getInputStream(), inputObserver, exceptionObserver);
      deferredInputStreamException1 = null;
    } catch (IOException e) {
      inputStream1 = null;
      deferredInputStreamException1 = e;
    }
    deferredInputStreamException = deferredInputStreamException1;
    inputStream = inputStream1;

    IOException deferredOutputStreamException1;
    OutputStream outputStream1;
    try {
      outputStream1 = new ObservableOutputStream(socket.getOutputStream(), outputObserver, exceptionObserver);
      deferredOutputStreamException1 = null;
    } catch (IOException e) {
      outputStream1 = null;
      deferredOutputStreamException1 = e;
    }
    outputStream = outputStream1;
    deferredOutputStreamException = deferredOutputStreamException1;
  }

  @Override
  public InputStream getInputStream() throws IOException {
    if (deferredInputStreamException != null) {
      throw deferredInputStreamException;
    }
    return inputStream;
  }

  @Override
  public OutputStream getOutputStream() throws IOException {
    if (deferredOutputStreamException != null) {
      throw deferredOutputStreamException;
    }
    return outputStream;
  }
}
