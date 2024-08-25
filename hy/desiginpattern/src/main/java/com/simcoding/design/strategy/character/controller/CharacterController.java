package com.simcoding.design.strategy.character.controller;

import com.simcoding.design.strategy.character.Direction;
import com.simcoding.design.strategy.character.MainCharacter;
import com.simcoding.design.strategy.character.moves.FootStretegy;
import com.simcoding.design.strategy.character.moves.ReportDecorator;

public class CharacterController {

    private MainCharacter character;

    public ClientResult move(String command){

        if(command.equals("INIT")) {
            this.character = new MainCharacter(new ReportDecorator(new FootStretegy()));
            return new ClientResult(CommandResult.INIT);
        }
        if(command.equals("END")) return new ClientResult(CommandResult.END);

        if(character == null) return new ClientResult(CommandResult.ERROR);

        switch (command){

            case "UP" :{
                return new ClientResult(this.character.move(Direction.UP));
            }
            case "DOWN" :{
                return new ClientResult(this.character.move(Direction.DOWN));
            }
            case "LEFT" :{
                return new ClientResult(this.character.move(Direction.LEFT));
            }
            case "RIGHT" :{
                return new ClientResult(this.character.move(Direction.RIGHT));
            }

        }

        return new ClientResult(CommandResult.ERROR);

    }

}
