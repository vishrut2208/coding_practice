package com.vishrutsharma.leetcode.easy;

import java.util.Arrays;
import java.util.Stack;

public class Bipartite {



        public boolean isBipartite(int[][] graph) {
            int n = graph.length;
            int[] color = new int[n];
            Arrays.fill(color, -1);

            for (int start = 0; start < n; ++start) {
                if (color[start] == -1) {
                    Stack<Integer> stack = new Stack();
                    stack.push(start);
                    color[start] = 0;

                    while (!stack.empty()) {
                        Integer node = stack.pop();
                        for (int nei: graph[node]) {
                            System.out.print(nei);
                            System.out.print(", ");
                            if (color[nei] == -1) {
                                stack.push(nei);
                                color[nei] = color[node] ^ 1;
                            } else if (color[nei] == color[node]) {
                                return false;
                            }
                        }
                        System.out.println("===========");
                    }
                }
            }

            return true;
        }

}
