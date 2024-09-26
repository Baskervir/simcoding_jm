package com.simcoding.memory_visibility;

import java.util.Objects;

public class Limit {
    private int lowest;
    private int highest;
    private long createdTime;

    public Limit(int lowest, int highest) {
        this.lowest = lowest;
        this.highest = highest;
        this.createdTime = System.currentTimeMillis();
    }

    public void setRange(int lowest, int highest){
        if(lowest > highest) throw new IllegalArgumentException();
        synchronized (this){
            this.lowest = lowest;
            this.highest = highest;
        }

        synchronized (this){
            this.createdTime = 01;
        }

    }

    public boolean isInRange(int value){
        // lowest : 100
        // highst : 50
        return value >=lowest && value <= highest;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Limit limit = (Limit) o;
        return lowest == limit.lowest && highest == limit.highest;
    }

    @Override
    public int hashCode() {
        return Objects.hash(lowest, highest);
    }

    @Override
    public String toString() {
        return "Limit{" +
                "lowest=" + lowest +
                ", highest=" + highest +
                ", createdTime=" + createdTime +
                '}';
    }
}

class www {

    public static void main(String[] args) {
        Limit limit = new Limit(1,5);
        new Thread(()->{
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            limit.setRange(100, 1000);
        }).start();;

        new Thread(()->{
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            limit.setRange(10, 50);
        }).start();;

        System.out.println(limit);
    }

}
