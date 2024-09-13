package com.simcoding.datastructur.linear;

import com.simcoding.TestExecutor;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ArrayDataStructur {

        public static void main(String[] args) {
                //초기값을 주는 것과 안 주는 것의 차이도 함께 비교하기
                List<Integer> linkedList = new LinkedList<>();

                TestExecutor.add100_000_00Elements(linkedList);
                TestExecutor.accRandomElementFor10000Times(linkedList);
                TestExecutor.removeRandomIndexFor1000Times(linkedList);
                TestExecutor.insertElementAtRandomIndexFor10_000Times(linkedList);
                System.out.println(linkedList.size());

        }
}

/**
 * ArrayList
 * add timelaps : 4 초 4668
 * random access timelaps : 0 초 1
 * remove timelaps : 5 초 5791
 * insert timelaps : 57 초 57222
 *
 * **/