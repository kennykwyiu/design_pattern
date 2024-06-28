package org.kenny.design.pattern.creational.singleton;

public class T implements Runnable {
    @Override
    public void run() {
//        LazySingleton lazySingleton = LazySingleton.getInstance();
//        LazyDoubleCheckSingleton instance = new LazyDoubleCheckSingleton();
//        StaticInnerClassSingleton instance = StaticInnerClassSingleton.getInstance();
//        System.out.println(Thread.currentThread().getName() + " " + instance);

//        ContainerSingleton.putInstance("object", new Object());
//        Object instance = ContainerSingleton.getInstance("object");


        ThreadLocalInstance instance = ThreadLocalInstance.getInstance();
        System.out.println(Thread.currentThread().getName() + " " + instance);

    }
}
