package com.simcoding.tdd.password;

import com.simcoding.tdd.password.polices.AlphabetPolicy;
import com.simcoding.tdd.password.polices.AsteriskPolicy;
import com.simcoding.tdd.password.polices.PasswordIsContained;
import com.simcoding.tdd.password.polices.RegExPolicy;

import java.util.Arrays;
import java.util.List;

public class PasswordValidator {
    private List<SingleUnitPasswordPolicy> polices =
            Arrays.asList(
                    new AsteriskPolicy(),
                    new RegExPolicy(),
                    new AlphabetPolicy(),
                    new PasswordIsContained()
            );

    private Evaluator check = new Evaluator();
    public String validate(String s) {

        int cnt = 0;

        for (SingleUnitPasswordPolicy police : polices) {
            if(police.validate(s)) cnt++;
        }

        return check.isOkay(cnt);
    }
}

class Evaluator {
    String isOkay(int cnt){
        if(cnt <=2) return "약함";
        if(cnt == 3) return "중간";
        if(cnt >=3 ) return "강함";
        return "사용 불가";
    }
}