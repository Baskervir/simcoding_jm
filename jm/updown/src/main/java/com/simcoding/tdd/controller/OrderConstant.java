package com.simcoding.tdd.controller;

public enum OrderConstant {
    GIVE_UP("I am stupid"),
    END("end"),
    NUMBER_WITH_ARG("^number\\s*:\\s*\\d+$"),
    START("start");


    private final String message;

    OrderConstant(String message) {
        this.message = message;
    }

    boolean equalsString(String message){
        if(message.startsWith("number")) return message.matches(this.message);
        return this.message.equals(message);
    }
}
