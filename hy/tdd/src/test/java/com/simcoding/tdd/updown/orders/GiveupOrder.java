package com.simcoding.tdd.updown.orders;

import com.simcoding.tdd.updown.Order;
import com.simcoding.tdd.updown.OrderResult;

public class GiveupOrder extends Order {

    public GiveupOrder(String message) {
        super("giveup", message);
    }

    @Override
    public OrderResult execute() {
        return OrderResult.createMessage("giveup");
    }

    @Override
    public OrderResult createOrderResult() {
        return new OrderResult("giveup");
    }
}
