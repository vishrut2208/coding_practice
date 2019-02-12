package com.vishrutsharma.ctci.ArraysAndStrings;

public class ZeroMatrix {

    public void setZeros(int[][] A){
        boolean[] row = new boolean[A.length];
        boolean[] column = new boolean[A[0].length];

        for(int i=0; i< A.length; i++){
            for(int j=0; j< A[0].length; j++ ){
                if(A[i][j] == 0){
                    row[i] = true;
                    column[j] = true;
                }
            }
        }

        for(int i =0; i < row.length; i++){
            if(row[i]){
                nullifyRow(A, i);
            }
        }

        for(int i =0; i < column.length; i++){
            if(column[i]){
                nullifyColumn(A, i);
            }
        }


    }

    public void nullifyRow(int[][] A, int row){
        for(int i = 0; i < A[0].length; i++) {
        A[row][i] = 0;
        }
    }

    public void nullifyColumn(int[][] A, int column){
        for(int i = 0; i < A.length; i++) {
            A[i][column] = 0;
        }
    }


}
