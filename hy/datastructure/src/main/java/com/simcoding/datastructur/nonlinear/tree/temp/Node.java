package com.simcoding.datastructur.nonlinear.tree;


import java.util.*;

public class Node {
    private final String name;
    private final List<MemberInfo> members;
    private final List<Node> childs;

    public Node(String name, List<MemberInfo> members, List<Node> childs) {
        this.name = name;
        this.members = members;
        this.childs = childs;
    }
    public Node(String name) {
        this.name = name;
        this.members = new LinkedList<>();
        this.childs = new LinkedList<>();
    }

    public void preorder(Node node){
        System.out.println(name);
        for (Node child : node.childs) {
            child.preorder(child);
        }
    }

    public void Inorder(Node node){
        for (Node child : node.childs) {
            child.preorder(child);
            System.out.println(name);
        }
    }

    public void postorder(Node node){
        for (Node child : node.childs) {
            child.preorder(child);
        }
        System.out.println(this.name);
    }

    public void add(Node ...node){
        this.childs.addAll(Arrays.asList(node));
    }

    public void addMember(MemberInfo member){
        this.members.add(member);
    }

    public String getName() {
        return name;
    }

    public List<MemberInfo> getMembers() {
        return Collections.unmodifiableList(members);
    }

    public List<Node> getChilds() {
        return Collections.unmodifiableList(childs);
    }

    public Node find(String query) {
        if(this.name.equals(query)) return this;
        return this.find(this, query);
    }

    /**
     * @return 찾는 값이 없을 경우, null을 반환한다.
     * **/
    private Node find(Node node, String query) {
        if(node == null) return null;
        if(node.name.equals(query)) return this;

        for (Node child : node.getChilds()) {
            Node result = child.find(child, query);
            if(result != null) return result;
        }

        return null;
    }

    @Override
    public String toString() {
        return "Node{" +
                "name='" + name + '\'' +
                ", members=" + members +
                ", childs=" + childs +
                '}';
    }
}
