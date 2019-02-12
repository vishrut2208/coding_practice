package com.vishrutsharma.leetcode.easy;

/*  Problem = 944. Delete Columns to Make Sorted
    Need to check if the columns are sorted,
    if they are no need to delete else count it */



public class ColumnDelSort {

    public int minDeletionSize(String[] A) {

        int count = 0;

        for (int i = 0; i < A[0].length(); ++i) {
            for (int j = 0; j < A.length - 1; ++j) {
                if (A[j].charAt(i) > A[j + 1].charAt(i)) {
                    count++;
                    break;
                }
            }
        }
        System.out.println(count);
        return count;
    }
}
