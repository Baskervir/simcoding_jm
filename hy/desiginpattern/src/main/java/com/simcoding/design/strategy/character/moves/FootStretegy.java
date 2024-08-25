package com.simcoding.design.strategy.character.moves;

import com.simcoding.design.strategy.character.Direction;

/**
 * @apiNote 주어진 방향으로 한 칸씩 이동한다.
 * **/
public class FootStretegy implements MoveStrategy {
    @Override
    public int moveY(Direction dir, int curY) {
        return dir.getcY()+curY;
    }

    @Override
    public int moveX(Direction dir, int curX) {
        return dir.getcX() + curX;
    }
}
