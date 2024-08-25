package com.simcoding.tdd.passwordValidator;

public class IntegerValidator implements PasswordValidator {
    @Override
    public boolean validate(String password) {
        for (char c : password.toCharArray()) {
            if (Character.isDigit(c)) {
                return true;
            }
        }
        return false;
    }
}
