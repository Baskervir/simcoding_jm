package com.simcoding.tdd.updown;

public class OrderResult {
    private final String type;

    public OrderResult(String type) {
        this.type = type;
    }

    public static OrderResult createMessage(String type) {
        return new OrderResult(type);
    }

    public String getType() {
        return this.type;
    }

    public String getMessage() {
        switch (type){
            case "start" : return "새로운 게임 시작";
            case "end" : return "게임이 종료되었습니다.";
            case "ingame" : return "down";
            case "giveup" : return "bye";
        }
        return "";
    }
}
