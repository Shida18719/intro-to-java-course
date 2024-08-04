package com.cbfacademy;

public class App {
    public static void main(String[] args) {
        // DiceGame game = GameFactory.create();
        Game game = GameFactory.create();
        String winner = game.play();

        if (winner == null) {
            System.out.println("It's a draw!");
        } else {
            System.out.println(winner + " wins!");
        }
    }
}