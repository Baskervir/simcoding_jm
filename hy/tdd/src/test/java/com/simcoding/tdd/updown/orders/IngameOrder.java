package com.simcoding.tdd.updown.orders;

import com.simcoding.tdd.updown.Order;
import com.simcoding.tdd.updown.OrderResult;
import com.sun.org.apache.xpath.internal.operations.Or;

public class IngameOrder extends Order {
    private int userNum;
    public IngameOrder(String message) {
        super("ingame", message);
    }
    public IngameOrder() {
        super("ingame", "");
    }

    public IngameOrder(int userNum) {
        super("ingame", userNum+"");
        this.userNum = userNum;
    }

    public int getUserNum() {
        return userNum;
    }

    @Override
    public OrderResult execute() {
        return OrderResult.createMessage("ingame");
    }

    @Override
    public OrderResult createOrderResult() {
        return new OrderResult("ingame");
    }

    @Override
    public OrderResult createOrderResult(String message) {
        return new OrderResult("ingame", message);
    }
}
