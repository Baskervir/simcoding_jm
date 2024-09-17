package com.simcoding.tdd;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int k = Integer.parseInt(br.readLine());
        List<Integer> collect = Arrays.stream(br.readLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());
        Queue<Integer> que = new LinkedList<>(collect);

        Stack<Integer> side = new Stack<>();

        int next = 1;

        while(!que.isEmpty()){
            Integer cur = que.peek();
            if(next == cur) {
                next++;
                que.poll();
            }else{
                while(!side.isEmpty() && side.peek() == next){
                    next++;
                    side.pop();
                }

                side.push(que.poll());

            }
        }

        while(!side.isEmpty()){

            if(side.peek() == next){
                next++;
                side.pop();
            }else{
                break;
            }
        }

        if(side.isEmpty()) System.out.println("Nice");
        else System.out.println("Bad");



    }

}