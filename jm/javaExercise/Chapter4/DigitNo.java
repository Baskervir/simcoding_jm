package Chapter4;

import java.util.Scanner;

public class DigitNo {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        System.out.println("양의 정수값의 자리수를 표시합니다.");

        int x;
        do {
            System.out.print("양의 정수값 : ");
            x = stdIn.nextInt();
        } while (x <= 0);

        int digitNo = 0;
        while (x > 0) {
            digitNo++;
            x /= 10;
        }
        System.out.println("입력한 숫자는 " + digitNo + "자리입니다.");
    }
}
