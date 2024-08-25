package com.simcoding.tdd.updown;

public class UpAndDownController {
    public OrderResult order(String order) {

        if(isNumber(order)) return Order.convert("ingame").execute();
        return Order.convert(order).execute();

    }

    private boolean isNumber(String str) {
        try {
            Integer.parseInt(str);
            return true;
        }catch (NumberFormatException e){
            return false;
        }
    }
}
