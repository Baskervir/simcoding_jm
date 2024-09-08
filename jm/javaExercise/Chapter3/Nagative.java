package Chapter3;

import java.util.Scanner;

public class Nagative {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.print("정수값 : ");
        int n = stdIn.nextInt();

        if (n < 0) {
            System.out.println("이 값은 음의 값입니다.");
        } else {
            System.out.println("이 값은 " + n + "입니다.");
        }
    }
}

/**
 * ===표현식===
 * 변수나 리터럴 또는 변수와 리터럴을 연산자로 결합한 것.
 * **/