package com.vishrutsharma.leetcode.easy;

import java.util.*;

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

    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> ans = new LinkedList<>();
        Set<Integer> s = new HashSet<>();

        List<Integer> sub;
        if(nums.length <3){
            return ans;
        }


        Arrays.sort(nums);

        for(int i=0; i< nums.length-2; i++){
            int j = i+1;
            int k = nums.length -1;

            while(j<k){

                if(s.contains(nums[i]) && s.contains(nums[j]) && s.contains(nums[k])){
                    break;
                }

                if(nums[i]+nums[j]+nums[k] == 0){
                    sub  = new ArrayList<>();
                    sub.add(nums[i]);
                    sub.add(nums[j]);
                    sub.add(nums[k]);
                    s.add(nums[i]);
                    s.add(nums[j]);
                    s.add(nums[k]);
                    ans.add(sub);
                    j++;
                }else if(nums[i]+nums[j]+nums[k] < 0){
                    j++;
                }else{
                    k--;
                }
            }

        }

        for(List<Integer> i : ans){
            for(Integer o : i){
                System.out.println(o);
            }
        }
        return ans;
    }
}
