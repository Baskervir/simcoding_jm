package com.simcoding.dead_lock;

import com.simcoding.race_condition.Counter;

import java.util.stream.IntStream;

/**
 * 본 코드의 문제점
 * 1. Lock을 얻는 순서가 일정치 않음
 *      1.1 makeCoffe 메서드는 호출될 시, 먼저 coffeMachine에 대한 lock을 잡은 이후, cup의 lock을 잡음
 *      1.2 cleanAllObject 메서드는, 먼저 cup의 lock을 잡고, 그 이후, coffeMachine의 lock을 잡음.
 *      1.3 이로 인하여, 복수의 쓰레드가 동시에 접근할 경우, 서로 락을 잡고, 안 놓아주는 상태가 지속되어, 데드락에 빠지게 됨
 *
 * **/
public class DeadCoffeShop {

    private final Object coffeMachine = new Object();
    private final Object cup = new Object();

    public void makeCoffe(){
        String invokingThreadName = Thread.currentThread().getName();

        synchronized (coffeMachine){
            System.out.println(invokingThreadName +" use coffe machine");
            synchronized (cup){
                System.out.println(invokingThreadName+ " use coffe cup");
            }
        }
    }

    public void cleanAllObject(){
        String invokingThreadName = Thread.currentThread().getName();
        synchronized (cup){
            System.out.println(invokingThreadName+" clean cup");
            synchronized (coffeMachine){
                System.out.println(invokingThreadName+" clean coffeMachine");
            }
        }
    }
}

class Main{
    public static void main(String[] args) throws InterruptedException {
        DeadCoffeShop shop = new DeadCoffeShop();
        IntStream.range(0, 5)
                .mapToObj(t -> getThread(shop))
                .forEach(Thread::start);

        Thread.sleep(3000);

    }

    private static Thread getThread(DeadCoffeShop shop){
        return new Thread(() -> {
            Thread currentThread = Thread.currentThread();
            if(isHashOfNameEvenNumber(currentThread)){
                shop.cleanAllObject();
            }else{
                shop.makeCoffe();
            }
        });
    }

    private static boolean isHashOfNameEvenNumber(Thread currentThread) {
        return currentThread.getName().hashCode() % 2 == 0;
    }
}