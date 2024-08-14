package org.kenny.design.pattern.creational.abstractfactory.cryptographic_library;

public interface EncryptionAlgorithm {
    byte[] encrypt(byte[] data, Key key);
    byte[] decrypt(byte[] encryptedData, Key key);
}
