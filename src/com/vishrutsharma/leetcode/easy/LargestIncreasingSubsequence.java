package com.vishrutsharma.leetcode.easy;

import java.util.Arrays;

public class LargestIncreasingSubsequence {

    public int largestIncreasingSubsequence(int[] A) {

        int[] dp = new int[A.length];
        if (A.length == 0 || A.length == 1) {

            return A.length;
        }
        Arrays.fill(dp, 1);

        int maxcount = 0;
        for (int i = 1; i < A.length; i++) {
            int max = 0;
            for (int j = 0; j <= i - 1; j++) {
                if (A[i] > A[j]) {
                    max = Math.max(max, dp[j]);
                }
            }
            dp[i] = max + 1;
            maxcount = Math.max(maxcount, dp[i]);

        }
        System.out.println(maxcount);
        return maxcount;
    }

    public int linssBinarySearch(int[] A) {
        int[] dp = new int[A.length];
        int len = 0;
        for (int a : A) {
            int i = Arrays.binarySearch(dp, 0, len, a);
            if (i < 0) {
                i = -(i + 1);
            }
            dp[i] = a;
            if (len == i) {
                len++;
            }
            System.out.println(Arrays.toString(dp)+" "+ i);
        }
        System.out.println(len);
        return len;

    }
}
