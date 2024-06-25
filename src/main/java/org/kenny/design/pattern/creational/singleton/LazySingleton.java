package org.kenny.design.pattern.creational.singleton;

public class LazySingleton {
    private static LazySingleton lazySingleton = null;

    public LazySingleton() {
    }

    public synchronized static LazySingleton getInstance() {
//        synchronized (LazySingleton.class) {

        if (lazySingleton == null) {
            lazySingleton = new LazySingleton();
        }
        return lazySingleton;

//        }
    }
}
