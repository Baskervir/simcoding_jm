package com.simcoding.datastructur.nonlinear.tree.bst;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class BinTreeNode<V> {
    private ParentInfo<V> info;
    private BinTreeNode<V> leftChild;
    private BinTreeNode<V> rightChild;
    private final V value;

    public BinTreeNode(V value) {
        this.value = value;
    }

    public boolean isBiggerThan(BinTreeNode<V> target, Comparator<V> comp){
        int compare = comp.compare(this.value, target.getValue());
        return compare >= 0;
    }

    public boolean isEmpty() {
        return this.leftChild == null && this.rightChild == null;
    }

    public void remove(BinTreeNode<V> target) {
        if(this.leftChild.equals(target)) this.setLeftChild(null);
        else if(this.rightChild.equals(target)) {
            this.setRightChild(null);
        }
    }

    public BinTreeNode<V> findMinimum(){
       return this.findMinimum(this);
    }

    private BinTreeNode<V> findMinimum(BinTreeNode<V> node){
        if(node.leftChild == null) return node;
        else return findMinimum(node.leftChild);
    }



    public void setParentInfo(BinTreeNode<V> parent, boolean isLeft){
        this.info = new ParentInfo<>(parent, isLeft);
    }

    public void setLeftChild(BinTreeNode<V> leftChild) {
        this.leftChild = leftChild;
    }

    public void setRightChild(BinTreeNode<V> rightChild) {
        this.rightChild = rightChild;
    }

    public BinTreeNode<V> getLeftChild() {
        return leftChild;
    }

    public BinTreeNode<V> getRightChild() {
        return rightChild;
    }

    public V getValue() {
        return value;
    }

    public ParentInfo<V> getInfo() {
        return info;
    }

    public void setInfo(ParentInfo<V> info) {
        this.info = info;
    }

    public List<BinTreeNode<V>> getChilds() {
        return Stream.of(this.leftChild, this.rightChild)
                .filter(Objects::nonNull)
                .collect(Collectors.toList());

    }
}
