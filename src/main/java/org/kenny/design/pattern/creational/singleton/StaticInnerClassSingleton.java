package org.kenny.design.pattern.creational.singleton;

public class StaticInnerClassSingleton {
    private static class InnerClass {
        private static StaticInnerClassSingleton staticInnerClassSingleton
                = new StaticInnerClassSingleton();
    }
    public static StaticInnerClassSingleton getInstance() {
        return InnerClass.staticInnerClassSingleton;
    }
    private StaticInnerClassSingleton() {
        if (InnerClass.staticInnerClassSingleton != null) {
            throw new RuntimeException("Singleton cannot be initialized by reflection");
        }
    }
}
