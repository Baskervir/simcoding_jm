package com.simcoding.tdd.passwordValidator;

public class StarCharValidator implements PasswordValidator {
    @Override
    public boolean validate(String password) {
        for (char c : password.toCharArray()) {
            if (c == '*') {
                return true;
            }
        }
        return false;
    }
}
