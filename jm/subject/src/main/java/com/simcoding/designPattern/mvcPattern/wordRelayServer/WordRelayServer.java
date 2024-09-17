package com.simcoding.designPattern.mvcPattern.wordRelayServer;

import com.simcoding.designPattern.mvcPattern.controller.WordRelayController;
import com.simcoding.designPattern.mvcPattern.model.WordRelayModel;
import com.simcoding.designPattern.mvcPattern.view.WordRelayView;

import java.util.Scanner;

public class WordRelayServer {
    private final WordRelayController controller;
    private final Scanner scanner;

    public WordRelayServer() {
        WordRelayModel model = new WordRelayModel();
        WordRelayView view = new WordRelayView();
        this.controller = new WordRelayController(model, view);
        this.scanner = new Scanner(System.in);
    }

    public void startGame() {
        controller.showWelcome();
        controller.showGameExplantion();

        while (true) {
            System.out.println("Enter command: ");
            String input = scanner.nextLine().trim().toLowerCase();
            String[] commands = input.split(" ", 2);
            String command = commands[0];

            if (command.equals("start")) {
                if (commands.length > 1) {
                    String startWord = commands[1];
                    controller.start(startWord);
                } else {
                    System.out.println("Input start Word.");
                }
            } else if (command.equals("exit")) {
                controller.showEnd();
                break;
            } else if (command.equals("next")) {
                if (commands.length > 1) {
                    String nextWord = commands[1];
                    controller.playingGame(nextWord);
                } else {
                    System.out.println("Input next Word.");
                }
            } else if (command.equals("prev")) {
                controller.showPreviousWord();
            } else if (command.equals("showwelcome")) {
                controller.showWelcome();
            } else if (command.equals("showend")) {
                controller.showEnd();
                break;
            } else {
                System.out.println("Unknown command. Please try again.");
            }
        }
    }
}