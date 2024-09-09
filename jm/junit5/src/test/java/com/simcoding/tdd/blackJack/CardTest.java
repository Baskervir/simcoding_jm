package com.simcoding.tdd.blackJack;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class CardTest {
    @Test
    @DisplayName("카드는 'R5'입니다")
    public void t1() {
        Card card = new Card("R", 5);
        String result = card.cardCheck();
        Assertions.assertEquals("R5", result);
    }

    @Test
    @DisplayName("현재 카드는 2장 입니다")
    public void t2() {
        Card card = new Card();
        int result = card.handCheck();
        Assertions.assertEquals(2, result);
    }

    @Test
    @DisplayName("카드를 추가합니다")
    public void t3() {
        Card card = new Card();
        String result = card.drawCard();
        Assertions.assertEquals("Draw", result);
    }
}
