import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class OneToManyExample {
    public static void main(String[] args) {
        ExecutorService executor = Executors.newSingleThreadExecutor();

        for (int i = 0; i < 5; i++) {
            executor.execute(new MyRunnable());
        }

        executor.shutdown();
    }
}
