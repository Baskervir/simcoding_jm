package com.simcoding.question.q2;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeoutException;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Cache {
    private final Map<String, Integer> cache = new HashMap<>();

    public Integer get(String value) throws InterruptedException {
        if(this.cache.containsKey(value)) {
            Thread.sleep(100);
            return this.cache.get(value);
        }
        Thread.sleep(100);
        int result = superExpensiveComputation(value);
        this.cache.put(value, result);

        return result;
    }

    private int superExpensiveComputation(String value) {
        System.out.println("super expensive");
        for (int i = 0; i < 10_000_000; i++) {

        }
        return value.hashCode();
    }


}

class Main0{

public static void main(String[] args) throws ExecutionException, InterruptedException, TimeoutException {
    Cache cache = new Cache();

    List<Thread> threads = IntStream.range(0, 10).mapToObj(t -> new Thread(() -> {
        Integer i = null;
        try {
            i = cache.get("hi");
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println(i);

    })).collect(Collectors.toList());

    for (Thread thread : threads) {
        thread.start();
    }

}



}
