package com.vishrutsharma.leetcode.easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class TargetSum {

    public static int NoOfPairs(int[] A, int T) {

        if (A.length == 0 || (A.length == 1 && A[0] != T)) {
            System.out.println(0);
            return 0;
        }

        HashMap<Integer, Integer> s = new HashMap<>();
        int count = 0;
        ArrayList<String> ans = new ArrayList<>();

        for (int i = 0; i < A.length; i++) {
            if (s.containsKey(T - A[i])) {
                count++;
                ans.add(T - A[i] + ", " + A[i]);

            } else {
                s.put(A[i], i);
            }
        }

        System.out.println(count);
        return count;
    }

    public static String nearestPair(int[] A, int T) {
        if (NoOfPairs(A, T) == 0) {
            Arrays.sort(A);
            int min = Integer.MAX_VALUE;
            ArrayList<String> ans = new ArrayList();

            for (int i = 0; i < A.length - 1; i++) {
                int temp = A[i] + A[i + 1];

                int diff = Math.abs(T - temp);


                min = Math.min(min, diff);

                if (min == diff) {
                    ans.add(0, A[i] + ", " + A[i + 1]);
                }
            }
            System.out.println(ans.get(0));
            return ans.get(0);
        }
        return null;

    }


}
