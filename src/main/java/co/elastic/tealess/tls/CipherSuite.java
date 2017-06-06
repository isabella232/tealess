package co.elastic.tealess.tls;

/**
 * Created by jls on 5/1/2017.
 */
public enum CipherSuite {
  // curl -s https://www.iana.org/assignments/tls-parameters/tls-parameters-4.csv | ruby -rcsv -e 'CSV.parse(STDIN.read).each { |value, description, dtls, reference| next if description == "Unassigned"; puts "#{description}(#{value}); // #{reference}" }' | less
  TLS_NULL_WITH_NULL_NULL(0x00, 0x00), // [RFC5246]
  TLS_RSA_WITH_NULL_MD5(0x00, 0x01), // [RFC5246]
  TLS_RSA_WITH_NULL_SHA(0x00, 0x02), // [RFC5246]
  TLS_RSA_EXPORT_WITH_RC4_40_MD5(0x00, 0x03), // [RFC4346][RFC6347]
  TLS_RSA_WITH_RC4_128_MD5(0x00, 0x04), // [RFC5246][RFC6347]
  TLS_RSA_WITH_RC4_128_SHA(0x00, 0x05), // [RFC5246][RFC6347]
  TLS_RSA_EXPORT_WITH_RC2_CBC_40_MD5(0x00, 0x06), // [RFC4346]
  TLS_RSA_WITH_IDEA_CBC_SHA(0x00, 0x07), // [RFC5469]
  TLS_RSA_EXPORT_WITH_DES40_CBC_SHA(0x00, 0x08), // [RFC4346]
  TLS_RSA_WITH_DES_CBC_SHA(0x00, 0x09), // [RFC5469]
  TLS_RSA_WITH_3DES_EDE_CBC_SHA(0x00, 0x0A), // [RFC5246]
  TLS_DH_DSS_EXPORT_WITH_DES40_CBC_SHA(0x00, 0x0B), // [RFC4346]
  TLS_DH_DSS_WITH_DES_CBC_SHA(0x00, 0x0C), // [RFC5469]
  TLS_DH_DSS_WITH_3DES_EDE_CBC_SHA(0x00, 0x0D), // [RFC5246]
  TLS_DH_RSA_EXPORT_WITH_DES40_CBC_SHA(0x00, 0x0E), // [RFC4346]
  TLS_DH_RSA_WITH_DES_CBC_SHA(0x00, 0x0F), // [RFC5469]
  TLS_DH_RSA_WITH_3DES_EDE_CBC_SHA(0x00, 0x10), // [RFC5246]
  TLS_DHE_DSS_EXPORT_WITH_DES40_CBC_SHA(0x00, 0x11), // [RFC4346]
  TLS_DHE_DSS_WITH_DES_CBC_SHA(0x00, 0x12), // [RFC5469]
  TLS_DHE_DSS_WITH_3DES_EDE_CBC_SHA(0x00, 0x13), // [RFC5246]
  TLS_DHE_RSA_EXPORT_WITH_DES40_CBC_SHA(0x00, 0x14), // [RFC4346]
  TLS_DHE_RSA_WITH_DES_CBC_SHA(0x00, 0x15), // [RFC5469]
  TLS_DHE_RSA_WITH_3DES_EDE_CBC_SHA(0x00, 0x16), // [RFC5246]
  TLS_DH_anon_EXPORT_WITH_RC4_40_MD5(0x00, 0x17), // [RFC4346][RFC6347]
  TLS_DH_anon_WITH_RC4_128_MD5(0x00, 0x18), // [RFC5246][RFC6347]
  TLS_DH_anon_EXPORT_WITH_DES40_CBC_SHA(0x00, 0x19), // [RFC4346]
  TLS_DH_anon_WITH_DES_CBC_SHA(0x00, 0x1A), // [RFC5469]
  TLS_DH_anon_WITH_3DES_EDE_CBC_SHA(0x00, 0x1B), // [RFC5246]
  TLS_KRB5_WITH_DES_CBC_SHA(0x00, 0x1E), // [RFC2712]
  TLS_KRB5_WITH_3DES_EDE_CBC_SHA(0x00, 0x1F), // [RFC2712]
  TLS_KRB5_WITH_RC4_128_SHA(0x00, 0x20), // [RFC2712][RFC6347]
  TLS_KRB5_WITH_IDEA_CBC_SHA(0x00, 0x21), // [RFC2712]
  TLS_KRB5_WITH_DES_CBC_MD5(0x00, 0x22), // [RFC2712]
  TLS_KRB5_WITH_3DES_EDE_CBC_MD5(0x00, 0x23), // [RFC2712]
  TLS_KRB5_WITH_RC4_128_MD5(0x00, 0x24), // [RFC2712][RFC6347]
  TLS_KRB5_WITH_IDEA_CBC_MD5(0x00, 0x25), // [RFC2712]
  TLS_KRB5_EXPORT_WITH_DES_CBC_40_SHA(0x00, 0x26), // [RFC2712]
  TLS_KRB5_EXPORT_WITH_RC2_CBC_40_SHA(0x00, 0x27), // [RFC2712]
  TLS_KRB5_EXPORT_WITH_RC4_40_SHA(0x00, 0x28), // [RFC2712][RFC6347]
  TLS_KRB5_EXPORT_WITH_DES_CBC_40_MD5(0x00, 0x29), // [RFC2712]
  TLS_KRB5_EXPORT_WITH_RC2_CBC_40_MD5(0x00, 0x2A), // [RFC2712]
  TLS_KRB5_EXPORT_WITH_RC4_40_MD5(0x00, 0x2B), // [RFC2712][RFC6347]
  TLS_PSK_WITH_NULL_SHA(0x00, 0x2C), // [RFC4785]
  TLS_DHE_PSK_WITH_NULL_SHA(0x00, 0x2D), // [RFC4785]
  TLS_RSA_PSK_WITH_NULL_SHA(0x00, 0x2E), // [RFC4785]
  TLS_RSA_WITH_AES_128_CBC_SHA(0x00, 0x2F), // [RFC5246]
  TLS_DH_DSS_WITH_AES_128_CBC_SHA(0x00, 0x30), // [RFC5246]
  TLS_DH_RSA_WITH_AES_128_CBC_SHA(0x00, 0x31), // [RFC5246]
  TLS_DHE_DSS_WITH_AES_128_CBC_SHA(0x00, 0x32), // [RFC5246]
  TLS_DHE_RSA_WITH_AES_128_CBC_SHA(0x00, 0x33), // [RFC5246]
  TLS_DH_anon_WITH_AES_128_CBC_SHA(0x00, 0x34), // [RFC5246]
  TLS_RSA_WITH_AES_256_CBC_SHA(0x00, 0x35), // [RFC5246]
  TLS_DH_DSS_WITH_AES_256_CBC_SHA(0x00, 0x36), // [RFC5246]
  TLS_DH_RSA_WITH_AES_256_CBC_SHA(0x00, 0x37), // [RFC5246]
  TLS_DHE_DSS_WITH_AES_256_CBC_SHA(0x00, 0x38), // [RFC5246]
  TLS_DHE_RSA_WITH_AES_256_CBC_SHA(0x00, 0x39), // [RFC5246]
  TLS_DH_anon_WITH_AES_256_CBC_SHA(0x00, 0x3A), // [RFC5246]
  TLS_RSA_WITH_NULL_SHA256(0x00, 0x3B), // [RFC5246]
  TLS_RSA_WITH_AES_128_CBC_SHA256(0x00, 0x3C), // [RFC5246]
  TLS_RSA_WITH_AES_256_CBC_SHA256(0x00, 0x3D), // [RFC5246]
  TLS_DH_DSS_WITH_AES_128_CBC_SHA256(0x00, 0x3E), // [RFC5246]
  TLS_DH_RSA_WITH_AES_128_CBC_SHA256(0x00, 0x3F), // [RFC5246]
  TLS_DHE_DSS_WITH_AES_128_CBC_SHA256(0x00, 0x40), // [RFC5246]
  TLS_RSA_WITH_CAMELLIA_128_CBC_SHA(0x00, 0x41), // [RFC5932]
  TLS_DH_DSS_WITH_CAMELLIA_128_CBC_SHA(0x00, 0x42), // [RFC5932]
  TLS_DH_RSA_WITH_CAMELLIA_128_CBC_SHA(0x00, 0x43), // [RFC5932]
  TLS_DHE_DSS_WITH_CAMELLIA_128_CBC_SHA(0x00, 0x44), // [RFC5932]
  TLS_DHE_RSA_WITH_CAMELLIA_128_CBC_SHA(0x00, 0x45), // [RFC5932]
  TLS_DH_anon_WITH_CAMELLIA_128_CBC_SHA(0x00, 0x46), // [RFC5932]
  TLS_DHE_RSA_WITH_AES_128_CBC_SHA256(0x00, 0x67), // [RFC5246]
  TLS_DH_DSS_WITH_AES_256_CBC_SHA256(0x00, 0x68), // [RFC5246]
  TLS_DH_RSA_WITH_AES_256_CBC_SHA256(0x00, 0x69), // [RFC5246]
  TLS_DHE_DSS_WITH_AES_256_CBC_SHA256(0x00, 0x6A), // [RFC5246]
  TLS_DHE_RSA_WITH_AES_256_CBC_SHA256(0x00, 0x6B), // [RFC5246]
  TLS_DH_anon_WITH_AES_128_CBC_SHA256(0x00, 0x6C), // [RFC5246]
  TLS_DH_anon_WITH_AES_256_CBC_SHA256(0x00, 0x6D), // [RFC5246]
  TLS_RSA_WITH_CAMELLIA_256_CBC_SHA(0x00, 0x84), // [RFC5932]
  TLS_DH_DSS_WITH_CAMELLIA_256_CBC_SHA(0x00, 0x85), // [RFC5932]
  TLS_DH_RSA_WITH_CAMELLIA_256_CBC_SHA(0x00, 0x86), // [RFC5932]
  TLS_DHE_DSS_WITH_CAMELLIA_256_CBC_SHA(0x00, 0x87), // [RFC5932]
  TLS_DHE_RSA_WITH_CAMELLIA_256_CBC_SHA(0x00, 0x88), // [RFC5932]
  TLS_DH_anon_WITH_CAMELLIA_256_CBC_SHA(0x00, 0x89), // [RFC5932]
  TLS_PSK_WITH_RC4_128_SHA(0x00, 0x8A), // [RFC4279][RFC6347]
  TLS_PSK_WITH_3DES_EDE_CBC_SHA(0x00, 0x8B), // [RFC4279]
  TLS_PSK_WITH_AES_128_CBC_SHA(0x00, 0x8C), // [RFC4279]
  TLS_PSK_WITH_AES_256_CBC_SHA(0x00, 0x8D), // [RFC4279]
  TLS_DHE_PSK_WITH_RC4_128_SHA(0x00, 0x8E), // [RFC4279][RFC6347]
  TLS_DHE_PSK_WITH_3DES_EDE_CBC_SHA(0x00, 0x8F), // [RFC4279]
  TLS_DHE_PSK_WITH_AES_128_CBC_SHA(0x00, 0x90), // [RFC4279]
  TLS_DHE_PSK_WITH_AES_256_CBC_SHA(0x00, 0x91), // [RFC4279]
  TLS_RSA_PSK_WITH_RC4_128_SHA(0x00, 0x92), // [RFC4279][RFC6347]
  TLS_RSA_PSK_WITH_3DES_EDE_CBC_SHA(0x00, 0x93), // [RFC4279]
  TLS_RSA_PSK_WITH_AES_128_CBC_SHA(0x00, 0x94), // [RFC4279]
  TLS_RSA_PSK_WITH_AES_256_CBC_SHA(0x00, 0x95), // [RFC4279]
  TLS_RSA_WITH_SEED_CBC_SHA(0x00, 0x96), // [RFC4162]
  TLS_DH_DSS_WITH_SEED_CBC_SHA(0x00, 0x97), // [RFC4162]
  TLS_DH_RSA_WITH_SEED_CBC_SHA(0x00, 0x98), // [RFC4162]
  TLS_DHE_DSS_WITH_SEED_CBC_SHA(0x00, 0x99), // [RFC4162]
  TLS_DHE_RSA_WITH_SEED_CBC_SHA(0x00, 0x9A), // [RFC4162]
  TLS_DH_anon_WITH_SEED_CBC_SHA(0x00, 0x9B), // [RFC4162]
  TLS_RSA_WITH_AES_128_GCM_SHA256(0x00, 0x9C), // [RFC5288]
  TLS_RSA_WITH_AES_256_GCM_SHA384(0x00, 0x9D), // [RFC5288]
  TLS_DHE_RSA_WITH_AES_128_GCM_SHA256(0x00, 0x9E), // [RFC5288]
  TLS_DHE_RSA_WITH_AES_256_GCM_SHA384(0x00, 0x9F), // [RFC5288]
  TLS_DH_RSA_WITH_AES_128_GCM_SHA256(0x00, 0xA0), // [RFC5288]
  TLS_DH_RSA_WITH_AES_256_GCM_SHA384(0x00, 0xA1), // [RFC5288]
  TLS_DHE_DSS_WITH_AES_128_GCM_SHA256(0x00, 0xA2), // [RFC5288]
  TLS_DHE_DSS_WITH_AES_256_GCM_SHA384(0x00, 0xA3), // [RFC5288]
  TLS_DH_DSS_WITH_AES_128_GCM_SHA256(0x00, 0xA4), // [RFC5288]
  TLS_DH_DSS_WITH_AES_256_GCM_SHA384(0x00, 0xA5), // [RFC5288]
  TLS_DH_anon_WITH_AES_128_GCM_SHA256(0x00, 0xA6), // [RFC5288]
  TLS_DH_anon_WITH_AES_256_GCM_SHA384(0x00, 0xA7), // [RFC5288]
  TLS_PSK_WITH_AES_128_GCM_SHA256(0x00, 0xA8), // [RFC5487]
  TLS_PSK_WITH_AES_256_GCM_SHA384(0x00, 0xA9), // [RFC5487]
  TLS_DHE_PSK_WITH_AES_128_GCM_SHA256(0x00, 0xAA), // [RFC5487]
  TLS_DHE_PSK_WITH_AES_256_GCM_SHA384(0x00, 0xAB), // [RFC5487]
  TLS_RSA_PSK_WITH_AES_128_GCM_SHA256(0x00, 0xAC), // [RFC5487]
  TLS_RSA_PSK_WITH_AES_256_GCM_SHA384(0x00, 0xAD), // [RFC5487]
  TLS_PSK_WITH_AES_128_CBC_SHA256(0x00, 0xAE), // [RFC5487]
  TLS_PSK_WITH_AES_256_CBC_SHA384(0x00, 0xAF), // [RFC5487]
  TLS_PSK_WITH_NULL_SHA256(0x00, 0xB0), // [RFC5487]
  TLS_PSK_WITH_NULL_SHA384(0x00, 0xB1), // [RFC5487]
  TLS_DHE_PSK_WITH_AES_128_CBC_SHA256(0x00, 0xB2), // [RFC5487]
  TLS_DHE_PSK_WITH_AES_256_CBC_SHA384(0x00, 0xB3), // [RFC5487]
  TLS_DHE_PSK_WITH_NULL_SHA256(0x00, 0xB4), // [RFC5487]
  TLS_DHE_PSK_WITH_NULL_SHA384(0x00, 0xB5), // [RFC5487]
  TLS_RSA_PSK_WITH_AES_128_CBC_SHA256(0x00, 0xB6), // [RFC5487]
  TLS_RSA_PSK_WITH_AES_256_CBC_SHA384(0x00, 0xB7), // [RFC5487]
  TLS_RSA_PSK_WITH_NULL_SHA256(0x00, 0xB8), // [RFC5487]
  TLS_RSA_PSK_WITH_NULL_SHA384(0x00, 0xB9), // [RFC5487]
  TLS_RSA_WITH_CAMELLIA_128_CBC_SHA256(0x00, 0xBA), // [RFC5932]
  TLS_DH_DSS_WITH_CAMELLIA_128_CBC_SHA256(0x00, 0xBB), // [RFC5932]
  TLS_DH_RSA_WITH_CAMELLIA_128_CBC_SHA256(0x00, 0xBC), // [RFC5932]
  TLS_DHE_DSS_WITH_CAMELLIA_128_CBC_SHA256(0x00, 0xBD), // [RFC5932]
  TLS_DHE_RSA_WITH_CAMELLIA_128_CBC_SHA256(0x00, 0xBE), // [RFC5932]
  TLS_DH_anon_WITH_CAMELLIA_128_CBC_SHA256(0x00, 0xBF), // [RFC5932]
  TLS_RSA_WITH_CAMELLIA_256_CBC_SHA256(0x00, 0xC0), // [RFC5932]
  TLS_DH_DSS_WITH_CAMELLIA_256_CBC_SHA256(0x00, 0xC1), // [RFC5932]
  TLS_DH_RSA_WITH_CAMELLIA_256_CBC_SHA256(0x00, 0xC2), // [RFC5932]
  TLS_DHE_DSS_WITH_CAMELLIA_256_CBC_SHA256(0x00, 0xC3), // [RFC5932]
  TLS_DHE_RSA_WITH_CAMELLIA_256_CBC_SHA256(0x00, 0xC4), // [RFC5932]
  TLS_DH_anon_WITH_CAMELLIA_256_CBC_SHA256(0x00, 0xC5), // [RFC5932]
  TLS_EMPTY_RENEGOTIATION_INFO_SCSV(0x00, 0xFF), // [RFC5746]
  TLS_FALLBACK_SCSV(0x56, 0x00), // [RFC7507]
  TLS_ECDH_ECDSA_WITH_NULL_SHA(0xC0, 0x01), // [RFC4492]
  TLS_ECDH_ECDSA_WITH_RC4_128_SHA(0xC0, 0x02), // [RFC4492][RFC6347]
  TLS_ECDH_ECDSA_WITH_3DES_EDE_CBC_SHA(0xC0, 0x03), // [RFC4492]
  TLS_ECDH_ECDSA_WITH_AES_128_CBC_SHA(0xC0, 0x04), // [RFC4492]
  TLS_ECDH_ECDSA_WITH_AES_256_CBC_SHA(0xC0, 0x05), // [RFC4492]
  TLS_ECDHE_ECDSA_WITH_NULL_SHA(0xC0, 0x06), // [RFC4492]
  TLS_ECDHE_ECDSA_WITH_RC4_128_SHA(0xC0, 0x07), // [RFC4492][RFC6347]
  TLS_ECDHE_ECDSA_WITH_3DES_EDE_CBC_SHA(0xC0, 0x08), // [RFC4492]
  TLS_ECDHE_ECDSA_WITH_AES_128_CBC_SHA(0xC0, 0x09), // [RFC4492]
  TLS_ECDHE_ECDSA_WITH_AES_256_CBC_SHA(0xC0, 0x0A), // [RFC4492]
  TLS_ECDH_RSA_WITH_NULL_SHA(0xC0, 0x0B), // [RFC4492]
  TLS_ECDH_RSA_WITH_RC4_128_SHA(0xC0, 0x0C), // [RFC4492][RFC6347]
  TLS_ECDH_RSA_WITH_3DES_EDE_CBC_SHA(0xC0, 0x0D), // [RFC4492]
  TLS_ECDH_RSA_WITH_AES_128_CBC_SHA(0xC0, 0x0E), // [RFC4492]
  TLS_ECDH_RSA_WITH_AES_256_CBC_SHA(0xC0, 0x0F), // [RFC4492]
  TLS_ECDHE_RSA_WITH_NULL_SHA(0xC0, 0x10), // [RFC4492]
  TLS_ECDHE_RSA_WITH_RC4_128_SHA(0xC0, 0x11), // [RFC4492][RFC6347]
  TLS_ECDHE_RSA_WITH_3DES_EDE_CBC_SHA(0xC0, 0x12), // [RFC4492]
  TLS_ECDHE_RSA_WITH_AES_128_CBC_SHA(0xC0, 0x13), // [RFC4492]
  TLS_ECDHE_RSA_WITH_AES_256_CBC_SHA(0xC0, 0x14), // [RFC4492]
  TLS_ECDH_anon_WITH_NULL_SHA(0xC0, 0x15), // [RFC4492]
  TLS_ECDH_anon_WITH_RC4_128_SHA(0xC0, 0x16), // [RFC4492][RFC6347]
  TLS_ECDH_anon_WITH_3DES_EDE_CBC_SHA(0xC0, 0x17), // [RFC4492]
  TLS_ECDH_anon_WITH_AES_128_CBC_SHA(0xC0, 0x18), // [RFC4492]
  TLS_ECDH_anon_WITH_AES_256_CBC_SHA(0xC0, 0x19), // [RFC4492]
  TLS_SRP_SHA_WITH_3DES_EDE_CBC_SHA(0xC0, 0x1A), // [RFC5054]
  TLS_SRP_SHA_RSA_WITH_3DES_EDE_CBC_SHA(0xC0, 0x1B), // [RFC5054]
  TLS_SRP_SHA_DSS_WITH_3DES_EDE_CBC_SHA(0xC0, 0x1C), // [RFC5054]
  TLS_SRP_SHA_WITH_AES_128_CBC_SHA(0xC0, 0x1D), // [RFC5054]
  TLS_SRP_SHA_RSA_WITH_AES_128_CBC_SHA(0xC0, 0x1E), // [RFC5054]
  TLS_SRP_SHA_DSS_WITH_AES_128_CBC_SHA(0xC0, 0x1F), // [RFC5054]
  TLS_SRP_SHA_WITH_AES_256_CBC_SHA(0xC0, 0x20), // [RFC5054]
  TLS_SRP_SHA_RSA_WITH_AES_256_CBC_SHA(0xC0, 0x21), // [RFC5054]
  TLS_SRP_SHA_DSS_WITH_AES_256_CBC_SHA(0xC0, 0x22), // [RFC5054]
  TLS_ECDHE_ECDSA_WITH_AES_128_CBC_SHA256(0xC0, 0x23), // [RFC5289]
  TLS_ECDHE_ECDSA_WITH_AES_256_CBC_SHA384(0xC0, 0x24), // [RFC5289]
  TLS_ECDH_ECDSA_WITH_AES_128_CBC_SHA256(0xC0, 0x25), // [RFC5289]
  TLS_ECDH_ECDSA_WITH_AES_256_CBC_SHA384(0xC0, 0x26), // [RFC5289]
  TLS_ECDHE_RSA_WITH_AES_128_CBC_SHA256(0xC0, 0x27), // [RFC5289]
  TLS_ECDHE_RSA_WITH_AES_256_CBC_SHA384(0xC0, 0x28), // [RFC5289]
  TLS_ECDH_RSA_WITH_AES_128_CBC_SHA256(0xC0, 0x29), // [RFC5289]
  TLS_ECDH_RSA_WITH_AES_256_CBC_SHA384(0xC0, 0x2A), // [RFC5289]
  TLS_ECDHE_ECDSA_WITH_AES_128_GCM_SHA256(0xC0, 0x2B), // [RFC5289]
  TLS_ECDHE_ECDSA_WITH_AES_256_GCM_SHA384(0xC0, 0x2C), // [RFC5289]
  TLS_ECDH_ECDSA_WITH_AES_128_GCM_SHA256(0xC0, 0x2D), // [RFC5289]
  TLS_ECDH_ECDSA_WITH_AES_256_GCM_SHA384(0xC0, 0x2E), // [RFC5289]
  TLS_ECDHE_RSA_WITH_AES_128_GCM_SHA256(0xC0, 0x2F), // [RFC5289]
  TLS_ECDHE_RSA_WITH_AES_256_GCM_SHA384(0xC0, 0x30), // [RFC5289]
  TLS_ECDH_RSA_WITH_AES_128_GCM_SHA256(0xC0, 0x31), // [RFC5289]
  TLS_ECDH_RSA_WITH_AES_256_GCM_SHA384(0xC0, 0x32), // [RFC5289]
  TLS_ECDHE_PSK_WITH_RC4_128_SHA(0xC0, 0x33), // [RFC5489][RFC6347]
  TLS_ECDHE_PSK_WITH_3DES_EDE_CBC_SHA(0xC0, 0x34), // [RFC5489]
  TLS_ECDHE_PSK_WITH_AES_128_CBC_SHA(0xC0, 0x35), // [RFC5489]
  TLS_ECDHE_PSK_WITH_AES_256_CBC_SHA(0xC0, 0x36), // [RFC5489]
  TLS_ECDHE_PSK_WITH_AES_128_CBC_SHA256(0xC0, 0x37), // [RFC5489]
  TLS_ECDHE_PSK_WITH_AES_256_CBC_SHA384(0xC0, 0x38), // [RFC5489]
  TLS_ECDHE_PSK_WITH_NULL_SHA(0xC0, 0x39), // [RFC5489]
  TLS_ECDHE_PSK_WITH_NULL_SHA256(0xC0, 0x3A), // [RFC5489]
  TLS_ECDHE_PSK_WITH_NULL_SHA384(0xC0, 0x3B), // [RFC5489]
  TLS_RSA_WITH_ARIA_128_CBC_SHA256(0xC0, 0x3C), // [RFC6209]
  TLS_RSA_WITH_ARIA_256_CBC_SHA384(0xC0, 0x3D), // [RFC6209]
  TLS_DH_DSS_WITH_ARIA_128_CBC_SHA256(0xC0, 0x3E), // [RFC6209]
  TLS_DH_DSS_WITH_ARIA_256_CBC_SHA384(0xC0, 0x3F), // [RFC6209]
  TLS_DH_RSA_WITH_ARIA_128_CBC_SHA256(0xC0, 0x40), // [RFC6209]
  TLS_DH_RSA_WITH_ARIA_256_CBC_SHA384(0xC0, 0x41), // [RFC6209]
  TLS_DHE_DSS_WITH_ARIA_128_CBC_SHA256(0xC0, 0x42), // [RFC6209]
  TLS_DHE_DSS_WITH_ARIA_256_CBC_SHA384(0xC0, 0x43), // [RFC6209]
  TLS_DHE_RSA_WITH_ARIA_128_CBC_SHA256(0xC0, 0x44), // [RFC6209]
  TLS_DHE_RSA_WITH_ARIA_256_CBC_SHA384(0xC0, 0x45), // [RFC6209]
  TLS_DH_anon_WITH_ARIA_128_CBC_SHA256(0xC0, 0x46), // [RFC6209]
  TLS_DH_anon_WITH_ARIA_256_CBC_SHA384(0xC0, 0x47), // [RFC6209]
  TLS_ECDHE_ECDSA_WITH_ARIA_128_CBC_SHA256(0xC0, 0x48), // [RFC6209]
  TLS_ECDHE_ECDSA_WITH_ARIA_256_CBC_SHA384(0xC0, 0x49), // [RFC6209]
  TLS_ECDH_ECDSA_WITH_ARIA_128_CBC_SHA256(0xC0, 0x4A), // [RFC6209]
  TLS_ECDH_ECDSA_WITH_ARIA_256_CBC_SHA384(0xC0, 0x4B), // [RFC6209]
  TLS_ECDHE_RSA_WITH_ARIA_128_CBC_SHA256(0xC0, 0x4C), // [RFC6209]
  TLS_ECDHE_RSA_WITH_ARIA_256_CBC_SHA384(0xC0, 0x4D), // [RFC6209]
  TLS_ECDH_RSA_WITH_ARIA_128_CBC_SHA256(0xC0, 0x4E), // [RFC6209]
  TLS_ECDH_RSA_WITH_ARIA_256_CBC_SHA384(0xC0, 0x4F), // [RFC6209]
  TLS_RSA_WITH_ARIA_128_GCM_SHA256(0xC0, 0x50), // [RFC6209]
  TLS_RSA_WITH_ARIA_256_GCM_SHA384(0xC0, 0x51), // [RFC6209]
  TLS_DHE_RSA_WITH_ARIA_128_GCM_SHA256(0xC0, 0x52), // [RFC6209]
  TLS_DHE_RSA_WITH_ARIA_256_GCM_SHA384(0xC0, 0x53), // [RFC6209]
  TLS_DH_RSA_WITH_ARIA_128_GCM_SHA256(0xC0, 0x54), // [RFC6209]
  TLS_DH_RSA_WITH_ARIA_256_GCM_SHA384(0xC0, 0x55), // [RFC6209]
  TLS_DHE_DSS_WITH_ARIA_128_GCM_SHA256(0xC0, 0x56), // [RFC6209]
  TLS_DHE_DSS_WITH_ARIA_256_GCM_SHA384(0xC0, 0x57), // [RFC6209]
  TLS_DH_DSS_WITH_ARIA_128_GCM_SHA256(0xC0, 0x58), // [RFC6209]
  TLS_DH_DSS_WITH_ARIA_256_GCM_SHA384(0xC0, 0x59), // [RFC6209]
  TLS_DH_anon_WITH_ARIA_128_GCM_SHA256(0xC0, 0x5A), // [RFC6209]
  TLS_DH_anon_WITH_ARIA_256_GCM_SHA384(0xC0, 0x5B), // [RFC6209]
  TLS_ECDHE_ECDSA_WITH_ARIA_128_GCM_SHA256(0xC0, 0x5C), // [RFC6209]
  TLS_ECDHE_ECDSA_WITH_ARIA_256_GCM_SHA384(0xC0, 0x5D), // [RFC6209]
  TLS_ECDH_ECDSA_WITH_ARIA_128_GCM_SHA256(0xC0, 0x5E), // [RFC6209]
  TLS_ECDH_ECDSA_WITH_ARIA_256_GCM_SHA384(0xC0, 0x5F), // [RFC6209]
  TLS_ECDHE_RSA_WITH_ARIA_128_GCM_SHA256(0xC0, 0x60), // [RFC6209]
  TLS_ECDHE_RSA_WITH_ARIA_256_GCM_SHA384(0xC0, 0x61), // [RFC6209]
  TLS_ECDH_RSA_WITH_ARIA_128_GCM_SHA256(0xC0, 0x62), // [RFC6209]
  TLS_ECDH_RSA_WITH_ARIA_256_GCM_SHA384(0xC0, 0x63), // [RFC6209]
  TLS_PSK_WITH_ARIA_128_CBC_SHA256(0xC0, 0x64), // [RFC6209]
  TLS_PSK_WITH_ARIA_256_CBC_SHA384(0xC0, 0x65), // [RFC6209]
  TLS_DHE_PSK_WITH_ARIA_128_CBC_SHA256(0xC0, 0x66), // [RFC6209]
  TLS_DHE_PSK_WITH_ARIA_256_CBC_SHA384(0xC0, 0x67), // [RFC6209]
  TLS_RSA_PSK_WITH_ARIA_128_CBC_SHA256(0xC0, 0x68), // [RFC6209]
  TLS_RSA_PSK_WITH_ARIA_256_CBC_SHA384(0xC0, 0x69), // [RFC6209]
  TLS_PSK_WITH_ARIA_128_GCM_SHA256(0xC0, 0x6A), // [RFC6209]
  TLS_PSK_WITH_ARIA_256_GCM_SHA384(0xC0, 0x6B), // [RFC6209]
  TLS_DHE_PSK_WITH_ARIA_128_GCM_SHA256(0xC0, 0x6C), // [RFC6209]
  TLS_DHE_PSK_WITH_ARIA_256_GCM_SHA384(0xC0, 0x6D), // [RFC6209]
  TLS_RSA_PSK_WITH_ARIA_128_GCM_SHA256(0xC0, 0x6E), // [RFC6209]
  TLS_RSA_PSK_WITH_ARIA_256_GCM_SHA384(0xC0, 0x6F), // [RFC6209]
  TLS_ECDHE_PSK_WITH_ARIA_128_CBC_SHA256(0xC0, 0x70), // [RFC6209]
  TLS_ECDHE_PSK_WITH_ARIA_256_CBC_SHA384(0xC0, 0x71), // [RFC6209]
  TLS_ECDHE_ECDSA_WITH_CAMELLIA_128_CBC_SHA256(0xC0, 0x72), // [RFC6367]
  TLS_ECDHE_ECDSA_WITH_CAMELLIA_256_CBC_SHA384(0xC0, 0x73), // [RFC6367]
  TLS_ECDH_ECDSA_WITH_CAMELLIA_128_CBC_SHA256(0xC0, 0x74), // [RFC6367]
  TLS_ECDH_ECDSA_WITH_CAMELLIA_256_CBC_SHA384(0xC0, 0x75), // [RFC6367]
  TLS_ECDHE_RSA_WITH_CAMELLIA_128_CBC_SHA256(0xC0, 0x76), // [RFC6367]
  TLS_ECDHE_RSA_WITH_CAMELLIA_256_CBC_SHA384(0xC0, 0x77), // [RFC6367]
  TLS_ECDH_RSA_WITH_CAMELLIA_128_CBC_SHA256(0xC0, 0x78), // [RFC6367]
  TLS_ECDH_RSA_WITH_CAMELLIA_256_CBC_SHA384(0xC0, 0x79), // [RFC6367]
  TLS_RSA_WITH_CAMELLIA_128_GCM_SHA256(0xC0, 0x7A), // [RFC6367]
  TLS_RSA_WITH_CAMELLIA_256_GCM_SHA384(0xC0, 0x7B), // [RFC6367]
  TLS_DHE_RSA_WITH_CAMELLIA_128_GCM_SHA256(0xC0, 0x7C), // [RFC6367]
  TLS_DHE_RSA_WITH_CAMELLIA_256_GCM_SHA384(0xC0, 0x7D), // [RFC6367]
  TLS_DH_RSA_WITH_CAMELLIA_128_GCM_SHA256(0xC0, 0x7E), // [RFC6367]
  TLS_DH_RSA_WITH_CAMELLIA_256_GCM_SHA384(0xC0, 0x7F), // [RFC6367]
  TLS_DHE_DSS_WITH_CAMELLIA_128_GCM_SHA256(0xC0, 0x80), // [RFC6367]
  TLS_DHE_DSS_WITH_CAMELLIA_256_GCM_SHA384(0xC0, 0x81), // [RFC6367]
  TLS_DH_DSS_WITH_CAMELLIA_128_GCM_SHA256(0xC0, 0x82), // [RFC6367]
  TLS_DH_DSS_WITH_CAMELLIA_256_GCM_SHA384(0xC0, 0x83), // [RFC6367]
  TLS_DH_anon_WITH_CAMELLIA_128_GCM_SHA256(0xC0, 0x84), // [RFC6367]
  TLS_DH_anon_WITH_CAMELLIA_256_GCM_SHA384(0xC0, 0x85), // [RFC6367]
  TLS_ECDHE_ECDSA_WITH_CAMELLIA_128_GCM_SHA256(0xC0, 0x86), // [RFC6367]
  TLS_ECDHE_ECDSA_WITH_CAMELLIA_256_GCM_SHA384(0xC0, 0x87), // [RFC6367]
  TLS_ECDH_ECDSA_WITH_CAMELLIA_128_GCM_SHA256(0xC0, 0x88), // [RFC6367]
  TLS_ECDH_ECDSA_WITH_CAMELLIA_256_GCM_SHA384(0xC0, 0x89), // [RFC6367]
  TLS_ECDHE_RSA_WITH_CAMELLIA_128_GCM_SHA256(0xC0, 0x8A), // [RFC6367]
  TLS_ECDHE_RSA_WITH_CAMELLIA_256_GCM_SHA384(0xC0, 0x8B), // [RFC6367]
  TLS_ECDH_RSA_WITH_CAMELLIA_128_GCM_SHA256(0xC0, 0x8C), // [RFC6367]
  TLS_ECDH_RSA_WITH_CAMELLIA_256_GCM_SHA384(0xC0, 0x8D), // [RFC6367]
  TLS_PSK_WITH_CAMELLIA_128_GCM_SHA256(0xC0, 0x8E), // [RFC6367]
  TLS_PSK_WITH_CAMELLIA_256_GCM_SHA384(0xC0, 0x8F), // [RFC6367]
  TLS_DHE_PSK_WITH_CAMELLIA_128_GCM_SHA256(0xC0, 0x90), // [RFC6367]
  TLS_DHE_PSK_WITH_CAMELLIA_256_GCM_SHA384(0xC0, 0x91), // [RFC6367]
  TLS_RSA_PSK_WITH_CAMELLIA_128_GCM_SHA256(0xC0, 0x92), // [RFC6367]
  TLS_RSA_PSK_WITH_CAMELLIA_256_GCM_SHA384(0xC0, 0x93), // [RFC6367]
  TLS_PSK_WITH_CAMELLIA_128_CBC_SHA256(0xC0, 0x94), // [RFC6367]
  TLS_PSK_WITH_CAMELLIA_256_CBC_SHA384(0xC0, 0x95), // [RFC6367]
  TLS_DHE_PSK_WITH_CAMELLIA_128_CBC_SHA256(0xC0, 0x96), // [RFC6367]
  TLS_DHE_PSK_WITH_CAMELLIA_256_CBC_SHA384(0xC0, 0x97), // [RFC6367]
  TLS_RSA_PSK_WITH_CAMELLIA_128_CBC_SHA256(0xC0, 0x98), // [RFC6367]
  TLS_RSA_PSK_WITH_CAMELLIA_256_CBC_SHA384(0xC0, 0x99), // [RFC6367]
  TLS_ECDHE_PSK_WITH_CAMELLIA_128_CBC_SHA256(0xC0, 0x9A), // [RFC6367]
  TLS_ECDHE_PSK_WITH_CAMELLIA_256_CBC_SHA384(0xC0, 0x9B), // [RFC6367]
  TLS_RSA_WITH_AES_128_CCM(0xC0, 0x9C), // [RFC6655]
  TLS_RSA_WITH_AES_256_CCM(0xC0, 0x9D), // [RFC6655]
  TLS_DHE_RSA_WITH_AES_128_CCM(0xC0, 0x9E), // [RFC6655]
  TLS_DHE_RSA_WITH_AES_256_CCM(0xC0, 0x9F), // [RFC6655]
  TLS_RSA_WITH_AES_128_CCM_8(0xC0, 0xA0), // [RFC6655]
  TLS_RSA_WITH_AES_256_CCM_8(0xC0, 0xA1), // [RFC6655]
  TLS_DHE_RSA_WITH_AES_128_CCM_8(0xC0, 0xA2), // [RFC6655]
  TLS_DHE_RSA_WITH_AES_256_CCM_8(0xC0, 0xA3), // [RFC6655]
  TLS_PSK_WITH_AES_128_CCM(0xC0, 0xA4), // [RFC6655]
  TLS_PSK_WITH_AES_256_CCM(0xC0, 0xA5), // [RFC6655]
  TLS_DHE_PSK_WITH_AES_128_CCM(0xC0, 0xA6), // [RFC6655]
  TLS_DHE_PSK_WITH_AES_256_CCM(0xC0, 0xA7), // [RFC6655]
  TLS_PSK_WITH_AES_128_CCM_8(0xC0, 0xA8), // [RFC6655]
  TLS_PSK_WITH_AES_256_CCM_8(0xC0, 0xA9), // [RFC6655]
  TLS_PSK_DHE_WITH_AES_128_CCM_8(0xC0, 0xAA), // [RFC6655]
  TLS_PSK_DHE_WITH_AES_256_CCM_8(0xC0, 0xAB), // [RFC6655]
  TLS_ECDHE_ECDSA_WITH_AES_128_CCM(0xC0, 0xAC), // [RFC7251]
  TLS_ECDHE_ECDSA_WITH_AES_256_CCM(0xC0, 0xAD), // [RFC7251]
  TLS_ECDHE_ECDSA_WITH_AES_128_CCM_8(0xC0, 0xAE), // [RFC7251]
  TLS_ECDHE_ECDSA_WITH_AES_256_CCM_8(0xC0, 0xAF), // [RFC7251]
  TLS_ECDHE_RSA_WITH_CHACHA20_POLY1305_SHA256(0xCC, 0xA8), // [RFC7905]
  TLS_ECDHE_ECDSA_WITH_CHACHA20_POLY1305_SHA256(0xCC, 0xA9), // [RFC7905]
  TLS_DHE_RSA_WITH_CHACHA20_POLY1305_SHA256(0xCC, 0xAA), // [RFC7905]
  TLS_PSK_WITH_CHACHA20_POLY1305_SHA256(0xCC, 0xAB), // [RFC7905]
  TLS_ECDHE_PSK_WITH_CHACHA20_POLY1305_SHA256(0xCC, 0xAC), // [RFC7905]
  TLS_DHE_PSK_WITH_CHACHA20_POLY1305_SHA256(0xCC, 0xAD), // [RFC7905]
  TLS_RSA_PSK_WITH_CHACHA20_POLY1305_SHA256(0xCC, 0xAE); // [RFC7905]

  protected final byte b1;
  protected final byte b2;

  CipherSuite(int b1, int b2) {
    this.b1 = (byte) b1;
    this.b2 = (byte) b2;
  }

  static CipherSuite forValue(byte b1, byte b2) throws InvalidValue {
    for (CipherSuite c : CipherSuite.values()) {
      if (c.b1 == b1 && c.b2 == b2) {
        return c;
      }
    }

    throw new InvalidValue(String.format("Invalid CipherSuite value 0x%02x,0x%02x", b1, b2));
  }

  public String keyExchange() {
    // This is a hack until I figure out how to really know what key exchange is used for each cipher suite.
    return name().replaceFirst("(_EXPORT_)?_WITH_.*$", "").replaceFirst("^TLS_", "");
  }
}
