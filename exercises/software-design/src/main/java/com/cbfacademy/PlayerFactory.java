package com.cbfacademy;

public class PlayerFactory {
    /**
     * Creates a new player.
     *
     * @return A new player.
     */
    // public static DicePlayer create() {
    //     return new DicePlayer();
    // }

    public static Player create() {
        return new DicePlayer();  // New modification - Returning a DicePlayer instance which implements Player interface
    }
}
