package com.simcoding.question.q2;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class EnhancedCache {
    private final Map<String, Integer> cache = new ConcurrentHashMap<>();

    public Integer get(String value){
        if(this.cache.containsKey(value)) return this.cache.get(value);
        int result = superExpensiveComputation(value);
        this.cache.put(value, result);

        return result;
    }

    private int superExpensiveComputation(String value) {
        for (int i = 0; i < 10_000_000; i++) {

        }
        return value.hashCode();
    }


}
