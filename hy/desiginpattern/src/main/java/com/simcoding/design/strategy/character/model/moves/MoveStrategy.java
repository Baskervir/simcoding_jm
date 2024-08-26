package com.simcoding.design.strategy.character.model.moves;

import com.simcoding.design.strategy.character.model.Direction;

public interface MoveStrategy {
    int moveY(Direction dir, int curY);
    int moveX(Direction dir, int curX);
}
