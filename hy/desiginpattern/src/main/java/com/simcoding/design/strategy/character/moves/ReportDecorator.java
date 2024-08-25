package com.simcoding.design.strategy.character.moves;

import com.simcoding.design.strategy.character.Direction;

/**
/
 기능을 확장하고자 하는 클래스의 인터페이스를 상속받는다.

/ **/
public class ReportDecorator implements MoveStrategy{
    private final MoveStrategy component;

    public ReportDecorator(MoveStrategy component) {
        this.component = component;
    }

    @Override
    public int moveY(Direction dir, int curY) {
//        System.out.println("--------- 현재 위치는 "+curY);
        int nextY = this.component.moveY(dir, curY);
//        System.out.println("--------- 다음 위치는 "+nextY);
        return nextY;
    }

    @Override
    public int moveX(Direction dir, int curX) {
//        System.out.println("---------  현재 위치는 "+curX);
        int nextX = this.component.moveX(dir, curX);
//        System.out.println("---------  다음 위치는 "+nextX);
        return nextX;
    }
}
