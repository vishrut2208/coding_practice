package com.vishrutsharma.sorting;

public class Main {

    public static void main(String[] args) {
        BubbleSort b = new BubbleSort();
        SelectionSort s = new SelectionSort();
        InsertionSort i = new InsertionSort();
        MergeSort m = new MergeSort();
        HeapSort h = new HeapSort();
        CountingSort c = new CountingSort();

        int[] a = {6,9,3,5,1,2,8,4,3,7, 1};
        //b.bubbleSort(a);
        //s.selectionSort(a);
        //i.insertionSort(a);
        //m.mergeSort(a);
        //h.heapSort(a);
        c.countingSort(a);

    }
}
