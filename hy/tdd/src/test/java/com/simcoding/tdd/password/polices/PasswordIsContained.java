package com.simcoding.tdd.password.polices;

import com.simcoding.tdd.password.SingleUnitPasswordPolicy;

public class PasswordIsContained implements SingleUnitPasswordPolicy {
    /**
     * @return 주어진 문자열이 '['와 ']'로 감싸여있는지 확인하고, 감싸있으면 true를 반환한다
     * **/
    @Override
    public boolean validate(String str) {
        return str.startsWith("[") && str.endsWith("]");
    }
}
