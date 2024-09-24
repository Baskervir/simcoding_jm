class ExThread extends Thread {
    public void execute() {
        System.out.println("Thread is Running.");
    }
}

public class ThreadSample {
    public static void main(String[] args) {
        ExThread threads = new ExThread();
        threads.start();
    }
}
