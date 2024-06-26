package org.kenny.design.pattern.creational.singleton;

import java.io.*;
import java.util.Objects;

public class Test {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
//        LazySingleton lazySingleton = LazySingleton.getInstance();

//        Thread t1 = new Thread(new T());
//        Thread t2 = new Thread(new T());
//        t1.start();
//        t2.start();
//
//        System.out.println("Program end");

        HungrySingleton instance = HungrySingleton.getInstance();
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("singleton file"));
        oos.writeObject(instance);

        File file = new File("singleton file");
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file));

        HungrySingleton newInstance = (HungrySingleton) ois.readObject();

        System.out.println(instance);
        System.out.println(newInstance);

        System.out.println(Objects.equals(instance, newInstance));
    }
}
