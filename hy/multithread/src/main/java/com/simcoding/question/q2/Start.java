package com.simcoding.question.q2;

import java.util.List;
import java.util.concurrent.Semaphore;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Start {
    public static void main(String[] args) throws InterruptedException {
         Cache cache = new EnhancedCache();
 //         Cache cache = new UnSafeCache();
//        Cache cache = new SuperEnhancedCache();

        int permits = 1000;
        Semaphore semaphore = new Semaphore(permits);

        List<Thread> collect = IntStream.range(0, permits).mapToObj(t -> new Thread(() -> {
            try {
                semaphore.acquire();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            Integer i = cache.get("hi");
            System.out.println(i);

            semaphore.release();
        })).collect(Collectors.toList());


        long start = System.currentTimeMillis();

        for (Thread thread : collect) {
            thread.start();
        }

        semaphore.acquire(permits);

        long end = System.currentTimeMillis() - start;

        System.out.println(end);


    }
}
