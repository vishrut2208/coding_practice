package com.vishrutsharma.leetcode.easy;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;

public class TuckCapacity {



    public List<List<Integer>> closetlocation(int totalc, List<List<Integer>> alllocation, int tc){
       if(tc >= totalc){
           return alllocation;
       }
        List<List<Integer>> ans = new LinkedList<>();
        PriorityQueue<Double> q = new PriorityQueue<>();

        for(List<Integer> i : alllocation){
            double distance = Math.pow(i.get(0), 2) + Math.pow(i.get(1),2);

            if(q.size() <tc){
                q.add(distance);
                ans.add(new LinkedList<>());
                ans.get(ans.size()-1).add((int)i.get(0));
                ans.get(ans.size()-1).add((int)i.get(1));
            }else if(q.peek() > distance){
                    q.poll();
                    ans.remove(ans.size()-1);
                    q.add(distance);
                    ans.add(new LinkedList<>());
                    ans.get(ans.size()-1).add((int)i.get(0));
                    ans.get(ans.size()-1).add((int)i.get(1));

            }
        }
        for(List<Integer> i : ans ){
            System.out.println(i);
        }
        return ans;

    }
}
