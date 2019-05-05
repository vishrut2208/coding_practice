package com.vishrutsharma.sortingSearching;

public class CountingSort {

    public int[] countingSort(int[] a){
        int temp =0;
        int[] ans = new int[a.length];
        int[] count = new int[16];
        for(int i=0; i<a.length; i++){
            count[a[i]]++;
        }

        for(int i =0; i<count.length-1; i++){
            count[i+1] = count[i] + count[i+1];
        }


        for(int i=a.length-1; i>=0; i--){
           ans[count[a[i]]-1]= a[i];
           count[a[i]]--;
        }

        for(int i:ans){
            System.out.print(i+" ");
        }

        return  ans;
    }



}
