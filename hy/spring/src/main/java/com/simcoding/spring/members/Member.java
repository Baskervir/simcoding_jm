package com.simcoding.spring.members;

public class Member {
    private final Long userId;
    private String name;
    private Grade grade;

    public Member(Long userId, String name, Grade grade) {
        this.userId = userId;
        this.name = name;
        this.grade = grade;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Grade getGrade() {
        return grade;
    }

    public void setGrade(Grade grade) {
        this.grade = grade;
    }

    public Long getUserId(){
        return this.userId;
    }
}
