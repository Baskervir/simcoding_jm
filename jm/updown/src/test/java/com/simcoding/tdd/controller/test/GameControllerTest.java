package com.simcoding.tdd.controller.test;

import com.simcoding.tdd.controller.GameController;
import com.simcoding.tdd.controller.engine.GameEngine;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class GameControllerTest {

    @Test
    @DisplayName("사용자로부터, start라는 메시지를 받으면, 유저에게 게임시작이 되었음을 알리고, 게임을 시작한다.")
    public void t(){
        GameController console = new GameController();
        String response = console.order("start");
        assertEquals("game start!!", response);
    }

    @Test
    @DisplayName("star와 같이 잘못된 명령이 들어온 경우, 사용자에게 잘못된 명령이라는 것을 통지한다")
    public void t2(){

        GameController console = new GameController();
        String response = console.order("star");
        assertEquals("unsupported order", response);

    }

    @Test
    @DisplayName("'number : 1' 메시지가 들어오면, controller는, 입력으로 주어진 값에서, 숫자를 파싱하여, 리턴한다.")
    public void t3(){

        GameEngine mockEngine = new GameEngine(1);
        mockEngine.start();

        GameController console = new GameController(mockEngine);
        String response = console.order("number : 2");
        assertTrue(response.equals("down") );

    }

    @Test
    @DisplayName("사용자로부터 'I am stupid' 라는 메시지를 받으면,  게임 종료 메시지를 보낸다.")
    public void t4(){

        GameController console = new GameController();
        String response = console.order("I am stupid");
        assertEquals("game over", response);

    }

    @Test
    @DisplayName("사용자로부터 'end' 라는 메시지를 받으면,  게임 종료 메시지를 보낸다.")
    public void t5(){

        GameController console = new GameController();
        String response = console.order("end");
        assertEquals("game over", response);

    }
    
    @Test
    @DisplayName("사용자 game을 시작한 이후, 별도의 설정 없이 105를 호출하면, down을 반환한다")
    public void t6(){

        GameController console = new GameController();
        console.order("start");

        String order = console.order("number : 105");
        assertEquals("down", order);

    }


}
