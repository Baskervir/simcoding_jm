package com.simcoding.tdd;

import com.simcoding.tdd.calculator.Calculator;

public class Main {

    public static void main(String[] args) {
        Calculator calc = new Calculator();
        long sum = calc.sum(1, 1);
        System.out.println(sum);
    }
}