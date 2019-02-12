package com.vishrutsharma.ctci.ArraysAndStrings;

import java.util.Arrays;

public class UniqueCharacter {

    public boolean isUnique(String s) {
        if (s.length() > 256 || s.length() < 1) {
            return false;
        }
        int[] count = new int[256];
        char[] character = s.toCharArray();

        for (char c : character) {
            if (c >= 'a' && c <= 'z') {
                count[c]++;
                if (count[c] > 1) {
                    System.out.println("false");
                    return false;
                }
            }
        }

        System.out.println("true");
        return true;
    }

    public boolean isUniquesorting(String s) {
        if (s.length() > 256 || s.length() < 1) {
            return false;
        }
        char[] c = s.toCharArray();
        Arrays.sort(c);

        for (int i = 0; i < c.length - 1; i++) {
            if (c[i] == c[i + 1]) {
                System.out.println("false");
                return false;
            }
        }
        System.out.println("true");
        return true;
    }


}


