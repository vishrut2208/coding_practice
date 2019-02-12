package com.vishrutsharma.ctci.ArraysAndStrings;

public class OneEditAway {

    public boolean oneEditAway(String A, String B){

        if(Math.abs((A.length() - B.length())) >1){
            System.out.println("false");
            return false;
        }

        String s1 = A.length() < B.length() ? A : B;
        String s2 = A.length() < B.length() ? B : A;
        int i=0, j=0;
        boolean odd = false;

        while(i < s1.length() && j< s2.length()){
            if( s1.charAt(i) != s2.charAt(j)){
                if(odd){
                    System.out.println("false");
                    return false;
                }
                odd = true;
                if(s1.length() == s2.length()){
                    i++;
                }
            }else{
                i++;
            }
            j++;
        }
        System.out.println("true");
        return true;

    }
}
