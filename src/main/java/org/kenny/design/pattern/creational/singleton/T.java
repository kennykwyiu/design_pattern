package org.kenny.design.pattern.creational.singleton;

public class T implements Runnable {
    @Override
    public void run() {
//        LazySingleton lazySingleton = LazySingleton.getInstance();
        LazyDoubleCheckSingleton lazyDoubleCheckSingleton = new LazyDoubleCheckSingleton();
        System.out.println(Thread.currentThread().getName() + " " + lazyDoubleCheckSingleton);
    }
}
