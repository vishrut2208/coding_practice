package com.vishrutsharma.leetcode.easy;


import sun.reflect.generics.tree.Tree;

import java.util.*;

public class BinaryTree {

    TreeNode root;
    int diameter =0;

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

// Adding element to the binary tree

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


    // All traversals


    public void inorderTraversalIterative(TreeNode node){
        if(getRoot() == null){
            return;
        }

        Stack<TreeNode> s = new Stack<>();
        TreeNode curr = getRoot();
        while(curr != null || s.size()>0){
            while(curr != null){
                s.push(curr);
                //System.out.println(curr.getVal());
                curr = curr.getLeft();
            }

            curr = s.pop();
            System.out.println(curr.getVal());
            curr = curr.getRight();
        }
    }

    public void preorderTraversalRecursive(TreeNode node){
        if(node == null){
            return;
        }
        System.out.println(node.val);
        preorderTraversalRecursive(node.getLeft());
        preorderTraversalRecursive(node.getRight());
    }

    public void preorderTraversalIterative(TreeNode node){
        if(getRoot() == null){
            return;
        }

        Stack<TreeNode> s = new Stack<>();
        TreeNode curr = getRoot();
        while(curr != null || s.size()>0){
            while(curr != null){
                s.push(curr);
                System.out.println(curr.getVal());
                curr = curr.getLeft();
            }

            curr = s.pop();
            //System.out.println(curr.getVal());
            curr = curr.getRight();
        }
    }

    public void postorderTraversalRecursive(TreeNode node){
        if(node == null){
            return;
        }

        postorderTraversalRecursive(node.getLeft());
        postorderTraversalRecursive(node.getRight());
        System.out.println(node.val);
    }

    public void postorderTraversalIterative(TreeNode node){


    }

    // function to Find a node

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

    // function to find the predecessor

    public TreeNode predecessor(TreeNode node){
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
                //System.out.println(actualP.getVal());
                return actualP;
            }
        }
        return null;
    }

    public TreeNode predecessor(int val){
        TreeNode cur = find(new TreeNode(val));
        return predecessor(cur);
    }

    // function to find successor

    public TreeNode successor(TreeNode node){
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
                //System.out.println(actualP.getVal());
                return actualP;
            }
        }
        return null;
    }

    public TreeNode successor(int val){
        TreeNode cur = find(new TreeNode(val));
        return successor(cur);
    }


    //function to delete a node

    public boolean deleteNode(TreeNode node){
        if(getRoot() ==null){
            return false;
        }

        TreeNode toBeDeleted = find(node);

        if(toBeDeleted.getVal() == node.getVal()) {
            TreeNode replaceWith1 = predecessor(toBeDeleted);

            if(replaceWith1 != null) {

                if(toBeDeleted.getRight() ==null && toBeDeleted.getLeft() == null){
                    if (toBeDeleted.parent.getRight()!= null) {
                        if (toBeDeleted.parent.getRight().equals(toBeDeleted)) {
                            toBeDeleted.parent.setRight(null);
                            return true;
                        }else{
                            toBeDeleted.parent.setLeft(null);
                            return true;
                        }
                    }else {
                        toBeDeleted.parent.setLeft(null);
                        return true;
                    }

                }

                if (replaceWith1.getVal() == toBeDeleted.getLeft().getVal()) {
                    replaceWith1.setRight(toBeDeleted.getRight());
                    replaceWith1.left = null;
                    replaceWith1.setParent(toBeDeleted.getParent());
                    if (toBeDeleted.parent.getRight().equals(toBeDeleted)) {
                        toBeDeleted.parent.setRight(replaceWith1);
                    } else {
                        toBeDeleted.parent.setLeft(replaceWith1);
                    }
                    toBeDeleted.setLeft(null);
                    toBeDeleted.setRight(null);
                    toBeDeleted.setParent(null);
                } else {

                    if( toBeDeleted != getRoot()) {
                        if (toBeDeleted.parent.getRight().equals(toBeDeleted)) {
                            toBeDeleted.parent.setRight(replaceWith1);
                        } else {
                            toBeDeleted.parent.setLeft(replaceWith1);
                        }
                        replaceWith1.setRight(toBeDeleted.right);
                        TreeNode p2 = replaceWith1;
                        if(replaceWith1.getLeft()==null){
                            replaceWith1.setLeft(toBeDeleted.left);
                        }else{
                            while(p2.getLeft()!=null){
                                p2= p2.getLeft();
                            }
                            p2.setLeft(toBeDeleted.left);

                        }

                        replaceWith1.parent.setRight(null);
                        replaceWith1.setParent(toBeDeleted.parent);
                    }else{
                        replaceWith1.setRight(toBeDeleted.right);
                        TreeNode p2 = replaceWith1;
                        if(replaceWith1.getLeft()==null){
                            replaceWith1.setLeft(toBeDeleted.left);
                        }else{
                            while(p2.getLeft()!=null){
                                p2= p2.getLeft();
                            }
                            p2.setLeft(toBeDeleted.left);

                        }
                       // replaceWith1.setLeft(toBeDeleted.left);
                        replaceWith1.parent.setRight(null);
                        replaceWith1.setParent(toBeDeleted.parent);
                        root = replaceWith1;

                    }
                }
            }else{
                replaceWith1 = successor(toBeDeleted);

                if(replaceWith1 != null){
                    if (replaceWith1.getVal() == toBeDeleted.right.getVal()) {
                        if (toBeDeleted.parent.getRight().equals(toBeDeleted)) {
                            toBeDeleted.parent.setRight(replaceWith1);
                        } else {
                            toBeDeleted.parent.setLeft(replaceWith1);
                        }
                        toBeDeleted.setLeft(null);
                        toBeDeleted.setRight(null);
                        toBeDeleted.setParent(null);
                    } else {
                        if (toBeDeleted.parent.getRight().equals(toBeDeleted)) {
                            toBeDeleted.parent.setRight(replaceWith1);
                        } else {
                            toBeDeleted.parent.setLeft(replaceWith1);
                        }
                        replaceWith1.setRight(toBeDeleted.right);
                        replaceWith1.setLeft(toBeDeleted.left);
                        replaceWith1.parent.setLeft(null);
                        replaceWith1.setParent(toBeDeleted.parent);

                        toBeDeleted.setLeft(null);
                        toBeDeleted.setRight(null);
                        toBeDeleted.setParent(null);
                    }
                }
            }
            return true;
        }
        return false;
    }

    public boolean deleteNode(int val){
        TreeNode cur = find(new TreeNode(val));
        return deleteNode(cur);
    }

    public int height(int val){
        TreeNode curr = find(new TreeNode(val));
        return height(curr);
    }

    // function to find the height of a tree

    public int height( TreeNode node){
        if(node == null){
            return 0;
        }
        int left = height(node.getLeft());
        int right = height(node.getRight());
        this.diameter = Math.max(1+ left + right, diameter);
        return 1+ Math.max(left, right);

    }

    public int depth(int val){
        TreeNode curr = find(new TreeNode(val));
        return depth(curr);
    }



    public int depth(TreeNode node){
        int depthcount=0;
        if(getRoot() == null){
            return 0;
        }
        TreeNode current = getRoot();
        TreeNode prev = null;
        while(current !=null){
            prev = current;
            if(current.getVal() == node.val){
                return depthcount;
            }else if(current.getVal() >= node.val){
                depthcount++;
                current = current.getLeft();
            }else{
                depthcount++;
                current = current.getRight();
            }
        }
        return depthcount;
    }

    public int diameter(TreeNode node){
        height(node);
        return this.diameter;
    }

    public void printLeafs(TreeNode node){
        if(node == null){
            return;
        }
        if(node.left == null && node.right == null){
            System.out.println(node.getVal());
        }

        printLeafs(node.left);
        printLeafs(node.right);
    }

    public List<List<Integer>> findLeaves(TreeNode root){
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        if(root == null){
            return null;
        }

        while(root!= null){
            List<Integer> leaves = new ArrayList<>();
            root = leafRemoval(root, leaves);
            result.add(leaves);
        }
        System.out.println(result.toString());
        return result;
    }

    public TreeNode leafRemoval(TreeNode root, List<Integer> result){
        if(root == null){
            return null;
        }

        if(root.left == null && root.right == null){
            result.add(root.val);
            return null;
        }
        root.left = leafRemoval(root.left, result);
        root.right = leafRemoval(root.right, result);
        return root;

    }

    public List<List<TreeNode>> levelorderTraversal(TreeNode node){
        List<List<TreeNode>> ans = new ArrayList<>();

        if(root == null){
            return null;
        }
        TreeNode curr = node;

        Queue<TreeNode> level = new LinkedList<>();
        Queue<TreeNode> parent = new LinkedList<>();
        parent.add(curr);
        ArrayList<TreeNode> y = new ArrayList<>();
        y.add(curr);
        ans.add(y);
        while(!parent.isEmpty()){
            TreeNode temp = parent.remove();
           if(temp.getLeft()!= null){
                level.add(temp.getLeft());
            }

            if(temp.getRight()!= null){
                level.add(temp.getRight());
            }

            if(parent.isEmpty() && !level.isEmpty()){
                ArrayList<Integer> levelans = new ArrayList<>();
//                while(!level.isEmpty()){
//                    TreeNode temp2 =  level.poll();
//                    if(temp2 !=null)
//                    parent.add(temp2);
//                    levelans.add(temp2.getVal());
//                }
                parent = new LinkedList<>(level);
                ans.add(new LinkedList<TreeNode>(level));
                level.clear();
            }

        }
        for(List<TreeNode> lev : ans) {
            for(TreeNode l : lev) {
                System.out.print(l.getVal() + " ");
            }
            System.out.println();
        }
        return ans;
    }

//    public void printPaths(TreeNode node){
//        if(getRoot() == null){
//            return;
//        }
//
//        Stack<TreeNode> s = new Stack<>();
//        TreeNode curr = getRoot();
//        while(curr != null || s.size()>0){
//            while(curr != null){
//                s.push(curr);
//                //System.out.println(curr.getVal());
//                curr = curr.getLeft();
//            }
//
//            curr = s.pop();
//            System.out.println(curr.getVal());
//            curr = curr.getRight();
//        }
//    }



    public void printPaths(TreeNode root)
    {

        String path = "";
        // path.add(root);
        printPaths(root,path);
    }
    public void printPaths(TreeNode root,String path){
        if(root==null)
            return;
        if(root.left==null&&root.right==null){
            path+=Integer.toString(root.getVal());
            path+=" ";
            System.out.print(path+"#");
        }

        path+=Integer.toString(root.getVal());
        path+=" ";
        printPaths(root.left,path);
        printPaths(root.right,path);
    }

    public TreeNode lowestCommonA(TreeNode root, int i, int j){
        if(root == null ) {
            return null;
        }

        Stack<TreeNode> s = new Stack<>();
        TreeNode cur = getRoot();
        s.push(cur);

        while( cur != null || !s.isEmpty()){

            if(cur.getVal() > i && cur.getVal()> j){
                cur = cur.getLeft();
                s.push(cur);
            }else if(cur.getVal() > i && cur.getVal()> j){
                cur = cur.getRight();
                s.push(cur);
            }else{
                System.out.println(s.pop().getVal());
                return s.pop();
            }
        }

        return null;
    }

    public TreeNode subtreeWithAllDeepest(TreeNode root) {
        List<TreeNode> t =  new LinkedList<>();
        int h =dfs(root, t);

        if(t == null){
            return root;
        }else{
            return t.get(t.size()-1);
        }

    }


    public int dfs(TreeNode n, List<TreeNode> t){
        if(n==null){
            return 0;
        }

        int l = dfs(n.left, t);
        int r = dfs(n.right, t);
        if(l>r){
            t.add(0, n.left);
        }else if(r>l){
            t.add(0, n.right);
        }

        return Math.max(l,r) +1;

    }
}
