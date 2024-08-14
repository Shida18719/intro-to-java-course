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
        Player player1 = PlayerFactory.create();
        Player player2 = PlayerFactory.create();
        return new DiceGame(player1, player2);  // New modification - Returning a DiceGame instance which implements Game interface
    }
}
