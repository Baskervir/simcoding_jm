package com.simcoding.design.strategy.character.controller;

import com.simcoding.design.strategy.character.externals.ExternalServiceSubject;
import com.simcoding.design.strategy.character.model.Direction;
import com.simcoding.design.strategy.character.model.MainCharacter;
import com.simcoding.design.strategy.character.model.moves.FootStretegy;
import com.simcoding.design.strategy.character.model.moves.ReportDecorator;
import com.simcoding.design.strategy.character.view.TerminalBasedUi;
import com.simcoding.design.strategy.character.view.UserInterface;

public class CharacterController {

    private MainCharacter character;
    private UserInterface ui = new TerminalBasedUi();
    private ExternalServiceSubject subject = new ExternalServiceSubject();

    public void move(String command){

        if(command.equals("INIT")) {
            this.character = new MainCharacter(new ReportDecorator(new FootStretegy()));
            this.ui.outInitCompletedMessage();
            return;
        }
        if(command.equals("END")) {
            this.ui.outGameEndMessage();
            return;
        }

        if(character == null){
            this.ui.outInvalidCommand(command);
            return;
        }

        switch (command){

            case "UP" :{
                moveAndNotify(Direction.UP);
                return;
            }
            case "DOWN" :{
                moveAndNotify(Direction.DOWN);
                return;
            }
            case "LEFT" :{
                moveAndNotify(Direction.LEFT);
                return;
            }
            case "RIGHT" :{
                moveAndNotify(Direction.RIGHT);
                return;
            }

        }

        this.ui.outInvalidCommand(command);

    }

    private void moveAndNotify(Direction up) {
        this.ui.outMap(new ClientResult(this.character.move(up)));
        this.subject.notifyObservers(this.character);
    }

}
