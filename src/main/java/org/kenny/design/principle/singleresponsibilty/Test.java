package org.kenny.design.principle.singleresponsibilty;

public class Test {
    public static void main(String[] args) {
//        Bird bird = new Bird();
//        bird.mainMoveMode("Wild geese");
//        bird.mainMoveMode("Ostrich");

        FlyBird flyBird = new FlyBird();
        flyBird.mainMoveMode("Wild geese");

        WalkBird walkBird = new WalkBird();
        walkBird.mainMoveMode("Ostrich");

    }
}
