package com.simcoding.excersize.tree;

public class Node {
    private Node leftChild;
    private Node rightChild;
    final int value;

    public Node(int value) {
        this.value = value;
    }

    public void addChild(Node node){
        int childValue = node.getValue();
        if(this.value > childValue) this.setLeftChild(node);
        else if(this.value < childValue) this.setRightChild(node);
    }
    public boolean isBiggerThan(Node node){
        return this.getValue() > node.getValue();
    }

    public Node getLeftChild() {
        return leftChild;
    }

    public void setLeftChild(Node leftChild) {
        this.leftChild = leftChild;
    }

    public Node getRightChild() {
        return rightChild;
    }

    public void setRightChild(Node rightChild) {
        this.rightChild = rightChild;
    }

    public int getValue() {
        return value;
    }
}
