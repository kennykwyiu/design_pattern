package org.kenny.design.principle.liskovSubstitution.methodinput;

import java.util.HashMap;
import java.util.Map;

public class Test {
    public static void main(String[] args) {
        Child child = new Child();
        Map hashMap = new HashMap();
        child.method(hashMap);
    }
}
