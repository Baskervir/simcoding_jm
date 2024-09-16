package com.simcoding.designPattern.mvcPattern;

import com.simcoding.designPattern.mvcPattern.controller.WordRelayController;
import com.simcoding.designPattern.mvcPattern.model.WordRelayModel;
import com.simcoding.designPattern.mvcPattern.view.WordRelayView;

public class WordRelayMain {
    public static void main(String[] args) {
        WordRelayModel model = new WordRelayModel();
        WordRelayView view = new WordRelayView();
        WordRelayController controller = new WordRelayController(model, view);
        UserTerminalWas terminal = new UserTerminalWas(controller);

        terminal.listen();
    }
}