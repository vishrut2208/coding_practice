package com.vishrutsharma.leetcode.easy;

import java.util.*;

public class TargetSum {

    public static int NoOfPairs(int[] A, int T) {

        if (A.length == 0 || (A.length == 1 && A[0] != T)) {
            System.out.println(0);
            return 0;
        }

        HashSet<Integer> s = new HashSet<>();
        int count = 0;
        ArrayList<String> ans = new ArrayList<>();

        for (int i = 0; i < A.length; i++) {
            if (s.contains(T - A[i])) {
                count++;
                ans.add(T - A[i] + ", " + A[i]);

            } else {
                s.add(A[i]);
            }
        }

        System.out.println(count);
        return count;
    }

    public static ArrayList<String> nearestPair(int[] A, int T){
        Arrays.sort(A);
        int i =0;
        int j = A.length-1;
        //String minpair;
        int min = Integer.MAX_VALUE;
        ArrayList<String> ans = new ArrayList<>();

        while(i<j){
            int temp = A[i] + A[j];

            if( temp == T){
                ans.add(A[i]+ ", " + A[j]);
            }else if(temp > T){
                if(Math.abs(T - temp) < min ){
                    min = Math.abs(T - temp);
                    if(ans.size()>1){
                    ans.remove(0);}
                    ans.add(0,A[i]+ ", " + A[j]);}

                j--;
            }else{
                if(Math.abs(T - temp) < min ){
                    min = Math.abs(T - temp);
                    if(ans.size()>1){
                        ans.remove(0);}
                        ans.add(0,A[i]+ ", " + A[j]);}

                i++;
            }

        }
        for(String s : ans){
            System.out.println(s);
        }
        return ans;
    }


}
