package com.simcoding.tdd.blackJack;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class DeckTest {
    @Test
    @DisplayName("현재 카드뭉치의 카드 수는 20장 입니다")
    public void t1() {
        Deck deck = new Deck();
        int result = deck.checkDeck();
        Assertions.assertEquals(20, result);
    }
}
//    @Test
//    @DisplayName("카드를 나누어 주면 카드뭉치의 수량이 줄어듭니다")
//    public void t2() {
//        Deck deck = new Deck();
//        Card card = new Card();
//        int result = deck.checkDeck();
//        Assertions.assertEquals(19, result);
//    }

