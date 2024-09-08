package Chapter4;

import java.util.Random;
import java.util.Scanner;

public class UpAndDown {
    public static void main(String[] args) {
        Random rand = new Random();
        Scanner stdIn = new Scanner(System.in);
        int no = 1 + rand.nextInt(99);
        System.out.println("Up & Down Game Start!!!");
        System.out.println("1 ~ 100 사이의 숫자를 맞추세요!!!");

        int x;
        do {
            System.out.print("Input your number : ");
            x = stdIn.nextInt();

            if (x > no) {
                System.out.println("Down!!!");
            } else if (x < no) {
                System.out.println("Up!!!");
            } else {
                System.out.println("Worng Number!!!");
            }
        } while (x != no);

        System.out.println(" _____                                 _   \n" +
                "/  __ \\                               | |  \n" +
                "| /  \\/  ___   _ __  _ __   ___   ___ | |_ \n" +
                "| |     / _ \\ | '__|| '__| / _ \\ / __|| __|\n" +
                "| \\__/\\| (_) || |   | |   |  __/| (__ | |_ \n" +
                " \\____/ \\___/ |_|   |_|    \\___| \\___| \\__|");
    }
}
