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

    // start startWord
    public void start(String startWord){
        view.startMessage();
        model.updatePreviousWord(startWord);
    }

    // playingGame nextWord   ( 명령어 제시어 )
    public void playingGame(String nextWord){
        if (model.isCorrectNextWord(nextWord)) {
            model.updatePreviousWord(nextWord);
            view.correctMessage();
        } else {
            view.incorrectMessage();
        }
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

}
