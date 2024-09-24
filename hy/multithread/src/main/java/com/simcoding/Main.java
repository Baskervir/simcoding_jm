package com.simcoding;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Thread th = new Thread(()->{

            System.out.println(
                    Thread.currentThread().getName()
            );

        });


        th.start();


        System.out.println(Thread.currentThread().getName());
        Thread.sleep(1000);

    }
}
