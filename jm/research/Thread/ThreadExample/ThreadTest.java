public class ThreadTest {
    public static void main(String[] args) {
        Thread thread = new Thread(new ExTester());
        thread.start();
    }
}

class ExTester implements Runnable {
    public void run() {
        System.out.println("Thread is running.");
    }
}
