package Chapter3;

import java.util.Scanner;

public class SortDescending {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.print("a : ");
        int a = stdIn.nextInt();
        System.out.print("b : ");
        int b = stdIn.nextInt();

        if (a > b) {
            int t = a;
            a = b;
            b = t;
        }

        System.out.println("a >= b 가 되도록 정렬");
        System.out.println("a is " + a);
        System.out.println("b is " + b);

    }
}
