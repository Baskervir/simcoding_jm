package com.simcoding.tdd.calculator;

import com.simcoding.tdd.practice1.calculator.Calculator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Random;

/**
 * 1. 계산기 클래스는 sum 메서드를 제공하며, 두 개의 숫자를 인자로 받아, 합을 반환한다.
 * 2. 계산기 클래스는, multiply 메서드를 제공하며, 두 개의 숫자를 인자로 받아, 곱을 반환한다
 * **/
public class CalculatorTest {
    private IntegerCalculator calc = new IntegerCalculator();

    /**
     * 1. 리팩터링을 할 때, 가장 기본적인 요소 중에 하나가, 중복제거!!!
     *
     * **/

    @Test
    @DisplayName("sum 메서드에 1과 1을 넣으면, 2를 반환한다.")
    public void t1(){

        assertTwoArgsIsTheSameAsExpectedOne(2, 1, 1);

    }
    @Test
    @DisplayName("sum 메서드에 1과 5을 넣으면, 6를 반환한다.")
    public void t2(){

        assertTwoArgsIsTheSameAsExpectedOne(6, 1, 5);

    }

    @Test
    @DisplayName("sum 메서드에 5과 1을 넣으면, 6를 반환한다.")
    public void t3(){

        Assertions.assertEquals(6, calc.sum(5,1));

    }

    @Test
    @DisplayName("sum 메서드에 임의의 값 a와 임의의 값 b를 넣으면, a+b의 값을 반환한다.")
    public void t4(){

        Random rnd = new Random(1234);

        int a = rnd.nextInt();
        int b = rnd.nextInt();

        int result = calc.sum(a,b);
        assertTwoArgsIsTheSameAsExpectedOne(a + b, a, b);

    }

    private void assertTwoArgsIsTheSameAsExpectedOne(int expected, int leftArg, int rightArg) {
        Assertions.assertEquals(expected, calc.sum(leftArg, rightArg));
    }

}
