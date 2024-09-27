package com.simcoding.question.q2;

public interface Cache {
     Integer get(String value);

    default int superExpensiveComputation(String value) {
        System.out.println("super expensive job is working for "+value +" by "+Thread.currentThread());
        int t = 1;
        for (int i = 0; i < 10_000_000; i++) {
            t++;
        }
        return value.hashCode();
    }

}
