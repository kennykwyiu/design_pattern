package org.kenny.design.pattern.behavioral.mediator;

public class Test {
    public static void main(String[] args) {
        User kenny = new User("Kenny");
        User tom = new User("Tom");

        kenny.sendMessage(" Hey! Tom! Let's back to home");
        tom.sendMessage("OK! Kenny");

    }
}
