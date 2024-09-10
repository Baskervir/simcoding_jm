package com.simcoding.datastructur.nonlinear.tree;

public class MemberNode{
    private final String name;
    private final int age;
    public MemberNode(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
