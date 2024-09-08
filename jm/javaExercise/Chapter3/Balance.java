package Chapter3;

import java.util.Scanner;

public class Balance {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.print("arg a : ");
        int a = stdIn.nextInt();
        System.out.print("arg b : ");
        int b = stdIn.nextInt();

        if (a > b) {
            System.out.println("a가 크다.");
        } else if (a < b) {
            System.out.println("b가 크다.");
        } else {
            System.out.println("a와 b가 같다.");
        }
    }
}

/**
 * ===오버플로우 (Over Flow)===
 * 각 자료형은 저장 가능한 범위가 있다. 이를 넘어갈시 범위중 가장 최소값으로 저장된다.
 * **/
