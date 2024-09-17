package com.simcoding.designPattern.mvcPattern;

import com.simcoding.designPattern.mvcPattern.controller.WordRelayController;

import java.util.Scanner;

public class UserTerminalWas {
    private final WordRelayController controller;

    public UserTerminalWas(WordRelayController controller) {
        this.controller = controller;
    }

    public void listen() {
        controller.showGameExplantion();

        Scanner in = new Scanner(System.in);

        while (true) {
            String userInput = in.nextLine();
            String[] requestObject = userInput.split(" ", 2);

            String command = requestObject[0];

            if (command.equals("playingGame") && requestObject.length > 1) {
                controller.playingGame(requestObject[1]);
            } else if (command.equals("start") && requestObject.length > 1) {
                controller.start(requestObject[1]);
            } else if (command.equals("restart") && requestObject.length > 1) {
                controller.restart(requestObject[1]);
            } else if (command.equals("showPrevWord")) {
                controller.showPreviousWord();
            } else if (command.equals("showWelcome")) {
                controller.showWelcome();
            } else if (command.equals("showEnd")) {
                controller.showEnd();
                break;
            } else {
                System.out.println("Unknown command. Please try again.");
            }
        }
    }
}