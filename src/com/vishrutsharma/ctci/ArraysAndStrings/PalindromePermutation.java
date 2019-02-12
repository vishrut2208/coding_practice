package com.vishrutsharma.ctci.ArraysAndStrings;

public class PalindromePermutation {


    public boolean palindromePermutation(String A){
        if(A.length() == 0){
            return false;
        }

        int[] count = new int[256];
        int countodd=0;

        for(int i=0; i<A.length(); i++){
            count[A.charAt(i)]++;
            if(count[A.charAt(i)] % 2 ==1){
                countodd++;
            }else{
                countodd--;
            }
        }

        System.out.println(countodd<=1);
        return countodd<=1;
    }
}
