package com.simcoding.tdd.controller;

import com.simcoding.tdd.controller.engine.GameEngine;

public class GameController {
    private final StringToOrderConverter converter = new StringToOrderConverter();
    private final InputValidator validator = new InputValidator();
    private final GameEngine engine;

    public GameController(GameEngine engine) {
        this.engine = engine;
    }

    public GameController(){
        this.engine = new GameEngine();
    }

    public String order(String order) {
        //전략패턴을 통한 refactoring 가능
        if(!validator.validate(order)) return "unsupported order";

        OrderConstant convertedOrder = converter.convert(order);
        if(convertedOrder.equals(OrderConstant.START)) this.engine.start();

        if(convertedOrder.equals(OrderConstant.GIVE_UP) || convertedOrder.equals(OrderConstant.END)) return "game over";

        if(convertedOrder.equals(OrderConstant.NUMBER_WITH_ARG)){

            String trimmedStr = order.replace(" ",  "");
            String userNumber = trimmedStr.substring(trimmedStr.indexOf(":") + 1);
            Integer userNumberAsInt = Integer.valueOf(userNumber);

            return this.engine.evaluate(userNumberAsInt);
        };

        return "game start!!";
    }
}
