package org.kenny.design.pattern.creational.abstractfactory.cryptographic_library;

public interface KeyManagementStrategy {
    Key generateKey();
    void storeKey(Key key);
}
