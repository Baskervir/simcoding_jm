package com.simcoding.question.q2;

import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class UnSafeCache implements Cache{
    private final Map<String, Integer> cache = new HashMap<>();

    public synchronized Integer get(String value) {
        if(this.cache.containsKey(value)) {
            return this.cache.get(value);
        }
        int result = superExpensiveComputation(value);
        this.cache.put(value, result);

        return result;
    }

}

