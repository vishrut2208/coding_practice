package com.vishrutsharma.leetcode.easy;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;
import java.util.HashMap;

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


    public int longestPalindromeSubseq(String s) {
        int[][] dp = new int[s.length()][s.length()];

        for (int i = s.length() - 1; i >= 0; i--) {
            dp[i][i] = 1;
            for (int j = i+1; j < s.length(); j++) {
                if (s.charAt(i) == s.charAt(j)) {
                    dp[i][j] = dp[i+1][j-1] + 2;
                } else {
                    dp[i][j] = Math.max(dp[i+1][j], dp[i][j-1]);
                }
            }
        }
        return dp[0][s.length()-1];
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

    public int lengthOfLongestSubstring(String str) {

        // HashSet<Character> s = new HashSet<>();
        HashMap<Character, Integer> s = new HashMap<>();

        int count = 0, maxcount =0, pointer =0, p=0;
        for(int i=0; i< str.length(); i++) {
            if(s.containsKey(str.charAt(i))){
                p = Math.max(s.get(str.charAt(i)), i);
            }else{
                maxcount = Math.max(maxcount, i-p+1);
                s.put(str.charAt(i), i+1);
            }
        }
        return maxcount;
    }

    public String simplifyPath(String path) {
        if(null == path || path.isEmpty()) return "";
        Deque<String> stack = new ArrayDeque<>();
        for(String cur : path.split("/")) {
            if(cur.equals("..")) stack.pop();
            else if(!cur.equals("") && !cur.equals(".")) stack.push(cur);
        }

        if(stack.isEmpty()) return "/";
        StringBuilder sb = new StringBuilder();
        while(!stack.isEmpty()) sb.append("/").append(stack.pollLast());
        return sb.toString();
    }
}
