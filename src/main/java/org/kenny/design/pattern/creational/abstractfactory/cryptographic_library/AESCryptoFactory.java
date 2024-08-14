package org.kenny.design.pattern.creational.abstractfactory.cryptographic_library;

public class AESCryptoFactory implements CryptoFactory {
    @Override
    public EncryptionAlgorithm createEncryptionAlgorithm() {
        return new AESEncryptionAlgorithm();
    }

    @Override
    public KeyManagementStrategy createKeyManagementStrategy() {
        return new AESKeyManagementStrategy();
    }

    @Override
    public SecureProtocol createSecureProtocol() {
        return new TLSSecureProtocol();
    }
}
