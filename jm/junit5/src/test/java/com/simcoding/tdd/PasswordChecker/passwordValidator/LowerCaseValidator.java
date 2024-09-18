package com.simcoding.tdd.passwordValidator;

public class LowerCaseValidator implements PasswordValidator {
    @Override
    public boolean validate(String password) {
        for (char c : password.toCharArray()) {
            if (Character.isLowerCase(c)) {
                return true;
            }
        }
        return false;
    }
}
