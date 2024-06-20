package org.kenny.design.principle.liskovsubstitution.methodoutput;

import java.util.HashMap;

public class Child extends Base{
    @Override
    public HashMap method() {
        HashMap hashMap = new HashMap();
        System.out.println("Child method is working");
        hashMap.put("message", "Child method is working");
        return hashMap;
    }
}
