package com.simcoding.design.strategy.character.controller;

import com.simcoding.design.strategy.character.Direction;
import com.simcoding.design.strategy.character.MainCharacter;
import com.simcoding.design.strategy.character.moves.FootStretegy;
import com.simcoding.design.strategy.character.moves.ReportDecorator;
import com.simcoding.design.strategy.character.view.TerminalBasedUi;
import com.simcoding.design.strategy.character.view.UserInterface;

public class CharacterController {

    private MainCharacter character;
    private UserInterface ui = new TerminalBasedUi();
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
                 this.ui.outMap(new ClientResult(this.character.move(Direction.UP)));
                return;
            }
            case "DOWN" :{
                this.ui.outMap(new ClientResult(this.character.move(Direction.DOWN)));
                return;
            }
            case "LEFT" :{
                this.ui.outMap(new ClientResult(this.character.move(Direction.LEFT)));
                return;
            }
            case "RIGHT" :{
                this.ui.outMap(new ClientResult(this.character.move(Direction.RIGHT)));
                return;
            }

        }

        this.ui.outInvalidCommand(command);

    }

}
