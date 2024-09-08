package Chapter3;

import java.util.Scanner;

public class Sign {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.print("정수값 : ");
        int n = stdIn.nextInt();

        if (n > 0) {
            System.out.println("값이 양수입니다.");
        } else if (n < 0) {
            System.out.println("값이 음수입니다.");
        } else {
            System.out.println("값이 0입니다.");
        }
    }
}
/**
 * ===if문의 흐름 분기===
 * -위에서 순차적으로 조건이 참일 경우 수행문을 수행하고 빠져나간다.
 * **/