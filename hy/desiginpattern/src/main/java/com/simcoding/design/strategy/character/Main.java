package com.simcoding.design.strategy.character;

import com.simcoding.design.strategy.character.controller.CharacterController;

import java.util.Scanner;

/**
 * @apiNote 캐릭터를 이동시키는 어플리케이션이 있다.
 *
 *
 * **/
public class Main {
    public static void main(String[] args) {

        CharacterController controller = new CharacterController();
        Scanner in = new Scanner(System.in);

        while(true){

            String command = in.nextLine();
            controller.move(command);
            if(command.equals("END")) break;

        }


    }
}
