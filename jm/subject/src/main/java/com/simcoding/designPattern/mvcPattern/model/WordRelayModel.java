package com.simcoding.designPattern.mvcPattern.model;

public class WordRelayModel {
    private String previousWord;
    private boolean gameRun;

    public WordRelayModel() {
        this.previousWord = null;
        this.gameRun = false;
    }

    public void startGame(String startWord) {
        this.previousWord = startWord;
        this.gameRun = true;
    }

    public void exitGame() {
        this.gameRun = false;
    }

    public boolean isGameRun() {
        return gameRun;
    }

    public boolean isCorrectNextWord(String newWord) {
        if (previousWord == null) {
            return true;
        }

        return !newWord.isEmpty() && previousWord.charAt(previousWord.length() - 1) == newWord.charAt(0);
    }

    public void updatePreviousWord(String nextWord) {
        previousWord = nextWord;
    }

    public String getPreviousWord() {
        return previousWord;
    }
}
