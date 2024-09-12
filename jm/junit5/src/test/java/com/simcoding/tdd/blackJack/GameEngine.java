package com.simcoding.tdd.blackJack;

public class GameEngine {
    private final Deck deck;
    private final Hand playerHand;
    private final Dealer dealer;

    public GameEngine() {
        this.deck = new Deck();
        this.playerHand = new Hand();
        this.dealer = new Dealer(Deck);
        dealInitialCard();
    }

    private void dealInitialCard() {
        for (int i = 0; i < 2; i++) {
            playerHand.addCard(deck.drawCard());
            dealer.addCard(deck.drawCard());
        }
    }

    public void dealerPlay() {
        dealer.play();
    }

    public Hand getPlayerHand() {
        return playerHand;
    }

    public Dealer getDealer() {
        return dealer;
    }

    public String determineWinner() {
        if (playerHand.isBusted()) {
            return "You Lose";
        }
        if (dealer.isBusted()) {
            return "You Win";
        }

        int playerSum = playerHand.getSum();
        int dealerSum = dealer.getSum();

        if (playerSum > dealerSum) {
            return "You Win";
        } else if (dealerSum > playerSum) {
            return "You Lose";
        } else {
            if (playerHand.getCardCount() < dealer.getCardCount()) {
                return "You Win";
            } else if (dealer.getCardCount() < playerHand.getCardCount()) {
                return "You Lose";
            } else {
                Card playerSmallest = playerHand.getSmallestCard();
                Card dealerSmallest = dealer.getSmallestCard();
                if (playerSmallest.getValue() < dealerSmallest.getValue()) {
                    return "You Win";
                } else if (dealerSmallest.getValue() < playerSmallest.getValue()) {
                    return "You Lose";
                } else {
                    return "Draw";
                }
            }
        }
    }
}
