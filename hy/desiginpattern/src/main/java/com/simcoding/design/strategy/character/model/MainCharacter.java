package com.simcoding.design.strategy.character.model;

import com.simcoding.design.strategy.character.externals.ExternalService;
import com.simcoding.design.strategy.character.model.moves.MoveStrategy;

/**
 * @apiNote 캐릭터의 최초 위치는 (0,0)
 * **/
public class MainCharacter {

    private int curX = 0;
    private int curY = 0;
    private MoveStrategy transport;

    public MainCharacter(MoveStrategy transport) {
        this.transport = transport;
    }

    public void setTransport(MoveStrategy transport) {
        this.transport = transport;
    }

    public int[] move(Direction dir) {

        this.curY = this.transport.moveY(dir, this.curY);
        this.curX = this.transport.moveX(dir, this.curX);
        return new int[]{this.curX, this.curY};
    }

    public void speakWhereIam() {
        System.out.println(String.format("i am not at x %s, y %s", this.curX, this.curY));
    }
}
