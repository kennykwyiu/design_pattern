package org.kenny.design.pattern.creational.abstractfactory.cryptographic_library;

public class AESKeyManagementStrategy implements KeyManagementStrategy {
    @Override
    public Key generateKey() {
        return null;
    }

    @Override
    public void storeKey(Key key) {

    }

    // Implement AES key generation and storage
}
