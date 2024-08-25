package com.simcoding.design.strategy.character;

public interface MoveStrategy {
    int moveY(Direction dir, int curY);
    int moveX(Direction dir, int curX);
}
