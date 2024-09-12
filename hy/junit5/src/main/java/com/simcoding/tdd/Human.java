package com.simcoding.tdd;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Human {

    public static void main(String[] args) {

        List<Human> humans = new ArrayList<>();
        humans.add(new Human("hh", 31));
        humans.add(new Human("hi", 13));
        humans.add(new Human("jm", 21));


        Comparator<Human> humanComparator = (h1, h2)->{
            int age1 = h1.age;
            int age2 = h2.age;

            return -1*(age1 - age2);
        };

        humans.sort(humanComparator);

        for (Human human : humans) {
            System.out.println(human.name+" "+human.age);
        }

    }
    private String name;
    private int age;

    public Human(String name, int age) {
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
