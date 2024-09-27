package com.simcoding.question.q2;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class EnhancedCache implements Cache {
    private final Map<String, Integer> cache = new ConcurrentHashMap<>();

    public synchronized Integer get(String value){
        if(this.cache.containsKey(value)) return this.cache.get(value);
        int result = superExpensiveComputation(value);
        this.cache.put(value, result);

        return result;
    }
}
