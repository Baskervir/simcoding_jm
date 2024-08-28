package com.simcoding.design.strategy.character;

import com.simcoding.design.strategy.character.model.Direction;
import com.simcoding.design.strategy.character.model.MainCharacter;
import com.simcoding.design.strategy.character.config.InitializerFasade;
import com.simcoding.design.strategy.character.model.moves.CarStrategy;
import com.simcoding.design.strategy.character.model.moves.FootStretegy;
import com.simcoding.design.strategy.character.model.moves.ReportDecorator;

/**
 * @apiNote 캐릭터를 이동시키는 어플리케이션이 있다.
 *
 *
 * **/
public class TestMain {

    public static int[][] map = new int[5][5];
    public static void main(String[] args) {

        //요구사항 변경에 따라서, 어플리케이션 기동 시,
        InitializerFasade facade = new InitializerFasade();
        facade.config();

        // 캐릭터 시뮬레이션 어플리케이션
        MainCharacter character = new MainCharacter(new ReportDecorator(new FootStretegy()));
        character.move(Direction.UP);
        character.move(Direction.RIGHT);
        character.speakWhereIam();
        character.setTransport(new ReportDecorator(new CarStrategy()));
        //클라이언트 코드(MainChaacter)를 변경하지 않고, 기능을 확장
        character.move(Direction.UP);
        character.move(Direction.DOWN);

        character.speakWhereIam();
    }
}
