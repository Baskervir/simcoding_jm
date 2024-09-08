package Chapter2;

import java.util.Scanner;

public class ScanInteger {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.print("정수값 : ");
        int x = stdIn.nextInt();
        System.out.println(x + "를 입력했습니다.");
    }
}
