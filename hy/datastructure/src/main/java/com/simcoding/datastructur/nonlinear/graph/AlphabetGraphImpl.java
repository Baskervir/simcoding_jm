package com.simcoding.datastructur.nonlinear.graph;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class AlphabetGraphImpl implements AlphabetGraph{
    static private Map<String, Integer> index = new HashMap<>();
    static private Map<Integer, String> reverseIndex = new HashMap<>();
    static private List<List<Integer>> graph = new ArrayList<>();

    static {
        int idx = 0;
        for(char i='A'; i<='Z'; i++){
            index.put(i+"", idx);
            reverseIndex.put(idx, i+"");
            idx++;
            graph.add(new ArrayList<>());
        }
    }
    @Override
    public void add(String to, String target){

        Integer from = index.get(to);
        Integer data = index.get(target);

        graph.get(from).add(data);
    }

    @Override
    public void remove(String from, String target){
        Integer container = index.get(from);
        Integer data = index.get(target);

        Integer removeIdx = graph.get(container).remove(data.intValue());
        System.out.println(removeIdx+" is removed");

    }

    @Override
    public List<String> findALlRelated(String from) {
        return this.findALlRelated(index.get(from), new ArrayList<>(), new boolean[graph.size()])
                .stream()
                .map(t->reverseIndex.get(t))
                .collect(Collectors.toList());
    }

    private List<Integer> findALlRelated(int nextIdx, List<Integer> list, boolean[] history){
        if(history[nextIdx]) return list;

        List<Integer> connectedNodes = graph.get(nextIdx);
        history[nextIdx] = true;
        list.add(nextIdx);

        for (Integer connectedNode : connectedNodes) {
            findALlRelated(connectedNode, list, history);
        }

        return list;
    }

    @Override
    public String toString() {
        return "AlphabetGraph "+graph;
    }
}
