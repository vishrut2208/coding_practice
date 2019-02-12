package com.vishrutsharma.ctci.ArraysAndStrings;

public class StringRotation {

    public boolean isRotation(String s1, String s2){
        if( s1.length() == s2.length() && s1.length()>0){

            String temp = s1 + s1;
            System.out.println(temp.contains(s2));
            return temp.contains(s2);
        }
        System.out.println("fasle");
        return false;
    }
}
