package com.vishrutsharma.leetcode.easy;

import sun.reflect.generics.tree.Tree;

public class BinaryTree {

    TreeNode root;

    public BinaryTree(){
    }

    public TreeNode getRoot() {
        return root;
    }

    public class TreeNode implements Comparable {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode parent;

        public TreeNode(int val) {
            this.val = val;
            this.left = null;
            this.right = null;
            this.parent = null;
        }
        public TreeNode() {
            this.left = null;
            this.right = null;
            this.parent = null;
        }

        public int getVal() {
            return val;
        }

        public void setVal(int val) {
            this.val = val;
        }

        public TreeNode getLeft() {
            return left;
        }

        public void setLeft(TreeNode left) {
            this.left = left;
        }

        public TreeNode getRight() {
            return right;
        }

        public void setRight(TreeNode right) {
            this.right = right;
        }

        public TreeNode getParent() {
            return parent;
        }

        public void setParent(TreeNode parent) {
            this.parent = parent;
        }

        @Override
        public int compareTo(Object o) {
            TreeNode other = (TreeNode) o;
            return this.getVal() - other.getVal();
        }
    }

    public boolean addNode(TreeNode newNode){
        TreeNode current = root;
        if(current == null){
           root = newNode;
           return true;
        }
        TreeNode cur = find(newNode);

       if(cur.compareTo(newNode) >= 0){
           cur.setLeft(newNode);
       }else{
           cur.setRight(newNode);
       }
       newNode.setParent(cur);
       return true;
    }

    public boolean addNode(int val){
        return addNode(new TreeNode(val));
    }

    public void inorderTraversalRecursive(TreeNode node){
        if(node == null){
            return;
        }

        inorderTraversalRecursive(node.getLeft());
        System.out.println(node.val);
        inorderTraversalRecursive(node.getRight());

    }

    public TreeNode find(TreeNode node){
        if(getRoot() == null){
            return null;
        }
        TreeNode current = getRoot();
        TreeNode prev = null;
        while(current !=null){
            prev = current;
            if(current.getVal() == node.val){
                return prev;
            }else if(current.getVal() >= node.val){
                    current = current.getLeft();
            }else{
                current = current.getRight();
            }
        }
         return prev;
    }

    private boolean contains(TreeNode node){
        if( find(node).equals(node)){
            return true;
        }
        return false;
    }

    public TreeNode findMinimum(TreeNode node){
        if(node.getLeft() != null){
            TreeNode pointer = node.getLeft();
            if(pointer.getRight() == null){
                System.out.println(pointer.getVal());
                return pointer;
            }else{
                TreeNode actualP = null;
                while (pointer!= null){
                    actualP = pointer;
                    pointer = pointer.getRight();
                }
                System.out.println(actualP.getVal());
                return actualP;
            }
        }
        return null;
    }

    public TreeNode findMinimum(int val){
        TreeNode cur = find(new TreeNode(val));
        return findMinimum(cur);
    }

    public TreeNode findMaximum(TreeNode node){
        if(node.getRight() != null){
            TreeNode pointer = node.getRight();
            if(pointer.getLeft() == null){
                System.out.println(pointer.getVal());
                return pointer;
            }else{
                TreeNode actualP = null;
                while(pointer!=null){
                    actualP = pointer;
                    pointer = pointer.getLeft();
                }
                System.out.println(actualP.getVal());
                return actualP;
            }
        }
        return null;
    }

    public TreeNode findMaximum(int val){
        TreeNode cur = find(new TreeNode(val));
        return findMaximum(cur);
    }


    public boolean deleteNode(TreeNode node){

        TreeNode toBeDeleted = find(node);

        TreeNode replaceWith1 = findMinimum(toBeDeleted);

        if(replaceWith1.getVal() == toBeDeleted.getLeft().getVal()){
            replaceWith1.setRight(toBeDeleted.getRight());
            if(toBeDeleted.parent.getRight().equals(toBeDeleted)){
                toBeDeleted.parent.setRight(replaceWith1);
            }else{
                toBeDeleted.parent.setLeft(replaceWith1);
            }
        }else{
            if(replaceWith1.parent.getRight().equals(replaceWith1)){
                replaceWith1.parent.setRight(null);
            }else{
                replaceWith1.parent.setLeft(null);
            }
            replaceWith1.setLeft(toBeDeleted.left);
            replaceWith1.setRight(toBeDeleted.right);

            replaceWith1.setParent(toBeDeleted.parent);
            if(toBeDeleted.parent.getRight().equals(toBeDeleted)){
                toBeDeleted.parent.setRight(replaceWith1);
            }else{
                toBeDeleted.parent.setLeft(replaceWith1);
            }
        }

        return true;

    }

    public boolean deleteNode(int val){
        TreeNode cur = find(new TreeNode(val));
        return deleteNode(cur);
    }


}
