package Chapter4;

import java.util.Scanner;

public class CountDown {
    public static void main(String[] args) throws InterruptedException {
        Scanner stdIn = new Scanner(System.in);
        System.out.println("Countdown Start!!");

        int x;
        do {
            System.out.println("Please Input Start number!!!");
            System.out.print("Input : ");
            x = stdIn.nextInt();
        } while (x <= 0);

        while (x >= 0) {
            Thread.sleep(1000);
            System.out.println(x-- + "!!!");
        }
    }
}
