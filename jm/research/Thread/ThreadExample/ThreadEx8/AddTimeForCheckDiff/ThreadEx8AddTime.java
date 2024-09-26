package ThreadEx8.AddTimeForCheckDiff;

public class ThreadEx8AddTime {
    static long startTime = 0;
    public static void main(String[] args) {
        ThreadEx8_1AddTime th1 = new ThreadEx8_1AddTime();
        ThreadEx8_2AddTime th2 = new ThreadEx8_2AddTime();

        th2.setPriority(7);

        System.out.println("Priority of th1(-) : " + th1.getPriority());
        System.out.println("Priority of th2(|) : " + th2.getPriority());
        th1.start();
        th2.start();
    }
}
