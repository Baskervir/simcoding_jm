package com.simcoding.tdd.blackJack;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Deck {

    private final List<Card> cards;

    public Deck() {
        cards = new LinkedList<>();
        String[] colors = {"R", "B"};
        for (String color : colors) {
            for (int i = 1; i <= 10; i++) {
                cards.add(new Card(i, color));
                cards.add(new Card(i, color));
            }
        }

        Collections.shuffle(cards);
    }

    public Card drawCard() {
        return cards.remove(0);
    }

    public int getReaminingCards() {
        return cards.size();
    }
}
