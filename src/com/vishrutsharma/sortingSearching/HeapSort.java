package com.vishrutsharma.sortingSearching;

public class HeapSort {



    public int[] heapSort(int[] a){

        // build the heap
        for(int i = a.length/2; i>=0; i--){
            heapfiy(a, a.length, i);
        }

        for(int i = a.length-1; i>=0; i--){
            swap(a,0,i);
            heapfiy(a, i, 0);
        }
        for(int i: a){
            System.out.println(i);
        }

        return a;

    }



    public void heapfiy(int[] a, int size, int i){

        int smallest = i;
        int left = 2*i + 1;
        int right = 2*i +2;

        if( left < size && a[left] < a[smallest]){
            smallest = left;
        }
        if(right < size && a[right] < a[smallest]){
            smallest = right;
        }

        if(smallest != i){
            swap(a, i, smallest);
            heapfiy(a, size, smallest);
        }

    }

    public void swap(int[] a, int i, int j){
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }



}
