package com.simcoding.tdd.updown;

import com.simcoding.tdd.updown.orders.IngameOrder;
import com.simcoding.tdd.updown.orders.StartOrder;

import java.util.Random;

public class GameEngine {
    private int randomNumber;
    public OrderResult order(Order order) {

        if(randomNumber == 0){
            if(order instanceof IngameOrder){
                throw new RuntimeException("게임을 시작해주세요");
            }

            IngameOrder ingameOrder = (IngameOrder) order;
            int userNum = ingameOrder.getUserNum();
            if(this.randomNumber > userNum) return order.createOrderResult();
        }


        if(order instanceof StartOrder) {
            Random r = new Random();
            this.randomNumber = r.nextInt(100);
        }
        return order.createOrderResult();
    }

    public int getNumber() {
        return this.randomNumber;
    }
}

