package com.vishrutsharma.leetcode.easy;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class Graph {

        int vertexcount;
        ArrayList<ArrayList<Integer>> adjList;

        public Graph(int vertexcount) {
            this.vertexcount = vertexcount;
            this.adjList = new ArrayList<>();
            for(int i=0; i<= vertexcount; i++){
                adjList.add(new ArrayList<>());
            }
        }

        public void addEdge(Graph g, int src, int des){
            g.adjList.get(src).add(des);
        }


        public int[] BFS(Graph g, int src){
            int i=0;
            int[] ans = new int[g.vertexcount+1];
            boolean[] visited = new boolean[g.vertexcount+1];
            Queue<Integer> q = new LinkedList<>();
            q.add(src);
            visited[src] = true;
            visited[0] = true;

            while(! q.isEmpty()){
                int temp = q.poll();
                if(i< vertexcount){
                ans[i] = temp;
                }
                i++;
                int x=0;
                while(x < g.adjList.get(temp).size() && (g.adjList.get(temp).size()>0)){
                    if(!visited[g.adjList.get(temp).get(x)]) {
                        q.add(g.adjList.get(temp).get(x));
                        visited[g.adjList.get(temp).get(x)] = true;
                    }
                    x++;
                }

                if(q.isEmpty()){
                    for(int p=0; p<visited.length; p++){
                        if(!visited[p]){
                            q.add(p);
                        }
                    }
                }

            }

            for(int k : ans){
                System.out.println(k);
            }
            return ans;
        }

}
