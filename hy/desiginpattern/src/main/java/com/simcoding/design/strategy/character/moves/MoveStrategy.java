package com.simcoding.design.strategy.character.moves;

import com.simcoding.design.strategy.character.Direction;

public interface MoveStrategy {
    int moveY(Direction dir, int curY);
    int moveX(Direction dir, int curX);
}
