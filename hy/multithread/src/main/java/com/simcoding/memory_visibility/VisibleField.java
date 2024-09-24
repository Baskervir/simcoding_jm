package com.simcoding.memory_visibility;

public class VisibleField {
    private volatile static boolean flag = false;

    public static void main(String[] args) {
        // 스레드 1: flag 값을 읽는 스레드
        new Thread(() -> {
            while (!flag) {
                // flag가 false일 때 반복
            }
            System.out.println("Flag is now true!");
        }).start();

        // 스레드 2: flag 값을 변경하는 스레드
        new Thread(() -> {
            try {
                Thread.sleep(1000); // 1초 대기
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            flag = true;
            System.out.println("Flag has been set to true.");
        }).start();
    }

}
