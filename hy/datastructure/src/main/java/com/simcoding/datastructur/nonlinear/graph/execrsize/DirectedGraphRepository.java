package com.simcoding.datastructur.nonlinear.graph.execrsize;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class DirectedGraphRepository implements GraphRepository<Character>{
    //**
    // A - Z
    //
    // **//
    private final List<List<Character>> graph;

    public DirectedGraphRepository() {
        this.graph = new ArrayList<>();
        for(char next='A'; next<='Z'; next++){
               this.graph.add(new ArrayList<>());
        }

        /**
         *
         *         'A' : []
         *         'B' : [A]
         *         'C' : []
         *         ...
         *         'Z' : []
         *
         */
    }

    @Override
    public void connectNode(Character to, Character target) {
        graph.get(getIndex(to)).add(target);
    }

    @Override
    public void removeConnection(Character to, Character target) {
        graph.get(getIndex(to)).remove(target);
    }

    @Override
    public List<Character> FindAllRelatedNode(Character target) {
        return Collections.unmodifiableList(findAllRelated(target, new ArrayList<>(), new boolean[this.graph.size()]));
    }

    private List<Character> findAllRelated(char next,List<Character> container, boolean[] history){

        int index = getIndex(next);
        if(history[index]) return container;
        history[index] = true;

        container.add(next);

        List<Character> characters = this.graph.get(index);

        for (Character character : characters) {
            findAllRelated(character, container,history);
        }

        return container;

    }

    private int getIndex(Character to) {
        return to - 'A';
    }

    public List<List<Character>> getGraph() {
       return Collections.unmodifiableList(graph);
    }
}
