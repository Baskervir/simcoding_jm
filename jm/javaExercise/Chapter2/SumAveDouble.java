package Chapter2;

import java.util.Scanner;

public class SumAveDouble {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.print("x값 : ");
        double x = stdIn.nextDouble();

        System.out.print("y값 : ");
        double y = stdIn.nextDouble();

        System.out.println("Sum is " + (x + y));
        System.out.println("Average is " + (x + y)/2);
    }
}
