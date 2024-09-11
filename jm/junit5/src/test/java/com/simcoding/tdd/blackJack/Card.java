package com.simcoding.tdd.blackJack;

public class Card {

    private int card_max_quantity = 20;
    private String cardColor;
    private int cardNum;

    public Card() {}

    public Card(String cardColor, int cardNum) {
        this.cardColor = cardColor;
        this.cardNum = cardNum;
    }

    public String getCardColor() {
        return cardColor;
    }

    public int getCardNum() {
        return cardNum;
    }

    @Override
    public String toString() {
        return cardColor + cardNum;
    }

    public String cardCheck() {
        return toString();
    }

    public int handCheck() {
        return 2;
    }

    public String drawCard() {
        return "Draw";
    }
}
