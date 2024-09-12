package com.simcoding.excersize.tree;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class IntegerBSTTest {
    IntegerBST integerBst = new IntegerBST();
    @BeforeEach
    public void set(){
        this.integerBst = new IntegerBST();
    }
    @Test
    @DisplayName("트리에 root가 null일 때, insert를 하면, root로 설정된다")
    public void t(){

        Node node = new Node(1);

        integerBst.insert(node);

        Node root = integerBst.getRoot();

        assertEquals(node, root);

    }

    @Test
    @DisplayName("트리에 root가 null일 때, insert를 하면, root로 설정된다")
    public void t1(){


        List<Node> list = Arrays.asList(new Node(1), new Node(2));
        for (Node next : list) {
            integerBst.insert(next);
        }

        Node root = integerBst.getRoot();

        assertEquals(list.get(0), root);

    }
    /**
     *      3
     *  1         4
     *
     * **/

    @Test
    @DisplayName("트리에 root가 null일 때, insert를 하면, root로 설정된다")
    public void t2(){


        List<Node> list = Arrays.asList(new Node(3), new Node(4), new Node(1));
        for (Node next : list) {
            integerBst.insert(next);
        }

        Node root = integerBst.getRoot();

        assertEquals(list.get(2), root.getLeftChild());
        assertEquals(list.get(1), root.getRightChild());
    }

    /**
     * 5를 집어넣으면,
     *       3
     *    1     4
     *             5
     * **/

    @Test
    @DisplayName("트리에 root가 null일 때, insert를 하면, root로 설정된다")
    public void t2_0(){

        Node node = new Node(3);
        Node node4 = new Node(4);
        Node node1 = new Node(1);
        Node node5 = new Node(5);

        integerBst.insert(node);
        integerBst.insert(node1);
        integerBst.insert(node4);
        integerBst.insert(node5);

        assertEquals(node5, node4.getRightChild());
    }

    /**
     * 5를 집어넣으면,
     *       3
     *    1     4
     *             5
     *               6
     * **/

    @Test
    @DisplayName("트리에 root가 null일 때, insert를 하면, root로 설정된다")
    public void t2_01(){

        Node node = new Node(3);
        Node node4 = new Node(4);
        Node node1 = new Node(1);
        Node node5 = new Node(5);
        Node node6 = new Node(6);

        integerBst.insert(node);
        integerBst.insert(node1);
        integerBst.insert(node4);
        integerBst.insert(node5);
        integerBst.insert(node6);

        assertEquals(node6, node5.getRightChild());
    }


}