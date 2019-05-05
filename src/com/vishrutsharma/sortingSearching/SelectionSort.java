package com.vishrutsharma.sortingSearching;

public class SelectionSort {

    public int[] selectionSort(int[] a){

        int minIndex = 0;

        for(int i=0; i< a.length ; i++){
            minIndex = i;
            for(int j = i+1; j< a.length; j++){
                if(a[minIndex]> a[j]){
                    minIndex = j;
                }
            }
            swap(a,i,minIndex);
        }

        for(int i : a) {
            System.out.println(i);
        }

        return a;
    }

    public void swap(int[] a, int i, int j){
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
}
