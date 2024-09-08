package Chapter4;

import java.util.Scanner;
/**
 * 입력받은 두 정수 사이의 정수를 작은 것부터 순서대로 표시
 * **/
public class EnumScope {
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

        do {
            System.out.print(a + " ");
            a = a + 1;
        } while (a <= b);
    }
}
