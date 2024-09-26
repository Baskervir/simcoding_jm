package com.simcoding.memory_visibility;

public class UnVisibleField {
    private static volatile Boolean flag = false;
    public static void main(String[] args) {
        // 스레드 1: flag 값을 읽는 스레드
        new Thread(() -> {
            System.out.println("**********************************");
            System.out.println("**********************************");
            System.out.println("**********************************");
            System.out.println("**********************************");
            System.out.println("**************ABC*************");
            synchronized (flag) {

                while (!flag) {

                    // flag가 false일 때 반복
                    // flag을 이용한 또다른 연산이 필요하고, 그 연산이 flag가 false일 것이라 예상하고 있다면, 이때 문제가 발생할 수 있다.
                    // 이전 상태에 의존성을 가지는 경우에는, volatile 키워드 만으로 동기화를 맞추는 것은 부족할 수 있다.
                }
            }
            System.out.println("Flag is now true!");
        }).start();


        new Thread(() -> {
           if(!flag){
               //실행되어야 할까 말아야할까?
               System.out.println("안녕하세요");
           }
        }).start();

        new Thread(() -> {
           flag = true;
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
