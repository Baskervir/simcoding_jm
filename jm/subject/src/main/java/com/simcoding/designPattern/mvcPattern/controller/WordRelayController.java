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

    // start startWord
    public void start(String startWord){
        view.startMessage();
        model.updatePreviousWord(startWord);
        view.proptUserToTypeInNextWord();
    }

    // playingGame nextWord   ( 명령어 제시어 )
    public void playingGame(String nextWord) {

        if (model.isCorrectNextWord(nextWord)) {
            model.updatePreviousWord(nextWord);
            view.correctMessage();
        } else {
            view.incorrectMessage();
        }
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

    // restart {word}
    public void restart(String word){

        model.updatePreviousWord(word);
        view.startMessage();

    }
    // showPrevWord
    public void showPreviousWord(){
        String previousWord = model.getPreviousWord();
        view.playingGame(previousWord);
        view.getNextWord(previousWord);
    }

    // showWelcome
    public void showWelcome(){
        view.welcomeMessage();
    }

    public void showEnd(){
        view.endMessage();
    }

    public void showGameExplantion() {
        view.showExplanation();
    }
}
