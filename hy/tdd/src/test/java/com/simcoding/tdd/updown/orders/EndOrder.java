package com.simcoding.tdd.updown.orders;

import com.simcoding.tdd.updown.Order;
import com.simcoding.tdd.updown.OrderResult;

public class EndOrder extends Order {

    public EndOrder(String message) {
        super("end", message);
    }
    public EndOrder() {
        super("end", "");
    }

    @Override
    public OrderResult execute() {
        return OrderResult.createMessage("end");
    }

    @Override
    public OrderResult createOrderResult() {
        return new OrderResult("end");
    }
}
