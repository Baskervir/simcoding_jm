package com.simcoding.datastructur.nonlinear.graph;

import java.util.List;

public interface AlphabetGraph {

     void add(String to, String target);

     void remove(String from, String target);

      List<String> findALlRelated(String from);
}
