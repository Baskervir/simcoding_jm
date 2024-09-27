package com.simcoding.question.q1;

public class BankAccount {
    private final int userId;
    private int balance;

    public BankAccount(int userId) {
        this.userId = userId;
        this.balance = 0;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }
}
