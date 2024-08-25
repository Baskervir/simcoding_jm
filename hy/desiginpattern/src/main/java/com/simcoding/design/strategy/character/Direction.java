package com.simcoding.design.strategy.character;

public enum Direction {
    UP(-1,0),
    DOWN(1,0),
    LEFT(0,-1),
    RIGHT(0,1);

    Direction(int cY, int cX) {
        this.cY = cY;
        this.cX = cX;
    }
    
    //Y축 좌표 이동량
    private final int cY;
    //X축 좌표 이동량
    private final int cX;

    public int getcY() {
        return cY;
    }

    public int getcX() {
        return cX;
    }
}
