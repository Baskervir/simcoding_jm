package com.simcoding.excersize.tree;

public class IntegerBST implements BST{
    private Node root;

    public IntegerBST(Node root) {
        this.root = root;
    }

    public IntegerBST() {
    }

    @Override
    public void insert(Node node) {
        if(this.root == null) {
            this.root = node;
            return;
        }

        Node currentNode = this.root;
        while(true) {
            if (currentNode.getValue() == node.getValue()) return;

            if(currentNode.isBiggerThan(node)){
                if(currentNode.getLeftChild() == null) {
                    currentNode.addChild(node);
                    return;
                }
                else{
                    currentNode = currentNode.getLeftChild();
                }
            }else{
                if(currentNode.getRightChild() == null) {
                    currentNode.addChild(node);
                    return;
                }
                else{
                    currentNode = currentNode.getRightChild();
                }
            }


        }


    }

    @Override
    public void remove(Node node) {

    }

    @Override
    public Node find(Node node) {
        return null;
    }

    /**
     * @apiNote only use for test
     * **/
    Node getRoot() {
        return root;
    }
}
