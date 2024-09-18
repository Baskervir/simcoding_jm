package com.simcoding.excersize.tree;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.platform.engine.support.hierarchical.Node;

import static org.junit.jupiter.api.Assertions.*;

class NodeTest {

    @Test
    @DisplayName("자식으로 삼고자 하는 노드의 value가 나보다 크다면, 오른쪽 자식으로 삼는다. 또한, 이때 왼족 자식은 null이다")
    public void t(){

        Node parent = new Node(1);
        Node child = new Node(2);

        parent.addChild(child);

        Assertions.assertEquals(child, parent.getRightChild());
        Assertions.assertNull(parent.getLeftChild());

    }

    @Test
    @DisplayName("자식으로 삼고자 하는 노드의 value가 나보다 작다면, 왼쪽 자식으로 삼는다. 또한, 이때 오른쪽 자식은 null이다")
    public void t1(){

        Node parent = new Node(5);
        Node child = new Node(2);

        parent.addChild(child);

        Assertions.assertNull(parent.getRightChild());
        Assertions.assertEquals(child, parent.getLeftChild());

    }

    @Test
    @DisplayName("인자로 주어진 값이, 나보다 크면, isBiggerThan은 false를 반환한다")
    public void tre(){

        Node me = new Node(5);
        Node strong = new Node(6);

        assertFalse(me.isBiggerThan(strong));
    }

    @Test
    @DisplayName("인자로 주어진 값이, 나보다 작으면, isBiggerThan은 true를 반환한다")
    public void tre_0(){

        Node me = new Node(5);
        Node strong = new Node(1);

        assertTrue(me.isBiggerThan(strong));
    }

}