package com.simcoding.tdd.blackJack;

import java.util.ArrayList;
import java.util.List;

public class Hand {
    private final List<Card> cards = new ArrayList<>();
    private int sum = 0;

    public void addCard(Card card) {
        cards.add(card);
        sum += card.getCardNum();
    }

    public int getSum() {
        return sum;
    }

    public List<Card> getCards() {
        return new ArrayList<>(cards);
    }

    public boolean isBusted() {
        return sum > 21;
    }

    public int getCardCount() {
        return cards.size();
    }

    public Card getSmallestCard() {
        return cards.stream().min((c1, c2) -> Integer.compare(c1.getCardNum(), c2.getCardNum())).orElse(null);
    }
}
