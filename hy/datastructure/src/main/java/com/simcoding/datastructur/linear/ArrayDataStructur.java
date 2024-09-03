package com.simcoding.datastructur.linear;

import com.simcoding.TestExecutor;

import java.util.ArrayList;
import java.util.List;

public class ArrayDataStructur {

    public static void main(String[] args) {

        List<Integer> arrayList = new ArrayList<>();
        TestExecutor.add100_000_00Elements(arrayList);
        TestExecutor.removeRandomIndexFor1000Times(arrayList);

    }

}
