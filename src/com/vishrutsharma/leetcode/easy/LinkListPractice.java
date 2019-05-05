package com.vishrutsharma.leetcode.easy;

public class LinkListPractice {

    public Node head;

    public class Node {
        int x;
        Node next;

        public Node(int val){
            x =val;
            next = null;
        }
    }

    public Node getHead(){
        return head;
    }

    public boolean addNode(int x){
        Node newNode = new Node(x);
        if( getHead() == null){
            head = newNode;
            return true;
        }else{
            Node curr = getHead();
            while(curr.next != null){
                curr = curr.next;
            }
            curr.next = newNode;
        }
        return true;
    }


   public Node deleteNode(int x){
        if(getHead() == null){
            return null;
        }else{
            Node curr = getHead();
            Node prev = curr;
            while(curr.next!=null){

                if(curr.x == x){
                    prev.next = curr.next;
                    return getHead();
                }
                prev = curr;
                curr = curr.next;
            }
        }
        return getHead();

   }

    public void printlist(Node n){
        if( n == null){
            return;
        }else{
            Node curr = n;
            while(curr!=null){
                System.out.print(curr.x);
                System.out.print(" --> ");
                curr = curr.next;
            }

            System.out.print(" Null ");
        }
    }


    public Node reverseList(Node n){
        if(n == null){
            return null;
        }else if(n.next == null){
            return n;
        }else{
            while(n.next != null){
            Node t = n.next.next;
            n.next.next = head;
            head = n.next;
            n.next = t;
            }
        }
        return head;
    }

    Node reverse(Node h) {
        if(h == null)
            return null;
        Node p = h.next,  q = h,  r;
        while ( p != null ) {
            r = q;         // r follows q
            q = p;         // q follows p
            p = p.next;   // p moves to next node
            q.next = r;   // link q to preceding node
           // printlist(getHead());
        }
        h.next = null;
        return q;
    }


}
