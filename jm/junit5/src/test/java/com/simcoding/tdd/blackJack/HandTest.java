package com.simcoding.tdd.blackJack;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class HandTest {
    @Test
    @DisplayName("카드를 한장 가져옵니다")
    public void t1() {
        Hand hand = new Hand();
        String result = hand.drawCard();
        Assertions.assertEquals("Draw", result);
    }


}
