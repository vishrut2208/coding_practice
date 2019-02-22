package com.vishrutsharma.leetcode.easy;

import java.util.LinkedList;
import java.util.Queue;

class Solution {

    int[] D = {0, 1, 0, -1, 0};
    public int orangesRotting(int[][] grid) {

        int row = grid.length;
        int column = grid[0].length;
        boolean[][]visited = new boolean[row][column];
        Queue<Integer> q = new LinkedList<>();


        for(int i = 0; i< row; i++) {
            for(int j = 0; j < column; j++) {
                if(grid[i][j] == 1) {
                    grid[i][j] = Integer.MAX_VALUE;
                }
            }
        }

        for(int i = 0; i< row; i++) {
            for(int j = 0; j < column; j++) {
                if(grid[i][j] == 2) {
                    q.add(i *10 +j);
                    grid[i][j] =0;
                }
            }
        }

        while(!q.isEmpty()){

            int temp = q.poll();

            int i = temp/10;
            int j = temp%10;

            for(int k=0; k< D.length-1; k++){
                int r = i + D[k];
                int c = j + D[k+1];

                if(r >=0 && r<row && c>=0  && c<column && grid[r][c] != 0 && grid[r][c] > grid[i][j]){
                    q.add(r*10+c);
                    grid[r][c] = grid[i][j] + 1;
                }

            }


        }

        int max = 0;
        for(int i = 0; i< row; i++) {
            for(int j = 0; j < column; j++) {
                if(grid[i][j] == Integer.MAX_VALUE) return -1;
                System.out.print(grid[i][j]);
                max = Math.max(max, grid[i][j]);
            }
            System.out.println();
        }



        return max;
    }
}
