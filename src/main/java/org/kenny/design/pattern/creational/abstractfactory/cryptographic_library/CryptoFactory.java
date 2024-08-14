package org.kenny.design.pattern.creational.abstractfactory.cryptographic_library;

public interface CryptoFactory {
    EncryptionAlgorithm createEncryptionAlgorithm();
    KeyManagementStrategy createKeyManagementStrategy();
    SecureProtocol createSecureProtocol();
}
