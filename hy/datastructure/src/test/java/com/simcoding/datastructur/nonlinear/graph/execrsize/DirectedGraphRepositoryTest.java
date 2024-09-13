package com.simcoding.datastructur.nonlinear.graph.execrsize;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class DirectedGraphRepositoryTest {

    @Test
    @DisplayName("A에 B를 연결한 이후, 내부 그래프를 확인하면, B의 연결 그룹에는 A가 존재한다. 그러나 역은 성립하지 않는다")
    public void t(){

        DirectedGraphRepository directedGraph = new DirectedGraphRepository();
        directedGraph.connectNode('B','A'); //B -> A

        List<List<Character>> graph = directedGraph.getGraph();

        List<Character> subGraph = graph.get('B' - 'A');
        assertTrue(subGraph.contains('A'));

        List<Character> subGraphForA = graph.get('A' - 'A');
        assertFalse(subGraphForA.contains('B'));
    }

    @Test
    @DisplayName("B를 A에 연결한 이후, 이를 끊어주면, 관계가 그래프에서 삭제된다")
    public void t2(){

        DirectedGraphRepository directedGraph = new DirectedGraphRepository();
        directedGraph.connectNode('B','A'); //B -> A
        directedGraph.connectNode('B','A'); //B -> A

        directedGraph.removeConnection('B','A');

        List<List<Character>> graph = directedGraph.getGraph();

        List<Character> subGraph = graph.get('B' - 'A');
        assertFalse(subGraph.contains('A'));
    }

    @Test
    @DisplayName("B를 A에 연결한 이후, B와 관계된 노드를 찾으면, A가 존재한다")
    public void t3(){

        DirectedGraphRepository directedGraph = new DirectedGraphRepository();
        directedGraph.connectNode('B','A'); //B -> A

        List<Character> relatedNodes = directedGraph.FindAllRelatedNode('B');
        assertEquals(1, relatedNodes.size());
        assertTrue(relatedNodes.contains('A'));

    }

    /**
     * B -> A -> C
     *
     * **/
    @Test
    @DisplayName("B를 A에 연결하고, B와 관계된 노드를 찾으면, A가 존재한다")
    public void t3_1(){

        DirectedGraphRepository directedGraph = new DirectedGraphRepository();
        directedGraph.connectNode('B','A'); //B -> A
        directedGraph.connectNode('A','C');

        List<Character> relatedNodes = directedGraph.FindAllRelatedNode('B');
        assertEquals(3, relatedNodes.size());
        assertTrue(relatedNodes.contains('C'));


        List<Character> characters = directedGraph.FindAllRelatedNode('A');
        assertEquals(2, characters.size());
    }


}