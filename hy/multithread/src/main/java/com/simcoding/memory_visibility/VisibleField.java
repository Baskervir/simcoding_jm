package com.simcoding.memory_visibility;

import java.util.concurrent.atomic.AtomicInteger;

public class VisibleField {
    private volatile static boolean flag = false;
    static Integer result = 0;

    public static void main(String[] args) throws InterruptedException {
        // 스레드 1: flag 값을 읽는 스레드
        new Thread(() -> {
            synchronized (result) {
                if (result % 2 == 0) {
                    result += 1;
                }
            }
        }).start();

        new Thread(() -> {
            if(result % 2 != 0) {
                result +=1;
            }
        }).start();

        Thread.sleep(1000);
        System.out.println(result);
    }

}
