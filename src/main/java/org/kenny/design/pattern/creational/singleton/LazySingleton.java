package org.kenny.design.pattern.creational.singleton;

public class LazySingleton {
    private static LazySingleton lazySingleton = null;
    private static boolean flag = true;

    public LazySingleton() {
        if (flag) {
            flag = false;
        } else {
            throw new RuntimeException("Singleton cannot be initialized by reflection");
        }
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
