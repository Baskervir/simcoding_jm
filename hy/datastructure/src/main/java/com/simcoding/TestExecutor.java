package com.simcoding;

import org.junit.jupiter.api.Test;

public class TestExecutor {

    static public void timeLaps(Runnable r){
        long start = System.currentTimeMillis();
        r.run();
        System.out.print(System.currentTimeMillis());
        long end = System.currentTimeMillis() - start;
    }

}
