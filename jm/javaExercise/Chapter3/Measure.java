package Chapter3;

import java.util.Scanner;

public class Measure {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.print("arg A : ");
        int a = stdIn.nextInt();
        System.out.print("arg B : ");
        int b = stdIn.nextInt();

        if (a % b == 0) {
            System.out.println("B는 A의 약수입니다.");
        } else {
            System.out.println("B는 A의 약수가 아닙니다.");
        }
    }
}
