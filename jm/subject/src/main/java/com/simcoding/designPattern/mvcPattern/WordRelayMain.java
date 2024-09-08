package com.simcoding.designPattern.mvcPattern;

import com.simcoding.designPattern.mvcPattern.controller.WordRelayController;
import com.simcoding.designPattern.mvcPattern.model.WordRelayModel;
import com.simcoding.designPattern.mvcPattern.view.WordRelayView;
import com.simcoding.designPattern.mvcPattern.wordRelayServer.WordRelayServer;

public class WordRelayMain {
    public static void main(String[] args) {

        UserTerminalWas was = new UserTerminalWas(new WordRelayController(new WordRelayModel(), new WordRelayView()));
        was.listen();

    }
}
