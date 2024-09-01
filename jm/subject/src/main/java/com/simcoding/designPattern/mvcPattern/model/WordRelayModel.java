package com.simcoding.designPattern.mvcPattern.model;

public class WordRelayModel {
    private String previousWord;
    private String presentWord;

    public WordRelayModel() {
        this.previousWord = null;
        this.presentWord = null;
    }

    public boolean isCorrectNextWord(String newWord) {
        if (previousWord == null) {
            return true;
        }

        return !newWord.isEmpty() && previousWord.charAt(previousWord.length() - 1) == newWord.charAt(0);
    }

    public void updatePreviousWord(String newWord) {
        previousWord = newWord;
    }

    public String getPreviousWord() {
        return previousWord;
    }
}
