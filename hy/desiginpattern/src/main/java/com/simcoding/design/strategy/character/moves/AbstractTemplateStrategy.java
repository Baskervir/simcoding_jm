package com.simcoding.design.strategy.character.moves;

import com.simcoding.design.strategy.Main;
import com.simcoding.design.strategy.character.Direction;

/**
 * @apiNote 공통된 코드를, 부모 abstract 클래스에 모아두고,
 * 변경되는 부분만, 하위 클래스에서 overide하여 처리한다.
 * @apiNote 상속을 사용할 경우, 부모 클래스에 종속되기 때문에, 꼭 필요한 경우에만 사용할 수 있도록 한다.
 * **/
public abstract class AbstractTemplateStrategy implements MoveStrategy{
    @Override
    public int moveY(Direction dir, int curY) {
        int cy = dir.getcY() * 3 + curY;
        if(!(cy < Main.map.length && cy >= 0 )) return curY;
        return handleY(dir, curY);
    }

    @Override
    public int moveX(Direction dir, int curX) {
        int cx = dir.getcX() * 3 + curX;
        if(!(cx < Main.map[0].length && cx >= 0 )) return curX;
        return handleX(dir, curX);
    }

    protected abstract int handleY(Direction dir, int curY);
    protected abstract int handleX(Direction dir, int curX);
}
