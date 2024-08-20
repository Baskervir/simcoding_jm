package com.simcoding.tdd.calculator;

import com.simcoding.tdd.IntegerCalculator.IntegerCalculator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class CalculatorTest {
    public static final IntegerCalculator calc = new IntegerCalculator();
    /*
    * 1. 계산기 클래스는 sum 메서드를 제공하며, 두 개의 숫자를 인자로 받아, 합을 반환한다.
    * 2. 계산기 클래스는, multiply 메서드를 제공하며, 두 개의 숫자를 인자로 받아, 곱을 반환한다.
    * */

    /*
    * 1. 리팩터링을 할 때, 가장 기본적인 요수 중에 하나가, 중복제거!
    * */

    @Test
    @DisplayName("sum 메서드에 1과 1을 넣으면, 2를 반환한다.")
    public void t1() {
        int result = calc.sum(1,1);
        Assertions.assertEquals(2, result);
    }

    @Test
    @DisplayName("sum 메서드에 1과 5를 넣으면, 6를 반환한다.")
    public void t2() {
        int result = calc.sum(1,5);
        Assertions.assertEquals(6, result);
    }

    @Test
    @DisplayName("sum 메서드에 5와 1을 넣으면, 6를 반환한다.")
    public void t3() {
        int result = calc.sum(5, 1);
        Assertions.assertEquals(6, result);
    }

    @Test
    @DisplayName("sum 메서드에 1과 1을 넣으면, 2를 반환한다.")
    public void t4() {
        int result = calc.sum(5, 1);
        Assertions.assertEquals(6, result);
    }
}
