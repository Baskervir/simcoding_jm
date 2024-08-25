package com.simcoding.tdd.password.polices;

import com.simcoding.tdd.password.SingleUnitPasswordPolicy;

public class AsteriskPolicy implements SingleUnitPasswordPolicy {
    @Override
    public boolean validate(String str) {
        return str.contains("*");
    }
}
