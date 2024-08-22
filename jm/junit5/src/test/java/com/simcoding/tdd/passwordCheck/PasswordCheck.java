package com.simcoding.tdd.passwordCheck;

import com.simcoding.tdd.passwordValidator.*;

import java.util.ArrayList;
import java.util.List;

public class PasswordCheck {
    private static final List<PasswordValidator> validators = new ArrayList<>();

    public PasswordCheck() {
        validators.add(new UpperCaseValidator());
        validators.add(new LowerCaseValidator());
        validators.add(new SpecialCharValidator());
        validators.add(new StarCharValidator());
        validators.add(new IntegerValidator());
    }
        /*boolean hasUpperChar = false;
        boolean hasLowerChar = false;
        boolean hasSpecialChar = false;
        boolean hasStarChar = false;
        boolean hasInteger = false;*/

    /*// 조건별 비밀번호 검증 단ㄱ{
    for (char c : password.toCharArray()) {
        if (Character.isUpperCase(c)) {
            hasUpperChar = true;
        }
        if (Character.isLowerCase(c)) {
            hasLowerChar = true;
        }
        if (!Character.isLetterOrDigit(c) && !Character.isWhitespace(c)) {
            hasSpecialChar = true;
        }
        if (c == '*') {
            hasStarChar = true;
        }
        if (Character.isDigit(c)) {
            hasInteger = true;
        }
    }*/
    public static String checkPassword(String password) {
        if (password == null || password.isEmpty()) {
            return "사용 불가";
        }

        int count = 0;
        for (PasswordValidator validator : validators) {
            if (validator.validate(password)) {
                count++;
            }
        }

        /*// 정책 준수 여부에 따라 count++;
        int count = 0;
        // 정책 1 : 영어, 숫자, 특수문자가 1개 이상 반드시 포함.
        if ((hasUpperChar || hasLowerChar) && hasInteger && hasSpecialChar) {
            count++;
        }
        // 정책 2 : 영문 대문자 & 소문자 반드시 1개이상씩 포함.
        if (hasUpperChar && hasLowerChar) {
            count++;
        }
        // 정책 3 : 특수문자 '*' 반드시 1개 이상 포함.
        if (hasStarChar) {
            count++;
        }*/

        // count 개수 기반으로 강도 출력
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
