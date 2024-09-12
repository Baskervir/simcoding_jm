package com.simcoding.datastructur.nonlinear.graph;

import java.util.List;

public class Main {


    /**
     * A -> B
     * A -> C
     * B -> A
     * C -> D
     * D -> B
     * **/

    public static void main(String[] args) {

        AlphabetGraph alphabetGraph = new AlphabetGraphImpl();
        alphabetGraph.add("A","B");
        alphabetGraph.add("A","C");
        alphabetGraph.add("B","A");
        alphabetGraph.add("C","D");
        alphabetGraph.add("D","B");
        alphabetGraph.add("D","W");


        List<String> a = alphabetGraph.findALlRelated("A");
        List<String> b = alphabetGraph.findALlRelated("D");

        System.out.println(b);
    }
}
