package com.simcoding.design.strategy;

import com.simcoding.design.strategy.character.Direction;
import com.simcoding.design.strategy.character.MainCharacter;
import com.simcoding.design.strategy.character.moves.CarStrategy;
import com.simcoding.design.strategy.character.moves.FootStretegy;
import com.simcoding.design.strategy.character.moves.ReportDecorator;

/**
 * @apiNote 캐릭터를 이동시키는 어플리케이션이 있다.
 *
 *
 * **/
public class Main {
    public static void main(String[] args) {

        // 캐릭터 시뮬레이션 어플리케이션
        MainCharacter character = new MainCharacter(new ReportDecorator(new FootStretegy()));
        character.move(Direction.UP);
        character.move(Direction.RIGHT);
        character.speakWhereIam();
        character.setTransport(new ReportDecorator(new CarStrategy()));
        //클라이언트 코드(MainChaacter)를 변경하지 않고, 기능을 확장
        character.move(Direction.UP);
        character.speakWhereIam();



    }
}
