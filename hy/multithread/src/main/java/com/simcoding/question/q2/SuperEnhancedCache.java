package com.simcoding.question.q2;

import java.util.Map;
import java.util.concurrent.*;
import java.util.stream.IntStream;

public class SuperEnhancedCache  implements Cache{
    private final Map<String, FutureTask<Integer>> cache = new ConcurrentHashMap<>();

    /**
     * @apiNote 만약, 연산이 실패한다면?
     * **/
    public Integer get(String value)  {
        if (this.cache.containsKey(value)) {
            try {
                return this.cache.get(value).get();
            } catch (ExecutionException | InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        FutureTask<Integer> job = this.cache.get(value);

        if (job == null) {
            job = new FutureTask<>(() -> superExpensiveComputation(value));
            FutureTask<Integer> integerFutureTask = this.cache.putIfAbsent(value, job);
            if (integerFutureTask != null) {
                job = integerFutureTask;
            }
            job.run();
        }

        try {
            return job.get();
        } catch (InterruptedException | ExecutionException e) {
            throw new RuntimeException(e);
        }

    }

}

