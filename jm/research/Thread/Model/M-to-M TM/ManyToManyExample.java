import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ManyToManyExample {
    public static void main(String[] args) {
        ExecutorService executor = Executors.newCachedThreadPool();

        for (int i = 0; i < 10; i++) {
            executor.execute(new MyRunnable());
        }

        executor.shutdown();
    }
}
