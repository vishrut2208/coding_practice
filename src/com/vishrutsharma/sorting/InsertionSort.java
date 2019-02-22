package com.vishrutsharma.sorting;

public class InsertionSort {

    public int[] insertionSort(int[] a) {


        int j=0, p=0;
        for (int i=1; i <a.length; i++){
            j=i-1;
            p=i;
            while(j>=0){
                if(a[p] < a[j]){
                    swap(a, p, j);
                }else{
                    break;
                }
                j--;
                p--;
            }

        }

        for(int i : a){
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
