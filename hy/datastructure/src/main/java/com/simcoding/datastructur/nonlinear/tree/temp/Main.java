package com.simcoding.datastructur.nonlinear.tree;

import java.util.ArrayList;
import java.util.Arrays;

import static java.util.Arrays.asList;
import static java.util.Collections.emptyList;

public class Main {
    public static void main(String[] args) {
        Node root = new Node("SANSUNG");

        Node marketing = new Node("marketing",
                new ArrayList<>(Arrays.asList(new MemberInfo("park",20), new MemberInfo("kim",20))),
                new ArrayList<>());

        Node marketing_1 = new Node("marketing_1",
                new ArrayList<>(asList(new MemberInfo("a",20), new MemberInfo("b",20))),
                new ArrayList<>());

        Node marketing_2 = new Node("marketing_2",
                new ArrayList<>(asList(new MemberInfo("c",20), new MemberInfo("d",20))),
                new ArrayList<>());

        marketing.add(marketing_1, marketing_2);

        Node accounting= new Node("accounting",
                new ArrayList<>(asList(new MemberInfo("min",34), new MemberInfo("robin",40))),
                new ArrayList<>());

        root.add(marketing, accounting);

//        Node margketing = root.find("marketing2_2");


        root.preorder(root);
        System.out.println("                ");
        root.Inorder(root);
        System.out.println("                ");
        root.postorder(root);
    }
}
