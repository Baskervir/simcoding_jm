package Chapter4;
/**
 * 입력한 값이 세자리 정수일 경우 값을 출력 (그 외 일 경우 질문 반복)
 * **/
import java.util.Scanner;

public class ThreeDigits {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        int x;

        do {
            System.out.print("세 자리의 정수값: ");
            x = stdIn.nextInt();
        } while (x < 100 || x > 999);

        System.out.println("입력한 값은 " + x + "입니다.");
    }
}
