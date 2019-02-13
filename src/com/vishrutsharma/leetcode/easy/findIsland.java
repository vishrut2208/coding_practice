package com.vishrutsharma.leetcode.easy;

import java.util.LinkedList;
import java.util.Queue;

public class findIsland {

/* all the questions related to area traversal check for this kind of approach */

    public int islands(int[][] A){
        int[] D = {1,0,-1,0,1};
        int count =0;
        int maxcount =0;
        Queue<Integer> q = new LinkedList<>();

        for(int i=0; i<A.length;i++){
            for(int j=0; j<A[0].length;j++ ){
                if(A[i][j] == 1){
                    q.add(i*10 + j);
                    A[i][j]= -1;
                    count++;
                    while(!q.isEmpty()){
                        int temp  = q.poll();
                        int row = temp/10;
                        int column = temp%10;

                        for(int p =0; p< D.length-1; p++){
                            int x = row + D[p];
                            int y = column + D[p+1];


                            if((x>=0) && (x< A.length) && (y>=0) && (y< A[0].length) && (A[x][y] ==1)){
                                q.add(x*10+y);
                                A[x][y] = -1;

                            }
                        }
                    }
                    if(count >0){
                        maxcount++;
                    }
                    count =0;
                }
            }
        }
        System.out.println(maxcount);
        return maxcount;

    }


}
