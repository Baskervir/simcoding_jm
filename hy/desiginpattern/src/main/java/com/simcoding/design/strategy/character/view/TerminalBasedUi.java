package com.simcoding.design.strategy.character.view;

import com.simcoding.design.strategy.character.controller.CharacterController;
import com.simcoding.design.strategy.character.controller.ClientResult;
import com.simcoding.design.strategy.character.controller.CommandResult;

import java.util.Scanner;

public class TerminalBasedUi implements UserInterface{

    public static void main(String[] args) {


        UserInterface ui = new TerminalBasedUi();
        ui.open();
        ui.listen();
        ui.close();

    }

    private Scanner scan;
    private final CharacterController controller = new CharacterController();

    @Override
    public void open() {
        this.scan = new Scanner(System.in);
    }

    @Override
    public void close() {
        this.scan.close();
    }

    @Override
    public void listen() {
        while(true){
            String s = this.scan.nextLine();
            ClientResult result = this.controller.move(s);
            CommandResult move = result.getResult();

            if(move.equals(CommandResult.END)) {
                System.out.println("게임이 종료되었습니다");
                break;
            }

            if(move.equals(CommandResult.ERROR)){
                System.out.println("명령어를 다시 확인해주세요. "+s);
            }
            
            if(move.equals(CommandResult.INIT)){
                System.out.println("게임이 초기화되었습니다");
            }

            if (move.equals(CommandResult.MOVE)){
                int[] curPosition = result.getCurPosition();
                System.out.println("너의 현재 위치는 ?");
                System.out.println("x =>>>>>>>>> "+curPosition[0]);
                System.out.println("y =>>>>>>>>> "+curPosition[1]);

            }


        }
    }
}
