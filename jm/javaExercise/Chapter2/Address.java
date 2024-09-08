package Chapter2;

import java.util.Scanner;

public class Address {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.print("주소 : ");
        String address = stdIn.nextLine();

        System.out.println("주소는 " + address + "입니다.");
    }
}

/**
 * ===next() 와 nextLine()===
 * -문자열 읽기 위해 next 메서드 사용
 * -공백문자 포함해서 읽기 위해선 nextLine() 메서드 사용
 * **/