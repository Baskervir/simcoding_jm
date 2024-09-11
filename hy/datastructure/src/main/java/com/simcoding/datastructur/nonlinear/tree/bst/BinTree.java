package com.simcoding.datastructur.nonlinear.tree.bst;

import java.util.Comparator;
import java.util.List;

public class BinTree<V> {

    private BinTreeNode<V> root;
    private Comparator<V> comp;

    public BinTree(BinTreeNode<V> root) {
        this.root = root;
    }

    public BinTree(Comparator<V> comp) {
        this.comp = comp;
    }

    public void insert(BinTreeNode<V> node){
        this.insert(node, this.comp);
    }

    public void insert(BinTreeNode<V> node, Comparator<V> comp){
        if(root == null) {
            this.root = node;
            return;
        }

        BinTreeNode<V> curNode = this.root;
        while(true) {

            if (curNode.isBiggerThan(node, comp == null ? this.comp : comp)) {

                if (curNode.getLeftChild() == null) {
                    curNode.setLeftChild(node);
                    node.setParentInfo(curNode, true);
                    return;
                }

                curNode = curNode.getLeftChild();

            }else{

                if(curNode.getRightChild() == null){
                    curNode.setRightChild(node);
                    node.setParentInfo(curNode, false);
                    return;
                }

                curNode = curNode.getRightChild();
            }
            ;
        }

    }

    /**
     * 1. 리프 노드(자식이 없는 노드) 삭제
     * 2. 자식이 하나인 노드 삭제: 부모와 자식 연결
     * 3. 자식이 둘인 노드 삭제: 오른쪽 서브트리에서 가장 작은 노드 또는 왼쪽 서브트리에서 가장 큰 노드를 선택
     * **/
    public void delete(BinTreeNode<V> node){

        if(this.root .equals(node)) {
            this.root = null;
            return;
        }

        BinTreeNode<V> treeNode = this.find(node.getValue(), this.comp);
        if(treeNode == null) return;

        ParentInfo<V> parentInfo = treeNode.getInfo();
        BinTreeNode<V> parentPointer = parentInfo.getParentPointer();
        boolean left = parentInfo.isLeft();

        if(treeNode.isEmpty()){

            parentPointer.remove(treeNode);
            return;
        }

        List<BinTreeNode<V>> childs = treeNode.getChilds();
        if(childs.size() == 1) {

            setChildPointer(left, parentPointer, childs.get(0));
            return;
        }

        BinTreeNode<V> minimum = treeNode.findMinimum();
        setChildPointer(left, parentPointer, minimum);
        setChildPointer(left, minimum, childs.get(1));


    }

    private static <V> void setChildPointer(boolean left, BinTreeNode<V> parentPointer, BinTreeNode<V> child) {
        if (left) parentPointer.setLeftChild(child);
        else parentPointer.setRightChild(child);
    }


    public BinTreeNode<V> find(V value, Comparator<V> comp){
        BinTreeNode<V> curNode = this.root;
        Comparator<V> curComp = comp == null ? this.comp : comp;
        while(curNode != null){

            V curValue = curNode.getValue();

            if(curValue.equals(value)) return curNode;
            if(curComp.compare(curValue, value) > 0) curNode = curNode.getLeftChild();
            else curNode = curNode.getRightChild();

        }

        return null;
    }

    public void inOrderTraverse() {
        this.inOrderTraverse(this.root);
    }

    private void inOrderTraverse(BinTreeNode<V> next){
        if(next == null) return;
        inOrderTraverse(next.getLeftChild());
        System.out.println(next.getValue());
        inOrderTraverse(next.getRightChild());
    }

    public void preOrderTraverse() {
        this.preOrderTraverse(this.root);
    }

    private void preOrderTraverse(BinTreeNode<V> next){
        if(next == null) return;
        System.out.println(next.getValue());
        inOrderTraverse(next.getLeftChild());
        inOrderTraverse(next.getRightChild());
    }

    public void postOrderTraverse() {
        this.postOrderTraverse(this.root);
    }

    private void postOrderTraverse(BinTreeNode<V> next){
        if(next == null) return;
        inOrderTraverse(next.getLeftChild());
        inOrderTraverse(next.getRightChild());
        System.out.println(next.getValue());
    }

}
