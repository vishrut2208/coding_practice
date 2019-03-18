package com.vishrutsharma.leetcode.easy;

public class LinkList {

    public Node root;

    public class Node{
        char val;
        Node next;

        public Node(char val){
            this.val = val;
            this.next = null;
        }
    }

    public LinkList(){
        this.root = null;
    }

    public Node getRoot(){
        return root;
    }


    public boolean addNode(char val){

        Node newNode = new Node(val);

        if(root == null){
            root = newNode;
            return true;
        }else{
            Node curr = getRoot();
            while(curr.next!=null){
                curr = curr.next;
            }
            curr.next = newNode;
        }
        return true;
    }

    public void print(Node n){

        while(n!= null){
            System.out.println(n.val);
            n= n.next;
        }
    }
}
