package com.simcoding.tdd.password;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

/**
 * 회원가입 기능 개발
 * 회원가입 시, 사용자가 제공한 패스워드가, 정책에 맞는지 확인하고, 패스워드의 정책 준수 정도를 ‘약함‘, ‘중간‘, ‘강함’, ‘사용불가＇
 * 패스워드가 정책을 모두 준수하는 경우, 강함
 * 패스워드가 정책을 세 개 준수하는 경우, 강함
 * 패스워드가 정책을 두개를 준수하는 경우, 약함
 * 패스워드가 정책을 하나도 준수하지 못한 경우, 사용 불가
 *
 * 패스워드 정책(4개)
 * 1. 영어(대문자, 소문자 구분 X)와 특수문자, 숫자가 최소 하나 이상 포함되어야 한다.
 * 2. 영어는 대문자와 소문자가 최소 하나 이상 포함되어야 한다.
 * 3. ‘*’를 반드시 하나 이상 포함해야 한다.
 * 4. 패스워드는 '[',']'로 감사있어야 한다. [asdasdasd]
 * **/
public class PasswordValidatorTest {

    PasswordValidator validator = new PasswordValidator();

    @Test
    @DisplayName("검증값으로 *ㄹ를 넣으면, 약함으 반환한다")
    public void t(){

        assertArgumentIsAsExpected("*", "약함");

    }
    @Test
    @DisplayName("검증값으로 'a*cA'를 넣으면, 중간을 반환한다")
    public void t1(){

        assertArgumentIsAsExpected("a*cA", "중간");

    }

    @Test
    @DisplayName("검증값으로 'acA'를 넣으면, 중간을 반환한다")
    public void t2(){

        assertArgumentIsAsExpected("acA", "약함");

    }

    @Test
    @DisplayName("검증값으로 'a^1'을 넣으면, 약함을 반환한다")
    public void t3(){

        assertArgumentIsAsExpected("a^1", "약함");

    }
    
    @Test
    @DisplayName("검증값으로 'aA123*'을 입력을로 넣으면, 강함을 반환한다")
    public void t4(){

        assertArgumentIsAsExpected("aA123*", "강함");

    }

    @Test
    @DisplayName("검증값으로 ''을 입력을로 넣으면, 사용 불가으 반환한다")
    public void t5(){

        assertArgumentIsAsExpected("", "사용 불가");

    }

    @Test
    @DisplayName("검증값으로 '[*]'을 입력으로 넣으면, 약함을 반환한다")
    public void t6(){

        assertArgumentIsAsExpected("[*]", "약함");

    }


    private void assertArgumentIsAsExpected(String s, String expectedResult) {
        String result = validator.validate(s);
        Assertions.assertEquals(expectedResult, result);
    }

}
