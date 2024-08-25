package com.simcoding.tdd.controller;

public class StringToOrderConverter {

    public OrderConstant convert(String order) {
        for (OrderConstant value : OrderConstant.values()) {
            if(value.equalsString(order)) return value;

        }
        throw new RuntimeException();
    }
}
