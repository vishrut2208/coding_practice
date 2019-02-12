package com.vishrutsharma.ctci.ArraysAndStrings;

public class RotateMatrix {

    public boolean rotateMatrix(int[][] A){

        if(A.length ==0 || A.length != A[0].length){
            System.out.println("false");
            return false;
        }

        int n = A.length;

        for(int i =0; i < n/2; i++ ){
            int first = i;
            int last = n-1-i;
            for(int j = first; j< last; j++){
                int offset = j-first;

                int top = A[first][j];

                A[first][j] = A[last - offset][first];

                A[last-offset][first] = A[last][last - offset];

                A[last][last - offset] = A[j][last];

                A[j][last] = top;
            }
        }
        //System.out.println(A);
        return true;
    }
}
