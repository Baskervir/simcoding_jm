package com.simcoding.delagate;

import java.util.HashMap;
import java.util.Map;

public class LowPerformanceCache {
    private final Map<String, Integer> hashcodeCache = new HashMap<>();

    public int get(String keyword){
        if(this.hashcodeCache.containsKey(keyword)) return this.hashcodeCache.get(keyword);

        int hashCode = keyword.hashCode();

        synchronized (hashcodeCache) {
            this.hashcodeCache.put(keyword, hashCode);
            return hashCode;
        }
    }


}
