package com.simcoding.designPattern.mvcPattern;

import com.simcoding.designPattern.mvcPattern.controller.WordRelayController;

import java.util.Scanner;

public class UserTerminalWas {
    private final WordRelayController controller;

    public UserTerminalWas(WordRelayController controller) {
        this.controller = controller;
    }
    // 사용자와 ------ 게임 간의 인터페이스가 정의가 되어 있어야 겠죠?
    public void listen(){

        while(true) {
            Scanner in = new Scanner(System.in);
            String userInput = in.nextLine();
            String[] requestObject = userInput.split(" ");

            //사용자가 입력한 값이, 인터페이스에 맞는지, 프로토콜을 따르는지 검사

            String command = requestObject[0];

            if (command.startsWith("playingGame")) {
                controller.playingGame(requestObject[1]);
            }

            if (command.startsWith("start")) {
                controller.start(requestObject[1]);
            }

            if(command.startsWith("restart")){
                controller.restart(requestObject[1]);
            }

            if(command.startsWith("showPrevWord")){
                controller.showPreviousWord();
            }

            if(command.startsWith("showWelcome")){
                controller.showWelcome();
            }

            if(command.startsWith("showEnd")){
                controller.showEnd();
                break;
            }

        }
    }
}
