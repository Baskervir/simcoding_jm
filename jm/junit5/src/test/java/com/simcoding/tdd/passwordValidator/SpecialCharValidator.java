package com.simcoding.tdd.passwordValidator;

public class SpecialCharValidator implements PasswordValidator {
    @Override
    public boolean validate(String password) {
        for (char c : password.toCharArray()) {
            if (!Character.isLetterOrDigit(c) && !Character.isWhitespace(c)) {
                return true;
            }
        }
        return false;
    }
}
