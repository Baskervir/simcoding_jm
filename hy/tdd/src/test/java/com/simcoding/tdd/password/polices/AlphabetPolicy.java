package com.simcoding.tdd.password.polices;

import com.simcoding.tdd.password.SingleUnitPasswordPolicy;

public class AlphabetPolicy implements SingleUnitPasswordPolicy {
    @Override
    public boolean validate(String str) {
        char[] charArray = str.toCharArray();
        boolean doseThisHaveCapitalAlphabet = false;
        boolean doseThisHaveSmallAlphabet = false;

        for (char c : charArray) {

            if(c >='a' && c<='z') doseThisHaveSmallAlphabet = true;
            if(c >='A' && c<='Z') doseThisHaveCapitalAlphabet = true;

            if(doseThisHaveCapitalAlphabet && doseThisHaveSmallAlphabet){
                return true;
            }
        }
        return false;
    }
}
