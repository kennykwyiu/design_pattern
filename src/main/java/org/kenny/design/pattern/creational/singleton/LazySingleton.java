package org.kenny.design.pattern.creational.singleton;

public class LazySingleton {
    private static LazySingleton lazySingleton = null;

    public LazySingleton() {
    }

    public static LazySingleton getInstance() {
        if (lazySingleton == null) {
            lazySingleton = new LazySingleton();
        }
        return lazySingleton;
    }
}
