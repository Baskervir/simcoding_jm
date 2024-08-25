package com.simcoding.tdd.updown.test;

import com.simcoding.tdd.updown.OrderResult;
import com.simcoding.tdd.updown.UpAndDownController;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

/**
 *   컨트롤러는 다음과 같은 작업을 수행할 수 있어야 한다.
 *
 * 1. 사용자 요청이 있으면, 새로운 게임을 시작할 수 있다. 이때, 게임을 시작하고,
 *      '새로운 게임 시작'이라는 메시지를 반환한다.
 * 2. 사용자 요청이 있으면, 게임을 중간에 포기할 수 있다. 다만 이 경우, 값이 무엇인지 알려주어야 한다.
 * 3. 사용자 요청이 있으면, 게임을 종료할 수 있다.
 *      '게임이 종료되었습니다'라는 메시지를 반환한다.
 * 4. 사용자와 게임을 지속할 수 있다
 *      4.1 사용자가 제시한 값이, 생성된 값보다, 큰 경우, up을 반환한다.
 *      4.2 사용자가 제시한 값이, 생성된 값보다 작은 경우, down을 반환한다.
 *
 *
 *      인터페이스 정의
 *    1. 'start' 메시지가 들어오면, 게임을 시작한다.
 *    2. 숫자타입의 값
 *      2.1 만약에 기존에 시작된 게임이 존재하지 않는다면, '게임을 먼저 시작해주세요'"
 *    3. end 메시지가 들어오면, 게임을 종료하고, '게임이 종료되었습니다.' 라는 메시지를 반환한다.
 *    4. giveup 메시지가 들어오면, 게임을 종료하고 'bye' 메시지를 반환한다,
 *         이때, 만약, 진행중인 게임이 있다면, 게임의 답을 함께 반환하여 'bye 10'과 같은 형태로 응답해준다.
 * **/
public class UpAndDownControllerTest {

    public static final UpAndDownController CONTROLLER = new UpAndDownController();

    @Test
    @DisplayName("게임 시작 요청을 받으면, 새로운 게임을 시작하고, '새로운 게임 시작'이라는 메시지를 반환한다")
    public void t(){

        assertReturnTypeIsAsExpected("start", "새로운 게임 시작");

    }

    @Test
    @DisplayName("101이상인 숫자가 들어오면, down을 반환한다")
    public void t1(){

        assertReturnTypeIsAsExpected("101", "down");

    }

    @Test
    @DisplayName("end 메시지가 들어오면, 게임을 종료하고, '게임이 종료되었습니다.' 라는 메시지를 반환한다")
    public void t2(){

        assertReturnTypeIsAsExpected("end", "게임이 종료되었습니다.");

    }

    @Test
    @DisplayName("giveup 메시지가 들어오면, 게임을 종료하고 'bye' 메시지를 반환한다")
    public void t3(){

        assertReturnTypeIsAsExpected("giveup", "bye");

    }

    private void assertReturnTypeIsAsExpected(String giveup, String bye) {
        OrderResult result = CONTROLLER.order(giveup);

        Assertions.assertEquals(bye, result.getMessage());
    }

}
