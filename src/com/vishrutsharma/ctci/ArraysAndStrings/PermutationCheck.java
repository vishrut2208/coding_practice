package com.vishrutsharma.ctci.ArraysAndStrings;

import com.sun.org.apache.xpath.internal.operations.Bool;

public class PermutationCheck {


    public boolean isanagram(String A, String B) {

        if ((A.length() != B.length()) || A.length() == 0 || B.length() == 0) {
            System.out.println("false");
            return false;
        }

        int[] count = new int[256];
        for (int i = 0; i < A.length(); i++) {
            count[A.charAt(i)]++;
        }
        for (int i = 0; i < B.length(); i++) {
            count[B.charAt(i)]--;
        }

        for (int c : count) {
            if (c > 0) {
                System.out.println("false");
                return false;
            }
        }
        System.out.println("true");
        return true;

    }
}
