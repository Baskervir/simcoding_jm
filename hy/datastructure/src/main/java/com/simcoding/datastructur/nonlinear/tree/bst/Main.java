package com.simcoding.datastructur.nonlinear.tree.bst;

import java.util.Comparator;

import static java.util.Comparator.comparingInt;

public class Main {
    public static void main(String[] args) {

        BinTree<Integer> tree = new BinTree<>(Integer::compare);
        tree.insert(new BinTreeNode<>(3));
        BinTreeNode<Integer> node5 = new BinTreeNode<>(5);
        tree.insert(node5);
        BinTreeNode<Integer> node = new BinTreeNode<>(1);
        tree.insert(node);
        tree.insert(new BinTreeNode<>(2));
        tree.insert(new BinTreeNode<>(4));
        BinTreeNode<Integer> node6 = new BinTreeNode<>(6);
        tree.insert(node6);

        /**
         *                  3
         *           1             5
         *                2    4       6
         *
         *
         *
         * **/
        tree.inOrderTraverse();
        System.out.println(" ");
        tree.delete(node);
        tree.delete(node5);
        System.out.println();
        /**
         *                  3
         *           2             5
         *                   4         6
         *
         *
         *      *                    3
         *          *           2        4
         *          *                        6
         *          *
         * **/
        tree.inOrderTraverse();

    }
}
