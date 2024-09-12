package com.simcoding.datastructur.nonlinear.tree.bst;

public class ParentInfo<V> {
    private final BinTreeNode<V> parentPointer;
    private final boolean isLeft;

    public ParentInfo(BinTreeNode<V> parentPointer, boolean isLeft) {
        this.parentPointer = parentPointer;
        this.isLeft = isLeft;
    }

    public boolean isLeft() {
        return isLeft;
    }

    public BinTreeNode<V> getParentPointer() {
        return parentPointer;
    }
}
