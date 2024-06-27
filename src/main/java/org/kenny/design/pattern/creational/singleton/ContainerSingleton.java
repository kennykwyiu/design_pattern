package org.kenny.design.pattern.creational.singleton;


import jdk.internal.joptsimple.internal.Strings;

import java.util.HashMap;
import java.util.Map;

public class ContainerSingleton {
    private static Map<String, Object> singletonMap = new HashMap<>();

    public static void putInstance(String key, Object instance) {
        if (!Strings.isNullOrEmpty(key) && instance != null) {
            if (!singletonMap.containsKey(key)) {
                singletonMap.put(key, instance);
            }
        }
    }


}
