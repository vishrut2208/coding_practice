package com.vishrutsharma.sorting;

public class MergeSort {

   public int[] mergeSort(int[] a){
   int[] helper = new int[a.length];
   mergeSort(a, helper, 0,a.length-1);
   for(int i:a ){
       System.out.println(i);
   }
   return a;
   }

   public void mergeSort(int[] a, int[] helper, int start, int end){
       if(start < end){
           int mid = (start + end) /2;

           mergeSort(a, helper, start, mid);
           mergeSort(a, helper, mid+1, end);
           merge(a, helper, start, mid, end);
       }
   }

   public void merge(int[] a, int[] helper, int start, int mid, int end){
       for(int i=start; i<=end; i++){
           helper[i] = a[i];
       }

       int left = start;
       int right = mid+1;
       int current = start;

       while(left<= mid && right <= end){
           if(helper[left] < helper[right]){
               a[current] = helper[left];
               left++;
           }else{
               a[current] = helper[right];
               right++;
           }
           current++;
       }

       int remaining = mid -left;

       for(int i=0; i<=remaining; i++){
           a[current+i] = helper[left+i];
       }
   }
}