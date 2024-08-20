package com.simcoding.tdd.PasswrodCheckTest;

import com.simcoding.tdd.passwordCheck.PasswordCheck;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class PasswordCheckTest {

    @Test
    @DisplayName("강함. 비밀번호가 모든 정책을 준수합니다")
    void testPasswordStrong() {
        Assertions.assertEquals("강함", PasswordCheck.check("A1*bcde"));
    }

    @Test
    @DisplayName("중간. 비밀번호가 2개의 정책을 준수합니다")
    void testPasswordMedium() {
        Assertions.assertEquals("중간", PasswordCheck.check("a1@BCde"));  //조건 1 & 2 충족
        Assertions.assertEquals("중간", PasswordCheck.check("A*Bcde"));   //조건 2 & 3 충족
        Assertions.assertEquals("중간", PasswordCheck.check("a*1cde"));   //조건 1 & 3 충족
    }

    @Test
    @DisplayName("약함. 비밀번호가 1개의 정책을 준수합니다")
    void testPasswordWeak() {
        Assertions.assertEquals("약함", PasswordCheck.check("a@1bcde"));  //조건 1 충족
        Assertions.assertEquals("약함", PasswordCheck.check("AbCdE"));    //조건 2 충족
        Assertions.assertEquals("약함", PasswordCheck.check("A*BCDE"));   //조건 3 충족
    }

    @Test
    @DisplayName("사용불가. 비밀번호가 정책을 준수하지 않습니다.")
    void testPasswordUnusable() {
        Assertions.assertEquals("사용 불가", PasswordCheck.check("123456"));
        Assertions.assertEquals("사용 불가", PasswordCheck.check("abcdef"));
        Assertions.assertEquals("사용 불가", PasswordCheck.check("!@#$%^"));
        Assertions.assertEquals("사용 불가", PasswordCheck.check(""));
        Assertions.assertEquals("사용 불가", PasswordCheck.check("null"));
    }
}