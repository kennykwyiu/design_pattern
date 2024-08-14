package org.kenny.design.pattern.creational.abstractfactory.cryptographic_library;

public class RSACryptoFactory implements CryptoFactory {
    @Override
    public EncryptionAlgorithm createEncryptionAlgorithm() {
        return new RSAEncryptionAlgorithm();
    }

    @Override
    public KeyManagementStrategy createKeyManagementStrategy() {
        return new RSAKeyManagementStrategy();
    }

    @Override
    public SecureProtocol createSecureProtocol() {
        return new SSLSecureProtocol();
    }
}
