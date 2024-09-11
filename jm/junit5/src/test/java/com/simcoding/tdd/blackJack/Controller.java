package com.simcoding.tdd.blackJack;

import java.util.Scanner;

public class Controller {
    private final GameEngine gameEngine;
    private final Scanner scanner;

    public Controller() {
        this.gameEngine = new GameEngine();
        this.scanner = new Scanner(System.in);
    }

    public void startGame() {
        System.out.println("Game Start");

        while (true) {
            System.out.println("Your Hand : " + gameEngine.getPlayerHand().getCards() + "(Sum : " + gameEngine.getPlayerHand().getSmallestCard() + ")");
            System.out.println("Dealer's Hand : " + gameEngine.getDealer().getCard().get(0) + " and hidden Card");

            if (gameEngine.getPlayerHand().isBusted()) {
                System.out.println("You Busted");
                break;
            }

            System.out.println("Draw a Card? (yes/no)");
            String input = scanner.nextLine();
            if (input.equals("yes")) {
                gameEngine.playerDrawCard();
            } else {
                break;
            }
        }

        gameEngine.dealerPlay();

        System.out.println("Dealer's Hand : " + gameEngine.getDealer().getCard() + " (Sum : " + gameEngine.getDealer().getSum() + ")");
        System.out.println(gameEngine.determineWinner());
    }
}
