package com.simcoding.tdd.controller.engine;

import java.util.Random;

public class GameEngine {

    private final int configValue;
    private Integer randomNum;

    private final RandomNumberGenerator generator;


    public GameEngine(int configValue) {
        this.configValue = configValue;
        this.generator = new RandomNumberGenerator();
    }
    public GameEngine() {
        this.configValue = 100;
        this.generator = new RandomNumberGenerator();
    }

    public GameEngine(RandomNumberGenerator generator){
        this.generator = generator;
        this.configValue = 100;
    }


    public void start() {
        this.randomNum = generator.getRandomNumber(this.configValue);
    }

    public int getRandomNumber() {
        return this.randomNum;
    }

    public String evaluate(int num) {
        if(this.randomNum == null) throw new IllegalStateException();
        if(this.randomNum == num) return "ok";
        return this.randomNum > num ? "up" : "down";
    }

    public int stop() {
        int result = this.randomNum;
        this.randomNum = 0;
        return result;
    }
}
