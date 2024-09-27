package com.simcoding.race_condition;

import java.util.stream.IntStream;

/**
 * 본 코드의 문제점
 *
 * 여러 쓰레드가 동시에 this.cnt에 접근할 때, 적절한 동기화 로직이 적용되어 있지 않음.
 * 이로 인하여, 경쟁 조건이 발생하게 되고, 쓰레드 스케줄링 현황에 따라서, 내부의 cnt의 값이 계속 변하는
 * 경쟁 조건이 발생
 *
 * **/
public class SafeCounter implements Counter {
    private volatile int cnt = 0;
    @Override
    public  int getNext() {
        int t= 1;

        return cnt++;
    }
}

class SafeMain{
    public static String name = "as";
    public static void main(String[] args) throws InterruptedException {

        Counter counter = new SafeCounter();

        IntStream.range(0, 5)
                .mapToObj(t -> getThread(counter))
                .forEach(Thread::start);

        Thread.sleep(3000);

        System.out.println(counter.getNext());;

    }


    private static Thread getThread(Counter counter){
        return new Thread(() -> {
            for (int i = 0; i < 10; i++) {
                System.out.println(Thread.currentThread().getName() + " got number " + counter.getNext());
                try {
                    Thread.sleep(166);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        });
    }
}