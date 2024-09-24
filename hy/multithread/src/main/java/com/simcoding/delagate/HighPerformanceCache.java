package com.simcoding.delagate;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class HighPerformanceCache {
    private final Map<String, Integer> hashcodeCache = new ConcurrentHashMap<>();

    public int get(String keyword){
        if(this.hashcodeCache.containsKey(keyword)) return this.hashcodeCache.get(keyword);
        int hashCode = keyword.hashCode();
        this.hashcodeCache.put(keyword, hashCode);
        return hashCode;

    }


}
