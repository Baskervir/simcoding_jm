package ThreadEx8.AddTimeForCheckDiff;

public class ThreadEx8_1AddTime extends Thread {
    public void run() {
        for (int i = 0; i < 300; i++) {
            System.out.print("-");
            for (int j = 0; j < 10000000; j++);
        }
        System.out.println("소요시간 1 : " + (System.currentTimeMillis() - ThreadEx8AddTime.startTime));
    }
}
