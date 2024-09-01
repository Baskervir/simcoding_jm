package com.simcoding.designPattern.mvcPattern.controller;

import com.simcoding.designPattern.mvcPattern.model.WordRelayModel;
import com.simcoding.designPattern.mvcPattern.view.WordRelayView;

public class WordRelayController {
    private WordRelayModel model;
    private WordRelayView view;

    public WordRelayController(WordRelayModel model, WordRelayView view) {
        this.model = model;
        this.view = view;
    }

    public void execute() {
        view.welcomeMessage();

        String startWord = view.settingGame();
        model.updatePreviousWord(startWord);
        view.startMessage();

        while (true) {
            String previousWord = model.getPreviousWord();
            view.playingGame(previousWord);

            String newWord = view.getNextWord(previousWord);

            if (model.isCorrectNextWord(newWord)) {
                model.updatePreviousWord(newWord);
                view.correctMessage();
            } else {
                view.incorrectMessage();
            }

            if (newWord.equalsIgnoreCase("end")) {
                view.endMessage();
                break;
            }

            if (newWord.equalsIgnoreCase("restart")) {
                execute();
            }

            if (newWord.equalsIgnoreCase("끝")) {
                view.endMessage();
                break;
            }

            if (newWord.equalsIgnoreCase("재시작")) {
                execute();
            }

        }
    }
}
