package org.kenny.design.pattern.behavioral.templatemethod.example;

abstract class Game {
    abstract void initialize();
    abstract void startPlay();
    abstract void endPlay();

    // Template method
    public final void play() {

        // Initialize the game
        initialize();

        // Start the game
        startPlay();

        // End the game
        endPlay();
    }
}
