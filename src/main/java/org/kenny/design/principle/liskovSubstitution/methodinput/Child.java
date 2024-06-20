package org.kenny.design.principle.liskovSubstitution.methodinput;

import java.util.HashMap;
import java.util.Map;

public class Child extends Base {

//    @Override
//    public void method(HashMap map) {
//        System.out.println("Child method is working with HashMap");
//    }

    public void method(Map map) {
        System.out.println("Child method is working with Map");
    }
}
