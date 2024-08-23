package com.simcoding.tdd.passwordValidator;

public class UpperCaseValidator implements PasswordValidator {
    @Override
    public boolean validate(String password) {
        for (char c : password.toCharArray()) {
            if (Character.isUpperCase(c)) {
                return true;
            }
        }

        return false;
    }
}
