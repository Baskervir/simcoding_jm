package com.simcoding.datastructur.linear;

import com.simcoding.TestExecutor;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkedListDataStructur {
    public static void main(String[] args) {

        List<Integer> LinkedList = new LinkedList<>();
        TestExecutor.add100_000_00Elements(LinkedList);
        TestExecutor.accRandomElementFor10000Times(LinkedList);
        TestExecutor.removeRandomIndexFor1000Times(LinkedList);
        TestExecutor.insertElementAtRandomIndexFor10_000Times(LinkedList);

        System.out.println(LinkedList.size());

    }
}
