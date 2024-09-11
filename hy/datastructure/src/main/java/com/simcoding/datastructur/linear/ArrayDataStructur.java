package com.simcoding.datastructur.linear;

import com.simcoding.TestExecutor;

import java.util.ArrayList;
import java.util.List;

public class ArrayDataStructur {

    public static void main(String[] args) {
        //초기값을 주는 것과 안 주는 것의 차이도 함께 비교하기
        List<Integer> arrayList = new ArrayList<>();
        TestExecutor.add100_000_00Elements(arrayList);
        TestExecutor.accRandomElementFor10000Times(arrayList);
        TestExecutor.removeRandomIndexFor1000Times(arrayList);
        TestExecutor.insertElementAtRandomIndexFor10_000Times(arrayList);

        System.out.println(arrayList.size());

    }

}
/**
 * arraylist
 * add timelaps : 0 초 582
 * random access timelaps : 0 초 1
 * remove timelaps : 8 초 8031
 * insert timelaps : 68 초 68631
 *
 *
 * **/