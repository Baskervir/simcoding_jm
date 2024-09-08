package Chapter4;

import java.util.Scanner;

public class PutAsteriskAlt {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        System.out.print("How many sign? : ");
        int n = stdIn.nextInt();

        if (n > 0) {
            int i = 0;
            while (i < n) {
                if (i % 2 == 0) {
                    System.out.print("*");
                } else {
                    System.out.print("+");
                }
                i++;
            }
        }
    }
}
