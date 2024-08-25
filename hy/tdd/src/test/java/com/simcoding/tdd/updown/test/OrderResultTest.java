package com.simcoding.tdd.updown.test;

import com.simcoding.tdd.updown.OrderResult;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class OrderResultTest {
    
    @Test
    @DisplayName("Start 메시지에 대한 응답으로 생성된 OrderResult 인스턴스는, 내부에 start 타입을 지니고 있다.")
    public void t(){

        assertOrderResultReturnGivenType("start");

    }

    @Test
    @DisplayName("end 메시지에 대한 응답으로 생성된 OrderResult 인스턴스는, 내부에 end 타입을 지니고 있다.")
    public void t1(){

        assertOrderResultReturnGivenType("end");
    }

    @Test
    @DisplayName("숫자 메시지(ingame)에 대한 응답으로 생성된 OrderResult 인스턴스는, 내부에 ingame 타입을 지니고 있다.")
    public void t2(){

        assertOrderResultReturnGivenType("ingame");
    }

    @Test
    @DisplayName("giveup 메시지에 대한 응답으로 생성된 OrderResult 인스턴스는, 내부에 giveup 타입을 지니고 있다.")
    public void t3(){

        assertOrderResultReturnGivenType("giveup");
    }

    private void assertOrderResultReturnGivenType(String start) {
        OrderResult startOrderResult = OrderResult.createMessage(start);
        Assertions.assertEquals(start, startOrderResult.getType());
    }
}
