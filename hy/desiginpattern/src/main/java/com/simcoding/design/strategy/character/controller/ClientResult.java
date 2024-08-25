package com.simcoding.design.strategy.character.controller;

public class ClientResult {
    private final CommandResult result;
    private int[] curPosition;

    public ClientResult(CommandResult result) {
        this.result = result;
    }

    public ClientResult(int[] move) {
        this.result = CommandResult.MOVE;
        this.curPosition = new int[]{move[0], move[1]};
    }

    public int[] getCurPosition() {
        return curPosition;
    }

    public CommandResult getResult() {
        return result;
    }
}
