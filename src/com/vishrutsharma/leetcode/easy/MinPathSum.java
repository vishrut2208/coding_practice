package com.vishrutsharma.leetcode.easy;

import java.util.Arrays;

public class MinPathSum {


    public int minpathsum(int[][] grid){


        int r = grid.length;
        int c = grid[0].length;

        int[][] ans = new int[r][c];
//
//        for(int p=0; p<r ; p++){
//            Arrays.fill(ans[p], Integer.MAX_VALUE);
//        }

        for(int i =0; i<r; i++){
            for(int j=0; j<c; j++){
                if(i==0 && j==0){
                    ans[i][j] = grid[i][j];
                }else if(i ==0 && j >0){
                    ans[i][j] = ans[i][j-1] + grid[i][j];
                }else if(j==0 && i>0){
                    ans[i][j] = ans[i-1][j] + grid[i][j];
                }else {
                    ans[i][j] = Math.min(ans[i][j-1] + grid[i][j], ans[i-1][j] + grid[i][j]);
                }
            }
        }
        System.out.println(ans[r-1][c-1]);
        return ans[r-1][c-1];
    }
}
