package com.simcoding.tdd.practice1;
import com.simcoding.tdd.practice1.calculator.Calculator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
public class CalculatorTest {

    /**
     * 계산기 클래스를 개발.
     * **/

    Calculator calc;

    @BeforeEach
    public void init(){
        this.calc = new Calculator();
    }
    
    @Test
    @DisplayName("두 개의 인자로 1과 1를 받으면, 2를 반환한다")
    public void t(){

        assertTheSumOfTwoArgsIsTheSameAsExpectedValue(1, 1, 2);
    }

    @Test
    @DisplayName("두 개의 인자로 1과 2를 받으면, 3을 반환한다")
    public void t1(){

        assertTheSumOfTwoArgsIsTheSameAsExpectedValue(1, 2, 3);
    }

    @Test
    @DisplayName("두 개의 인자로 1과 2를 받으면, 3을 반환한다")
    public void t2(){

        assertTheSumOfTwoArgsIsTheSameAsExpectedValue(2, 1, 3);
    }

    @Test
    @DisplayName("두 개의 인자로 10과 0를 받으면, 10을 반환한다")
    public void t3(){

        assertTheSumOfTwoArgsIsTheSameAsExpectedValue(10, 0, 10);
    }

    @Test
    @DisplayName("두 개의 인자로 10_00_000_000과 20_00_000_000과 받으면, 30_00_000_000을 반환한다")
    public void t4(){

        assertTheSumOfTwoArgsIsTheSameAsExpectedValue(10_00_000_000,20_00_000_000, 30_00_000_000L);
    }

    private void assertTheSumOfTwoArgsIsTheSameAsExpectedValue(long left, long left1, long expected) {
        long result = calc.sum(left, left1);
        Assertions.assertEquals(expected, result);
    }

}
