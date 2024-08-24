package com.simcoding.tdd.passwordPolicy;

import com.simcoding.tdd.passwordValidator.PasswordValidator;

import java.util.List;

public class PasswordPolicy {
    private final List<PasswordValidator> validators;

    public PasswordPolicy(List<PasswordValidator> validators) {
        this.validators = validators;
    }

    public int evaluatePassword(String password) {
        boolean hasUpper = validators.get(0).validate(password);
        boolean hasLower = validators.get(1).validate(password);
        boolean hasSpecial = validators.get(2).validate(password);
        boolean hasStar = validators.get(3).validate(password);
        boolean hasDigit = validators.get(4).validate(password);

        int count = 0;
        // 정책별 검증
        if ((hasUpper || hasLower) && hasDigit && hasSpecial) {
            count++;
        }
        if (hasUpper && hasLower) {
            count++;
        }
        if (hasStar) {
            count++;
        }

        return count;
    }
}