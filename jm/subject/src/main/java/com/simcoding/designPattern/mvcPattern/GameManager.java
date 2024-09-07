package com.simcoding.designPattern.mvcPattern;

import com.simcoding.designPattern.mvcPattern.model.WordRelayModel;
import com.simcoding.designPattern.mvcPattern.view.WordRelayView;

public class GameManager {
    private WordRelayModel model;
    private WordRelayView view;

    public GameManager(WordRelayModel model, WordRelayView view) {
        this.model = model;
        this.view = view;
    }

    public void execute() {
        view.startMessage();
        String previousWord = model.getPreviousWord();
        while (model.isGameRun()) {
            view.playingGame(previousWord);
            String nextWord = view.getNextWord();

            if (model.isCorrectNextWord(nextWord)) {
                model.updatePreviousWord(nextWord);
                view.correctMessage();
            } else {
                view.incorrectMessage();
            }

        }
    }

    public void gameProcess(String nextWord) {
        if (model.isCorrectNextWord(nextWord)) {
            model.updatePreviousWord(nextWord);
            view.correctMessage();
        } else {
            view.incorrectMessage();
        }
    }
}
