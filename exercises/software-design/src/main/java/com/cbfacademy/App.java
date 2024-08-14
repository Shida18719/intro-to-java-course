package com.cbfacademy;

public class App {
    public static void main(String[] args) {
        SimpleContainer container = initializeContainer();
        // Player player1 = PlayerFactory.create();
        // Player player2 = PlayerFactory.create();
        // Remove PlayerFactory.create() - Retrieve the Player instances from the container
        

        //  Game game = GameFactory.create(player1, player2); // Modified to Game rather than DiceGame

        // Replace GameFactory.create() - Retrieve the Game instance from the container
        Game game = container.get(Game.class); 

        String winner = game.play();

        if (winner == null) {
            System.out.println("It's a draw!");
        } else {
            System.out.println(winner + " wins!");
        }
    }

    private static SimpleContainer initializeContainer() {
        SimpleContainer container = new SimpleContainer();

        // Register mappings for any required interfaces with their concrete implementations

        container.register(Game.class, DiceGame.class);

        container.register(Player.class, DicePlayer.class);
        return container;
    }


}
