package Chapter3;

import java.util.Random;

public class RockPaperScissors {
    public static void main(String[] args) {
        Random rand = new Random();

        System.out.print("Computer is : ");
        int hand = rand.nextInt(3);

        switch (hand) {
            case 0 :
                System.out.println("Scissors");
                break;
            case 1 :
                System.out.println("Rock");
                break;
            case 2 :
                System.out.println("Paper");
                break;
        }
    }
}

/**
 * ===break===
 * 프로그램의 흐름이 break문인 break;에 이르면, switch문 실행이 종료된다.
 * break문이 없는 부분에선 프로그램이 아래로 계속 이동하게 된다.
 * **/