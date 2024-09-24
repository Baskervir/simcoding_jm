package com.simcoding.race_condition;

public class UnSafeCounter {
    private long lastModifiedTime = -1;
    private int cnt = 0;

    /**
     * @apiNote 비즈니스 요구사항 상, getNext가 호출될 때, lastModifedTime과 cnt를 같이 업데이트해주어야 하는데,
     * 지금과 같은 경우, cnt를 업데이트할 때만, 임계구역을 생성하고 있기 때문에, 변수의 상태가 일관적이지 않음.
     * **/
    public int getNext(){

        this.lastModifiedTime = System.currentTimeMillis();
        int nextCnt;
        synchronized (this){
            nextCnt = cnt++;
        }
        return nextCnt;
    }

//    public synchronized int getNext(){
//
//        int nextCnt;
//        synchronized (this){
//            this.lastModifiedTime = System.currentTimeMillis();
//            nextCnt = cnt++;
//        }
//        return nextCnt;
//    }

}
