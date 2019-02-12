package com.vishrutsharma.ctci.ArraysAndStrings;

public class CountCompression {

    public String compression(String A){
        StringBuilder s = new StringBuilder();

        int count =0;

        for(int i =0; i< A.length(); i++){
            count++;
            if((i+1) >= A.length() || (A.charAt(i) != A.charAt(i+1))){
                s.append(A.charAt(i));
                s.append(count);
                count =0;
            }
        }
        System.out.println(s.length() < A.length() ? s.toString() : A);
        return s.length() < A.length() ? s.toString() : A;
    }
}
