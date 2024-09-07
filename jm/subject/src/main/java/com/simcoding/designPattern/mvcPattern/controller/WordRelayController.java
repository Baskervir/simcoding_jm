package com.simcoding.designPattern.mvcPattern.controller;

import com.simcoding.designPattern.mvcPattern.GameManager;
import com.simcoding.designPattern.mvcPattern.model.WordRelayModel;
import com.simcoding.designPattern.mvcPattern.view.WordRelayView;

public class WordRelayController {
    private WordRelayModel model;
    private WordRelayView view;
    private GameManager manager;

    public WordRelayController(WordRelayModel model, WordRelayView view) {
        this.model = model;
        this.view = view;
        this.manager = new GameManager(model, view);
    }

    public void welcomeMessage() {
        view.welcomeMessage();
    }

    public void startGame(String startWord) {
        view.startMessage();
    }

    public void exitGame() {
        view.endMessage();
    }

    public void sendStatus() {
        view.showManual();
    }

    public void providedNextWord(String nextWord) {
        manager.gameProcess(nextWord);
    }

    public void showPreviousWord() {
        model.getPreviousWord();
    }
}
