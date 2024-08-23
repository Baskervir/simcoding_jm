package com.simcoding.tdd.ui;

import java.util.Scanner;

public class TerminalUserInterface implements UserInterface{
    private final Scanner in = new Scanner(System.in);
    @Override
    public String input() {
        return in.nextLine();
    }

    @Override
    public void out(String message) {
        System.out.print(message);
    }

    @Override
    public void close() {
        this.in.close();

    }
}
