package com.simcoding.design.strategy.character.moves;

import com.simcoding.design.strategy.character.Direction;
import com.simcoding.design.strategy.character.MoveStrategy;

public class CarStrategy implements MoveStrategy {
    @Override
    public int moveY(Direction dir, int curY) {
        return dir.getcY() * 3 + curY;
    }

    @Override
    public int moveX(Direction dir, int curX) {
        return dir.getcX() * 3 + curX;
    }
}
