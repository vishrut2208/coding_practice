package com.vishrutsharma.leetcode.easy;

public class Main {

    public static void main(String[] args) {
//        ColumnDelSort q944 = new ColumnDelSort();
//
//        String[] A = {"cba", "daf", "ghi"};
//        q944.minDeletionSize(A);
//
//        TargetSum y = new TargetSum();
//
//        int[] B = {-3, 0, 3, 7, 10};
//        //y.NoOfPairs(B, 10);
//        y.nearestPair(B, 1);

//       int[] c = {1,6,7,4,2};
////
//        LargestIncreasingSubsequence s = new LargestIncreasingSubsequence();
//
//        s.largestIncreasingSubsequence(c);
//        s.linssBinarySearch(c);

//
//            int[] sum = {8,1,1,14,4,4,2,3,1,9,3,4};
//
//            Target_3_Sum s = new Target_3_Sum();
//            s.threeSumCount(sum, 10);

//              Graph g = new Graph(9);
//                g.addEdge(g, 1,3);
//                g.addEdge(g, 3,8);
//                g.addEdge(g, 8,9);
//                g.addEdge(g, 4,7);
//                g.addEdge(g, 7,6);
//                //g.addEdge(g, 2,7);
//                g.addEdge(g, 2,5);
//                g.addEdge(g,1,2);
//                g.addEdge(g, 2,4);
////
////
//                g.BFS(g,1);


//        int[][] l = {{1,1,1,0},{0,0,0,0},{0,0,1,0},{1,0,0,0},{1,1,0,1}};
//        findIsland i = new findIsland();
//        i.islands(l);
//
//
//        BullsAndCows b = new BullsAndCows();
//        b.getHint("11122211", "22122210");

//        CorrectAString s = new CorrectAString();
//
//        s.correctString("iamvishrut");

//
        BinaryTree bt = new BinaryTree();

        bt.addNode(20);
        bt.addNode(10);
        bt.addNode(30);
        bt.addNode(5);
        bt.addNode(7);
        bt.addNode(6);
       // bt.addNode(8);
        bt.addNode(31);
        bt.addNode(29);
        bt.addNode(13);
        //bt.addNode(15);
        bt.addNode(12);
        System.out.println("========================inorder=====================");
        bt.inorderTraversalRecursive(bt.getRoot());

        bt.deleteNode(20);

        System.out.println("========================inorder=====================");
        bt.inorderTraversalRecursive(bt.getRoot());


        //bt.printLeafs(bt.getRoot());
        //bt.findLeaves(bt.getRoot());
        //System.out.println("===============================");
        //bt.inorderTraversalRecursive(bt.getRoot());
//
//        //bt.successor(10);
//        //bt.predecessor(10);
//        System.out.println("===============================");
//        //bt.deleteNode(10);
//        //System.out.println("========================inorder=====================");
//        //bt.inorderTraversalRecursive(bt.getRoot());
//        //System.out.println("========================preorder=====================");
//        //bt.preorderTraversalRecursive(bt.getRoot());
//        System.out.println("========================postorder=====================");
//        bt.postorderTraversalRecursive(bt.getRoot());
//
//        System.out.println("===============Height of the root node=======================");
//        System.out.println(bt.height(bt.getRoot()));
//        System.out.println("===============Height of the node 10=======================");
//        System.out.println(bt.height(10));
//        System.out.println("=============Depth of the root node=============================");
//        System.out.println(bt.depth(bt.getRoot()));
//        System.out.println("=============Depth of the node 10=============================");
//        System.out.println(bt.depth(5));
//        System.out.println("Diameter of the tree==============================================");
//        System.out.println(bt.diameter(bt.getRoot()));
//       // System.out.println(bt.diameter);

        //System.out.println("========================inorder iterative=====================");
       // bt.postorderTraversalIterative(bt.getRoot());



//
//        AlienDictionary a = new AlienDictionary();
//
//        String[] words = {"wrt", "wrf", "ett", "rftt"};
//
//        a.alienDictionary(words);

//        PartitionLabels p = new PartitionLabels();
//        p.partitionLabels("ababcbacadefegdehijhklij");


    }
}
