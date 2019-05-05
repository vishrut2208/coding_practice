package com.vishrutsharma.leetcode.easy;


public class leetcodeSumP {

    public int maxSum(int[] a){

        int i=0;
        int j= a.length-1;
        int max =a[i] + a[j] + (i-j);
        int maxi = 0;
        int maxj = a.length-1;
        //int maxp =0;

//        while(i < j){
//            max =  Math.max(max,a[i]+a[j] +(i-j));
//            if(a[i] > a[j]){
//                j--;
//            }else if(a[i] == a[j]){
//                if(a[i+1] > a[j-1]){
//                    j--;
//                }else{
//                    i++;
//                }
//            }else{
//                i++;
//            }
//        }

        while(j>maxi && maxj>i){


            if(i<j){
                if (max < (a[i + 1] + a[j - 1] + ((i+1) - (j - 1)))) {
                    max = a[i + 1] + a[j - 1] + ((i+1) - (j - 1));
                }
            }
            if(i>j){
                if (max < (a[i + 1] + a[j - 1] + ((j-1) - (i +1)))) {
                    max = a[i + 1] + a[j - 1] + ((j-1) - (i +1));
                }
            }

            i++;
            j--;
            if(maxi != j){
                if(max < (a[maxi] + a[j] +(maxi-j))){
                    max = (a[maxi] + a[j] +(maxi-j));
                }
            }

            if(maxj != i){
                if(max < (a[i] + a[maxj] +(i-maxj))){
                    max = (a[i] + a[maxj] +(i-maxj));
                }
            }

            if(a[maxi] < a[i]){
                maxi = i;
            }
            if(a[maxj] < a[j]){
                maxj = j;
            }


        }

        System.out.println(max);
           return max;

       }

}
