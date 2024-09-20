package com.simcoding.dead_lock;

public class DeadAccountManager {

    private final Object coffeMachine = new Object();
    private final Object cup = new Object();

}
