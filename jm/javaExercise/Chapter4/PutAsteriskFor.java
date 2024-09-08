package Chapter4;

import java.util.Scanner;

public class PutAsteriskFor {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        System.out.print("How many Stars? : ");
        int n = stdIn.nextInt();

        if (n > 0) {
            for (int i = 0; i < n; i++) {
                System.out.print("*");
            }
        }
    }
}
