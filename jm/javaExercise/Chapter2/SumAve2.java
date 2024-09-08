package Chapter2;

public class SumAve2 {
    public static void main(String[] args) {
        int x, y, z;
        int sum;

        x = 63;
        y = 18;
        z = 52;
        sum = x + y + z;

        System.out.println("x값은 " + x + "입니다.");
        System.out.println("y값은 " + y + "입니다.");
        System.out.println("z값은 " + z + "입니다.");
        System.out.println("합계는 " + sum + "입니다.");
        System.out.println("평균은 " + sum/3 + "입니다.");
    }
}
