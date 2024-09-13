package com.simcoding.tdd.blackJack;

public class Dealer {
    private final Deck deck;

    public Dealer(Deck deck) {
        this.deck = deck;
    }

    public void play() {
        while (getSum() < 17)
            addCard(Deck.drawCard());
    }

    public boolean isBusted() {
        return sum > 21;
    }
}
