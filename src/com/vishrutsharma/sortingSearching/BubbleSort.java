package com.vishrutsharma.sortingSearching;

public class BubbleSort {

    public int[] bubbleSort(int[] a){
        boolean tag = true;
        while(tag){
            tag = false;
            for( int i =0; i< a.length-1 ; i++){
                if(a[i]> a[i+1]){
                    swap(a,i, i+1);
                    //count++;
                    tag = true;
                }
            }
        }

        for(int i : a) {
            System.out.println(i);
        }
        return a;
    }

    public void swap(int[] a,int i, int j){
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
}
