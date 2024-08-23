package com.simcoding.tdd.controller.engine.tests;

import com.simcoding.tdd.controller.engine.GameEngine;
import com.simcoding.tdd.controller.engine.RandomNumberGenerator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

/**
 * 1. START 명령 수신 시, 임의의 숫자를 생성한다.
 * 2. 1번 맞아?의 요청을 받으면, 내부에 생성된 숫자와 비교하여, up or down을 반환한다
 * 3. 강제 종료 메시지를 수신하면, 내부의 숫자를 반환하고, 기존에 존재하는 게임의 상태를 초기화한다.
 * 4. 엔진은 임의의 숫자 생성 시, 기본값이 100이며, 설정 가능한 최대값을 넘어서는 안된다.
 * ## 동시성 프로그래밍
 *
 * **/
public class GameEngineTest {

    @Test
    @DisplayName("엔진은, start 명령을 수신하면, 내부에 임의의 숫자를 생성한다.")
    public void t(){

        GameEngine engine = new GameEngine();
        engine.start();

        int value = engine.getRandomNumber();
        Assertions.assertTrue(value <= 100);
    }
    
    @Test
    @DisplayName("엔진은 생성된 값보다 작은 값이 들어오면, down을 반혼한다")
    public void t2(){
        RandomNumberGenerator mockGenerator = new RandomNumberGenerator();
        mockGenerator.setNum(85);

        GameEngine engine = new GameEngine(mockGenerator);
        engine.start();

        String result = engine.evaluate(80);

        assertEquals("up", result);
    }

    @Test
    @DisplayName("엔진은 생성된 값과 동일한 값이 들어오면 ok를 반환한다")
    public void t2_1(){
        RandomNumberGenerator mockGenerator = new RandomNumberGenerator();
        mockGenerator.setNum(85);

        GameEngine engine = new GameEngine(mockGenerator);
        engine.start();

        String result = engine.evaluate(85);

        assertEquals("ok", result);
    }

    @Test
    @DisplayName("엔진은 생성된 값보다 큰 값이 들어오면, up을 반혼한다")
    public void t3(){

        GameEngine engine = new GameEngine();
        engine.start();

        String result = engine.evaluate(101);

        assertEquals("down", result);
    }

    @Test
    @DisplayName("강제 종료 메시지를 수신하면, 내부 값을 반환하고, 상태를 초기화한다")
    public void t4(){
        RandomNumberGenerator mockGenerator = new RandomNumberGenerator();
        mockGenerator.setNum(85);

        GameEngine engine = new GameEngine(mockGenerator);
        engine.start();

        int value = engine.stop();
        assertEquals(85, value);
    }

    @Test
    @DisplayName("엔진의 초기화가 안되어 있는 상태에서, evaluate 호출 시, IllegalStateException 반환한다")
    public void t5(){

        GameEngine engine = new GameEngine();
        assertThrows(IllegalStateException.class ,()->engine.evaluate(0));

    }
    
    
}
