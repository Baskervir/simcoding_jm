package com.simcoding.designPattern.mvcPattern.view;

public class WordRelayView {

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

    public void showManual() {
        System.out.println("1. Start {word}");
        System.out.println("2. exit");
        System.out.println("3. Next {word}");
    }

    public void playingGame(String previousWord) {
        System.out.println("Previous word: " + previousWord);
        System.out.print("Enter next word: ");
    }

    public String getNextWord() {
        return " ";
    }
}
