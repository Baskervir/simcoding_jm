package com.simcoding.design.strategy.character.view;

import com.simcoding.design.strategy.Main;
import com.simcoding.design.strategy.TestMain;
import com.simcoding.design.strategy.character.controller.ClientResult;

public class TerminalBasedUi implements UserInterface{
    @Override
    public void outMap(ClientResult result) {

        int[][] map = TestMain.map;
        int[] curPosition = result.getCurPosition();

        clear();
        for (int i = 0; i < map.length; i++) {
            StringBuilder b = new StringBuilder();
            for (int i1 = 0; i1 < map[i].length; i1++) {
                if (i == curPosition[1] && i1 == curPosition[0]) {
                    b.append("*");
                } else {
                    b.append("O");
                }
            }
            System.out.println(b);
        }
    }

    @Override
    public void outInitCompletedMessage() {
        System.out.println("게임이 초기화되었습니다");
    }

    @Override
    public void outInvalidCommand(String invalidCommand) {
        System.out.println("명령어를 다시 확인해주세요. "+invalidCommand);
    }

    @Override
    public void outGameEndMessage() {
        System.out.println("게임이 종료되었습니다");
    }

    private void clear() {
        for (int i = 0; i < 10; i++) {
            System.out.println();
        }
    }
}
