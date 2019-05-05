package com.vishrutsharma.sortingSearching;

public class BinarySearch {

    public int binarySearch(int[] a, int n, int start, int end){
        if(start < end){
            int mid = start + (end - start)/2;
            if(a[mid] == n){
                System.out.println(mid);
                return mid;
            }
            if(a[mid] > n ){
                return binarySearch(a,n,start, mid-1);
            }

            return binarySearch(a,n,mid+1,end);

        }
        return -1;
    }
}
