package com.simcoding.designPattern.mvcPattern.wordRelayServer;

import com.simcoding.designPattern.mvcPattern.controller.WordRelayController;
import com.simcoding.designPattern.mvcPattern.model.WordRelayModel;
import com.simcoding.designPattern.mvcPattern.view.WordRelayView;

import java.util.Scanner;

public class WordRelayServer {
    private WordRelayController controller;
    private Scanner scanner;

    public WordRelayServer() {
        WordRelayModel model = new WordRelayModel();
        WordRelayView view = new WordRelayView();
        this.controller = new WordRelayController(model, view);
        this.scanner = new Scanner(System.in);
    }

    public void startGame() {
        controller.welcomeMessage();
        controller.sendStatus();

        while(true) {
            System.out.println("Enter command: ");
            String input = scanner.nextLine().toLowerCase();
            String[] commands = input.split(" ", 2);
            String command = commands[0];


            if (command.startsWith("start")) {
                if (commands.length > 1) {
                    String startWord = commands[1];
                    controller.startGame(startWord);
                } else {
                    System.out.println("Input start Word.");
                }
            }

            if (command.startsWith("exit")) {
                controller.exitGame();
                break;
            }

            if (command.startsWith("next")) {
                if (commands.length > 1) {
                    String nextWord = commands[1];
                    controller.providedNextWord(nextWord);
                } else {
                    System.out.println("Input next Word.");
                }
            }

            if (command.equalsIgnoreCase("prev")) {
                controller.showPreviousWord();
            }
        }
    }
}