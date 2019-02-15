package com.vishrutsharma.leetcode.easy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class PartitionLabels {

    public List<Integer> partitionLabels(String S) {


        List<Integer> ans = new ArrayList<>();

        int[] Last = new int[26];

        for (int i = 0; i < S.length(); i++) {
            Last[S.charAt(i) - 'a'] = i;
        }

        int j = 0, pointer = 0;

        for (int i = 0; i < S.length(); i++) {

            j = Math.max(j, Last[S.charAt(i) - 'a']);

            if (i == j) {
                ans.add(i - pointer + 1);
                pointer = i + 1;
            }

        }
        System.out.println(ans.toString());
        return ans;
    }

}
