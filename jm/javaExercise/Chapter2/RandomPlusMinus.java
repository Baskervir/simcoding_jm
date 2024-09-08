package Chapter2;

import java.util.Random;
import java.util.Scanner;

/**
 * 키보드를 통해 입력받은 값의 ±5 범위에 있는 난수 생성
 * **/
public class RandomPlusMinus {
    public static void main(String[] args) {
        Random rand = new Random();
        Scanner stdIn = new Scanner(System.in);

        System.out.print("정수값 : ");
        int x = stdIn.nextInt();

        System.out.println("입력 값의 ±5 범위의 난수를 생성했습니다.");
        System.out.println("값은 " + (x-5 + rand.nextInt(11)) + "입니다.");
    }
}
