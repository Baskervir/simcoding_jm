package com.simcoding.design.strategy;

import com.simcoding.design.strategy.character.Direction;
import com.simcoding.design.strategy.character.MainCharacter;
import com.simcoding.design.strategy.character.MovableCharacter;
import com.simcoding.design.strategy.character.moves.FootStretegy;

/**
 * @apiNote 캐릭터를 이동시키는 어플리케이션이 있다.
 *
 *
 * **/
public class Main {
    public static void main(String[] args) {

        // 캐릭터 시뮬레이션 어플리케이션
        MovableCharacter character = new MainCharacter(new FootStretegy());
        character.move(Direction.UP);
        character.move(Direction.RIGHT);


        character.speakWhereIam();
    }
}
