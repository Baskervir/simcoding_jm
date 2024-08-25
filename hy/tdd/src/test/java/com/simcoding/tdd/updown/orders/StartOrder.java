package com.simcoding.tdd.updown.orders;

import com.simcoding.tdd.updown.Order;
import com.simcoding.tdd.updown.OrderResult;

public class StartOrder extends Order {

    public StartOrder(String message) {
        super("start", message);
    }
    public StartOrder() {
        super("start", "");
    }

    @Override
    public OrderResult execute() {
        return OrderResult.createMessage("start");
    }

    @Override
    public OrderResult createOrderResult() {
        return new OrderResult("start");
    }
}
