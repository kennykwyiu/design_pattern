package org.kenny.design.pattern.creational.abstractfactory.cryptographic_library;

public class Key {
    private byte[] keyBytes;
    private KeyType keyType;

    public Key(byte[] keyBytes, KeyType keyType) {
        this.keyBytes = keyBytes;
        this.keyType = keyType;
    }

    public byte[] getKeyBytes() {
        return keyBytes;
    }

    public KeyType getKeyType() {
        return keyType;
    }
}

enum KeyType {
    AES,
    RSA
}
