package com.simcoding.tdd;

import com.simcoding.tdd.controller.GameController;
import com.simcoding.tdd.ui.TerminalUserInterface;
import com.simcoding.tdd.ui.UserInterface;

/**
 * @apiNote Up & Down이란?
 *  게임 시작 시, 임의의 숫자를 생성한 이후, 사용자로부터 숫자를 입력받는다.
 *      1. 만약, 동일한 숫자일 경우, 게임은 종료된다.
 *      2. 만약, 더 높은 숫자를 사용자가 말한 경우, down을 반환한다.
 *      3. 만약, 더 낮은 숫자를 사용자가 말한 경우, up을 반환한다.
 *      4. 가능한 적은 숫자로, 임의의 숫자를 맞춰야 한다.
 *
 * @apiNote 유의사항
 *  1. 0 - 9 외의  값을 입력한 경우, 잘못된 입력이라는 것을 사용자에게 전하고, 다시 숫자를 입력하도록 유도해야 한다.
 *  2. 게임 시작 전, 환경 설정을 통하여, 서버가 생성할 숫자의 최대값을 지정할 수 있어야 한다.
 *      기본 값은 100이며, 설정을 동해, 변경할 수 있다.
 *  3. 게임이 종료되면, 사용자는, 새로운 게임을 시작할 수도 있고, 그대로 게임을 종료할 수도 있다.
 *  4. 사용자가 요청 시, 게임의 정답을 알려주고, 게임을 종료할 수 있다.
 *  5. 콘솔 기반의 게임이지만, 추후엔, 소켓을 이용해, 네트워크 기반 게임을 할 수도 있어야 한다. (***)
 *
 * **/

public class Main {

    public static void main(String[] args) {
        UserInterface ui = new TerminalUserInterface();
        GameController controller = new GameController();

        while(true) {
            String result = controller.order(ui.input());
            ui.out(result);
            if(result.equals("game over")) break;
        }

    }
}