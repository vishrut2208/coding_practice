package com.vishrutsharma.leetcode.easy;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class combinations77 {

    public List<List<Integer>> combine(int n, int k){

        List<List<Integer>> ans = new LinkedList<>();
        List<Integer> temp = new LinkedList<>();

        for(int i=1 ; i<=n; i++){
            temp.add(i);
            combine(ans, temp, i, k-1, n);
            temp.remove(temp.size()-1);
        }

        for(List<Integer> i : ans){
            for(Integer j : i){
                System.out.println(j);
            }
        }

        return ans;
    }

    public void combine(List<List<Integer>> ans, List<Integer> temp, int start, int k, int N){
        if(k ==0){
            ans.add(new ArrayList<>(temp));
            return;
        }

        for(int i=start+1; i<=N; i++){
            temp.add(i);
            combine(ans, temp, i, k-1, N);
            temp.remove(temp.size()-1);

        }

    }
}
