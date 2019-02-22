package com.vishrutsharma.leetcode.easy;

public class InsertElement {

//    public int insertIndex(int[] a, int k, int start, int end){
//
//        if(start <= end){
//            int mid = start+(end-1) / 2;
//
//            if(k == a[mid]){
//                return mid;
//            }else if(k < a[mid]){
//                return insertIndex(a, k, start, mid-1);
//            }else{
//               return insertIndex(a,k, mid+1, end );
//            }
//
//        }
//        return start;
//
//    }

    int binarySearch(int arr[], int l, int r, int x)
    {
        if (r >= l) {
            int mid = l + (r - l) / 2;

            if (arr[mid] == x)
                return mid;

            if (arr[mid] > x)
                return binarySearch(arr, l, mid - 1, x);

            return binarySearch(arr, mid + 1, r, x);
        }

        System.out.println(l);
        return l;
    }

}
