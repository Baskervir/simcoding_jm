package com.simcoding.tdd.password.polices;

import com.simcoding.tdd.password.SingleUnitPasswordPolicy;

public class RegExPolicy implements SingleUnitPasswordPolicy {
    @Override
    public boolean validate(String str) {
        String regex = "^(?=.*[a-zA-Z])(?=.*\\d)(?=.*[\\W_]).+$";
        return str.matches(regex);
    }
}
