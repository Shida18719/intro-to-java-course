package com.cbfacademy;

public class GameFactory {

    /**
     * Creates a new dice game.
     *
     * @return A dice game.
     */
    // public static DiceGame create() {
    //     return new DiceGame();
    // }

    public static Game create() {
        return new DiceGame();  // New modification - Returning a DiceGame instance which implements Game interface
    }
}
