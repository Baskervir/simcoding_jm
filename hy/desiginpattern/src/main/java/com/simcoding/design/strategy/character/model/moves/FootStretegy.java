package com.simcoding.design.strategy.character.model.moves;

import com.simcoding.design.strategy.character.model.Direction;

/**
 * @apiNote 주어진 방향으로 한 칸씩 이동한다.
 * **/
public class FootStretegy extends AbstractTemplateStrategy {
    @Override
    protected int handleY(Direction dir, int curY) {
        return dir.getcY() + curY;
    }

    @Override
    protected int handleX(Direction dir, int curX) {
        return dir.getcX() + curX;
    }
}
