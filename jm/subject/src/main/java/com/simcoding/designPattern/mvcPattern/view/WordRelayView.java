package com.simcoding.designPattern.mvcPattern.view;

import java.util.Scanner;

public class WordRelayView {
    private Scanner sc;

    public WordRelayView() {
        sc = new Scanner(System.in);
    }

    public String settingGame() {
        System.out.println("If you want Start Game. Please input first Word.");
        System.out.print("Input Start Word : ");
        return sc.nextLine();
    }

    public void playingGame(String previousWord) {
        if (previousWord == null) {
            System.out.println("If you want Start Game. Input first Word.");
        } else {
            System.out.println("Previous word is : " + previousWord);
        }
    }

    public void getNextWord(String previousWord) {
        System.out.print("Input next Word :");
    }

    public void sendStatusMessage(String status) {
        System.out.println();
    }

    public void welcomeMessage() {
        System.out.println("=== === === === === === === ===");
        System.out.println("===  Welcome to WordRelay   ===");
        System.out.println("=== === === === === === === ===");
    }

    public void endMessage() {
        System.out.println("=== === === === === === === ===");
        System.out.println("===  Thank you for Playing  ===");
        System.out.println("=== === === === === === === ===");
    }

    public void startMessage() {
        System.out.println(" _____  _                 _   \n" +
                "/  ___|| |               | |  \n" +
                "\\ `--. | |_   __ _  _ __ | |_ \n" +
                " `--. \\| __| / _` || '__|| __|\n" +
                "/\\__/ /| |_ | (_| || |   | |_ \n" +
                "\\____/  \\__| \\__,_||_|    \\__|");
    }

    public void correctMessage() {
        System.out.println(" _____                                 _   \n" +
                "/  __ \\                               | |  \n" +
                "| /  \\/  ___   _ __  _ __   ___   ___ | |_ \n" +
                "| |     / _ \\ | '__|| '__| / _ \\ / __|| __|\n" +
                "| \\__/\\| (_) || |   | |   |  __/| (__ | |_ \n" +
                " \\____/ \\___/ |_|   |_|    \\___| \\___| \\__|");
    }

    public void incorrectMessage() {
        System.out.println(" _____                                              _   \n" +
                "|_   _|                                            | |  \n" +
                "  | |   _ __    ___   ___   _ __  _ __   ___   ___ | |_ \n" +
                "  | |  | '_ \\  / __| / _ \\ | '__|| '__| / _ \\ / __|| __|\n" +
                " _| |_ | | | || (__ | (_) || |   | |   |  __/| (__ | |_ \n" +
                " \\___/ |_| |_| \\___| \\___/ |_|   |_|    \\___| \\___| \\__|");
    }

    public void showExplanation() {
        System.out.println("hello choose what youi want");
        System.out.println("1. gameStart");
        System.out.println("2. game restart");
        System.out.println("if you want to play a game, press start!!!!");
    }

    public void proptUserToTypeInNextWord() {
        System.out.println("what is your next word????");
        System.out.println("1. showPrevWord to show the prev one");
        System.out.println("2. showEnd");
        System.out.println("3. playingGame nextWord");
    }
}
