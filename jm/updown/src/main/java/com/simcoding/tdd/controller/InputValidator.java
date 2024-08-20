package com.simcoding.tdd.controller;

public class InputValidator {

    public boolean validate(String order) {

        for (OrderConstant value : OrderConstant.values()) {
            if(value.equalsString(order)) return true;
        }

        return false;
    }
}
