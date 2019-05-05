package com.vishrutsharma.sortingSearching;

public class QuickSort {

    public void quickSort(int[] a){
        quickSort(a, 0, a.length -1);

        for(int i=0; i<a.length; i++){
            System.out.println(a[i]);
            //System.out.print("   -->");
        }
    }

    public void quickSort(int[] a, int start, int end){
        if(start < end){
            int pi = partition(a, start, end);

            quickSort(a, start, pi-1);
            quickSort(a, pi+1, end);
        }
    }

    public int partition(int[] a, int start, int end){
        int pivot = a[end];
        int ptr = start;
        int i = start;

        while(i< end){
            if(a[i]<=pivot){
                int temp = a[i];
                a[i] = a[ptr];
                a[ptr] = temp;
                ptr++;
            }
            i++;
        }

        int temp2 = a[end];
        a[end] = a[ptr];
        a[ptr] = temp2;

        return ptr;
    }
}
