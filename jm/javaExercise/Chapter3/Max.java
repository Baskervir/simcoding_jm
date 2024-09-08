package Chapter3;

import java.util.Scanner;

public class Max {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.print("a : ");
        double a = stdIn.nextDouble();
        System.out.print("b : ");
        double b = stdIn.nextDouble();

        double max;
        if (a > b) {
            max = a;
        } else {
            max = b;
        }

        System.out.println("Max is " + max);
    }
}

/**
 * ===조건 연산자 (삼항 연산자)===
 * 조건식
 *  식1 ? 식2 : 식3
 * 이 조건식의 결과는 다음과 같다. 먼저 식1을 평가해서 그 값이
 *  a. true인 경우 식2를 평가한 값을 반환
 *  b. false인 경우 식3을 평가한 값을 반환
 * **/