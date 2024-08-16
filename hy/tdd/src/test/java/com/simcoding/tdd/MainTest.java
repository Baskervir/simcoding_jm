package com.simcoding.tdd;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    @DisplayName("hi")
    public void t(){
        System.out.println(1);
        Assertions.assertEquals(1, 1);
    }

}