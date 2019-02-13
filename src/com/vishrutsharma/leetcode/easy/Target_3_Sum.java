package com.vishrutsharma.leetcode.easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class Target_3_Sum {

    public int threeSumCount(int[] A, int T){
        if (A.length < 3 ) {
            System.out.println(0);
            return 0;
        }

        Arrays.sort(A);


        ArrayList<String> ans = new ArrayList<>();
        int count=0;

        for(int i=0; i< A.length-2; i++){
            int j = i+1;
            int k = A.length-1;
            while(j<k){
                if(A[i]+A[j]+A[k] == T){
                    count++;
                    ans.add(A[i]+ ", "+ A[j] + ", "+A[k]);
                    j++;
                }else if(A[i]+A[j]+A[k] < T){
                    j++;
                }else{
                    k--;
                }
            }
        }


        System.out.println(count);
        return count;
    }
}
