package com.simcoding.design.strategy.character.view;

import com.simcoding.design.strategy.character.controller.ClientResult;

public interface UserInterface {
    void outMap(ClientResult result);
    void outInitCompletedMessage();
    void outInvalidCommand(String invalidCommand);
    void outGameEndMessage();
}
