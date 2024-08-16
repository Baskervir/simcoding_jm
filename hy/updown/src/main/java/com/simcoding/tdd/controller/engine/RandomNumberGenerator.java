package com.simcoding.tdd.controller.engine;

import java.util.Random;

public class RandomNumberGenerator {
    private Integer setNum;
    public int getRandomNumber(int max){
        if(setNum != null) return setNum;
        Random randomGenerater = new Random(max);
        return randomGenerater.nextInt(max);
    }

    public void setNum(int num){
        this.setNum = num;
    }
}
