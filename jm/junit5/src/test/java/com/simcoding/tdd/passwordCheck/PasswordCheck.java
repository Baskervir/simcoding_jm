package com.simcoding.tdd.passwordCheck;

import com.simcoding.tdd.passwordPolicy.PasswordPolicy;
import com.simcoding.tdd.passwordValidator.*;

import java.util.Arrays;

public class PasswordCheck {
    private static final PasswordPolicy policy = new PasswordPolicy(Arrays.asList(
            new UpperCaseValidator(),
            new LowerCaseValidator(),
            new SpecialCharValidator(),
            new StarCharValidator(),
            new IntegerValidator()
    ));

    public static String checkPassword(String password) {
        if (password == null || password.isEmpty()) {
            return "사용 불가";
        }

        int count = policy.evaluatePassword(password);

        switch (count) {
            case 3:
                return "강함";
            case 2:
                return "중간";
            case 1:
                return "약함";
            default:
                return "사용 불가";
        }
    }
}
