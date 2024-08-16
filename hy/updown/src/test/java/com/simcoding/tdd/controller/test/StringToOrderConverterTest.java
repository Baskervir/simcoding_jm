package com.simcoding.tdd.controller.test;

import com.simcoding.tdd.controller.OrderConstant;
import com.simcoding.tdd.controller.StringToOrderConverter;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
/**
 *
 *     GIVE_UP("I am stupid"),
 *     END("end"),
 *     NUMBER_WITH_ARG("^number\\s*:\\s*[0-9]$"),
 *     START("start");
 *
 *
 * **/


class StringToOrderConverterTest {
    StringToOrderConverter converter = new StringToOrderConverter();

    @Test
    @DisplayName("지원하지 않는 값이 들어오면, 에러륿 반환한다.")
    public void t0(){

        assertThrows(RuntimeException.class, ()->converter.convert("start123123"));

    }

    @Test
    @DisplayName("start라는 메시지가 들어오면, OrderConstant.START를 반환한다")
    public void t(){

        OrderConstant start = converter.convert("start");
        assertEquals(OrderConstant.START, start);

    }

    @Test
    @DisplayName("end 메시지가 들어오면, OrderConstant.START를 반환한다")
    public void t1(){

        OrderConstant start = converter.convert("end");
        assertEquals(OrderConstant.END, start);

    }

    @Test
    @DisplayName("number : 숫자 형태의 값이 들어오면, OrderConstant.START를 반환한다")
    public void t2(){

        OrderConstant start = converter.convert("number : 1");
        assertEquals(OrderConstant.NUMBER_WITH_ARG, start);

    }


}