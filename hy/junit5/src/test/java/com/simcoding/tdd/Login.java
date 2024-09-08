package com.simcoding.tdd;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Login {
	
	public static void main(String args[]) {
        System.out.print("비밀번호를 입력하세요 : ");
        Scanner tmp = new Scanner(System.in);
        String userPassword = tmp.nextLine();
        
        String strength = evaluatePasswordStrength(userPassword);
        System.out.println("비밀번호 강도: " + strength);
    }

    public static String evaluatePasswordStrength(String userPassword) {

        int strength = 0;

        if (Pattern.compile("[A-Z]").matcher(userPassword).find()) {
            strength++;
        }

        if (Pattern.compile("[a-z]").matcher(userPassword).find()) {
            strength++;
        }

        if (Pattern.compile("[0-9]").matcher(userPassword).find()) {
            strength++;
        }

        if (userPassword.contains("*")) {
            strength++;
        } else {
            return "사용불가";
        }

        switch (strength) {
            case 1:
                return "약함";
            case 2:
                return "중간";
            case 3:
                return "강함";
            case 4:
                return "강함";
            default:
                return "사용불가";
        }
    }

}