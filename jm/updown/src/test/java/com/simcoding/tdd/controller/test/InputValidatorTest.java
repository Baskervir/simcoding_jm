package com.simcoding.tdd.controller.test;

import com.simcoding.tdd.controller.InputValidator;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;

class InputValidatorTest {

    InputValidator validator = new InputValidator();

    @Test
    @DisplayName("'number : a' 명령이 들어오면, false를 반환한다")
    public void t(){

        assertResultIsAsTheSameAsInput("number : a");

    }

    @Test
    @DisplayName("star와 같은 메시지가 들어오면 false를 반환한다.")
    public void t1(){

        assertResultIsAsTheSameAsInput("star");

    }

    private void assertResultIsAsTheSameAsInput(String star) {
        String invalidOrder = star;
        assertFalse(validator.validate(invalidOrder));
    }


}