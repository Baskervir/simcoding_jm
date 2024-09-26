package com.simcoding.question.q2;

import java.util.Map;
import java.util.concurrent.*;
import java.util.stream.IntStream;

public class SuperEnhancedCache {
    private final Map<String, FutureTask<Integer>> cache = new ConcurrentHashMap<>();

    /**
     * @apiNote 만약, 연산이 실패한다면?
     * **/
    public Integer get(String value) throws ExecutionException, InterruptedException, TimeoutException {
        if(this.cache.containsKey(value)) return this.cache.get(value).get();
        while(true){
            FutureTask<Integer> job = this.cache.get(value);
            if(job == null){
                FutureTask<Integer> future = new FutureTask<>(() -> superExpensiveComputation(value));
                this.cache.putIfAbsent(value, future);
                future.run();
                return future.get();
            }else{
                return job.get();

            }


        }
    }
    
    /**
     * @apiNote 이 메서드는 절대 실패하지 않는다
     * **/
    private int superExpensiveComputation(String value) {
        System.out.println("super expensive job is working for "+value +" by "+Thread.currentThread());
        for (int i = 0; i < 10_000_000; i++) {

        }
        return value.hashCode();
    }


}

class Main1{

    public static void main(String[] args) throws ExecutionException, InterruptedException, TimeoutException {
        SuperEnhancedCache cache = new SuperEnhancedCache();

        IntStream.range(0,10).mapToObj(t->new Thread(()->{
            try {
                Integer i = cache.get("hi");
                System.out.println(i);
            } catch (ExecutionException | InterruptedException | TimeoutException e) {
                throw new RuntimeException(e);
            }
        })).forEach(Thread::start);

    }



}