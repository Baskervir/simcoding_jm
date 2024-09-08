package Chapter3;

import java.util.Scanner;

public class Season {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.print("What's the Month? : ");
        int month = stdIn.nextInt();

        switch (month) {
            case 3: case 4: case 5:
                System.out.println("Spring");
                break;
            case 6: case 7: case 8:
                System.out.println("Summer");
                break;
            case 9: case 10: case 11:
                System.out.println("Fall");
                break;
            case 12: case 1: case 2:
                System.out.println("Winter");
                break;
            default:
                System.out.println("Doesn't exist");
        }
    }
}

/**
 * ===레이블 (Label)===
 * 프로그램의 이동 위치를 나타내는 표식.
 * 레이블 값은 '상수' (변수 허용 X)
 * 문자열 리터럴 가능.
 *
 * ===Default 레이블===
 * 해당 되는 case가 없을 경우 default레이블로 이동한다.
 * **/
