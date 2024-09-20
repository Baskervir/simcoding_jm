package com.simcoding.designPattern.mvcPattern.controller;

import com.simcoding.designPattern.mvcPattern.model.WordRelayModel;
import com.simcoding.designPattern.mvcPattern.view.WordRelayView;

public class WordRelayController {
    private final WordRelayModel model;
    private final WordRelayView view;

    public WordRelayController(WordRelayModel model, WordRelayView view) {
        this.model = model;
        this.view = view;
    }

    public void showWelcome() {
        view.welcomeMessage();
    }

    public void showGameExplantion() {
        view.showManual();
    }

    public void start(String startWord) {
        model.startGame(startWord);
        view.startMessage();
    }

    public void playingGame(String word) {
        if (model.isGameRun() && model.isCorrectNextWord(word)) {
            model.updatePreviousWord(word);
            view.correctMessage();
        } else {
            view.incorrectMessage();
        }
    }

    public void showPreviousWord() {
        String previousWord = model.getPreviousWord();
        view.playingGame(previousWord);
    }

    public void showEnd() {
        view.endMessage();
    }

    public void restart(String startWord) {
        model.exitGame();
        start(startWord);
    }
}