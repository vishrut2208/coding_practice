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
        if(A.length() %2 ==0){
            if(countodd %2 ==0){
                System.out.println("true");
                return true;
            }
        }else{
            if(countodd == 1){
                System.out.println("true");
                return true;
            }
        }
        System.out.println(false);
        return false;
    }
}
