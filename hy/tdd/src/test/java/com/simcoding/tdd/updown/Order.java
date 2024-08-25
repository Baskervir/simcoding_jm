package com.simcoding.tdd.updown;

import com.simcoding.tdd.updown.orders.EndOrder;
import com.simcoding.tdd.updown.orders.GiveupOrder;
import com.simcoding.tdd.updown.orders.IngameOrder;
import com.simcoding.tdd.updown.orders.StartOrder;

public abstract class Order {
    private final String type;
    private final String message;

    public Order(String type, String message) {
        this.type = type;
        this.message = message;
    }

    public static Order convert(String order) {

        switch (order){
            case "start" : return new StartOrder();
            case "end" : return new EndOrder();
            case "giveup" : return new GiveupOrder("down");
            case "ingame" : return new IngameOrder();
        }

        return null;
    }

    public  abstract OrderResult execute();

    public abstract OrderResult createOrderResult();

    public OrderResult createOrderResult(String message){
        return null;
    };


}
