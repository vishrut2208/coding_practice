package com.vishrutsharma.leetcode.easy;

import java.util.Arrays;
import java.util.HashMap;

public class BullsAndCows {

    public String getHint(String secret, String guess) {

        int[] table = new int[10];
        int countA = 0, countB = 0;

        for (int c = 0; c < secret.length(); c++) {
            table[secret.charAt(c) - '0']++;

        }
        //System.out.println(Arrays.toString(table));

        for (int i = 0; i < secret.length(); i++) {
            if (secret.charAt(i) == guess.charAt(i)) {
                countA++;
            }
            if (table[guess.charAt(i) - '0']-- > 0) {
                countB++;
            }
        }


        String temp = countA + "A" + (countB - countA) + "B";

        return temp;

    }
}

