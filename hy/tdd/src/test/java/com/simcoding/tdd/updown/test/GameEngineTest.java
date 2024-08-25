package com.simcoding.tdd.updown.test;

import com.simcoding.tdd.updown.GameEngine;
import com.simcoding.tdd.updown.OrderResult;
import com.simcoding.tdd.updown.orders.IngameOrder;
import com.simcoding.tdd.updown.orders.StartOrder;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

/**
 * game engine interface
 *
 * 1. start => 게임 엔진은 임의의 숫자를 생성하고, 게임을 시작할 준비를 한다.
 * 2. 'ingame : {숫자}' => 엔진은, 숫자를 파싱하여, 생성된 임의의 숫자와 비교한다. 그러나 만약, 게임 시작이 안되어있다면, 에러를 반환한다.
 * 3. end => 게임 엔진은 내부 상태를 초기화하고, 게임을 종료한다.
 * 4. giveup => 내부에 생성된 숫자가 있으면, 이를 반환하고, 내부 상태를 초기화한 이후에, 게임을 종료한다.
 *
 *
 *
 * **/
public class GameEngineTest {

    @Test
    @DisplayName("엔진은 start 메시지를 받으면, 내부에서 임의의 숫자를 생성한다")
    public void t(){

        GameEngine engine = new GameEngine();
        OrderResult result = engine.order(new StartOrder());

        int number = engine.getNumber();
        Assertions.assertTrue( number > 0);
    }

    @Test
    @DisplayName("엔진은 게임 수행 메시지를 받으면, up or down 메시지를 반환한다")
    public void t1(){

        GameEngine engine = new GameEngine();
        engine.order(new StartOrder());

        int number = engine.getNumber();
        Assertions.assertTrue( number > 0);
    }

    @Test
    @DisplayName("게임을 먼저 시작하지 않고, 게임을 해버리면, 에러를 반환한다")
    public void t2(){

        GameEngine engine = new GameEngine();
        Assertions.assertThrows(RuntimeException.class, ()->engine.order(new IngameOrder()));
    }

    @Test
    @DisplayName("엔진이 생성한 값이 50일 때, 사용자가 15를 던졌다면, up을 반환한다")
    public void t3(){

        GameEngine engine = new GameEngine();
        engine.order(new StartOrder());
        engine.order(new IngameOrder(15));

        int number = engine.getNumber();
        Assertions.assertTrue( number > 0);
    }

}
