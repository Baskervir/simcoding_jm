package com.simcoding.question.q2;

import java.util.List;
import java.util.Random;
import java.util.concurrent.Semaphore;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Start {
    int result = 0 ;
    public static void main(String[] args) throws InterruptedException {
//         Cache cache = new EnhancedCache();
   //       Cache cache = new UnSafeCache();
          Cache cache = new SuperEnhancedCache();

        int permits = 100;
        Semaphore semaphore = new Semaphore(permits);
        String[] arr = new String[]{"a",":b","c","d","e","f","g","h"};

        List<Thread> collect = IntStream.range(0, permits).mapToObj(t -> new Thread(() -> {
            try {
                semaphore.acquire();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            Random r = new Random();
            int millis = r.nextInt(1000);
            try {
                Thread.sleep(millis);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            Integer i = cache.get(arr[millis % arr.length]);
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
