package org.kenny.design.principle.singleresponsibilty;

public class Bird {
    public void mainMoveMode(String birdName) {
        if ("Ostrich".equals(birdName)) {
            System.out.println(birdName + " walk by legs");
        } else {
            System.out.println(birdName + " fly by wings");
        }
    }
}
