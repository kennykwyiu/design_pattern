package org.kenny.design.pattern.creational.singleton;

import java.io.*;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Objects;

public class Test {
    public static void main(String[] args) throws IOException, ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
//        LazySingleton lazySingleton = LazySingleton.getInstance();

//        Thread t1 = new Thread(new T());
//        Thread t2 = new Thread(new T());
//        t1.start();
//        t2.start();
//
//        System.out.println("Program end");


//        HungrySingleton instance = HungrySingleton.getInstance();
//        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("singleton file"));
//        oos.writeObject(instance);
//
//        File file = new File("singleton file");
//        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file));
//
//        HungrySingleton newInstance = (HungrySingleton) ois.readObject();
//
//        System.out.println(instance);
//        System.out.println(newInstance);
//
//        System.out.println(Objects.equals(instance, newInstance));


////        Class objectClass = HungrySingleton.class;
//        Class objectClass = LazySingleton.class;
////        Class<?> aClass = Class.forName(HungrySingleton.class.getName());
//
//        Constructor constructor = objectClass.getDeclaredConstructor();
//        constructor.setAccessible(true);
//
////        HungrySingleton instance = HungrySingleton.getInstance();
////        HungrySingleton object = (HungrySingleton) constructor.newInstance();
//
//        LazySingleton instance = LazySingleton.getInstance();
//        LazySingleton object = (LazySingleton) constructor.newInstance();
//        System.out.println(instance);
//        System.out.println(object);
//
//        System.out.println(Objects.equals(instance, object));


        EnumInstance instance = EnumInstance.getInstance();
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("singleton file"));
        oos.writeObject(instance);

        File file = new File("singleton file");
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file));

        EnumInstance newInstance = (EnumInstance) ois.readObject();

        System.out.println(instance);
        System.out.println(newInstance);

        System.out.println(Objects.equals(instance, newInstance));

    }
}
