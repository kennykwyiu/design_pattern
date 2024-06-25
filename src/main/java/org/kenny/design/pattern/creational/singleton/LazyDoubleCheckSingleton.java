package org.kenny.design.pattern.creational.singleton;

public class LazyDoubleCheckSingleton {
    private volatile static LazyDoubleCheckSingleton lazyDoubleCheckSingleton = null;

    public LazyDoubleCheckSingleton() {
    }

    public static LazyDoubleCheckSingleton getInstance() {

        if (lazyDoubleCheckSingleton == null) {
            synchronized (LazyDoubleCheckSingleton.class) {
                if (lazyDoubleCheckSingleton == null) {
                    lazyDoubleCheckSingleton = new LazyDoubleCheckSingleton();
                    // 1. allocate memory to lazyDoubleCheckSingleton object
                    // 2. initialize
                    // 3. assign lazyDoubleCheckSingleton to allocated memory
                    // maybe change the operation order as 1 -> 3 -> 2
                    // intra-thread semantics
                    // are the semantics for single-threaded programs,
                    // and allow the complete prediction of the behavior of a thread
                    // based on the values seen by read actions within the thread.
                }
            }
        }
        return lazyDoubleCheckSingleton;

    }
}
