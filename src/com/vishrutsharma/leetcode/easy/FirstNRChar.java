package com.vishrutsharma.leetcode.easy;

import java.util.Arrays;

public class FirstNRChar {

    public int firstNonRepeatingChar(String s){
        if(s == "" || s.length() <1){
            return -1;
        }

        int[] ch = new int[256];

        Arrays.fill(ch, -1);

        for(int i =0; i <s.length(); i++){

            if(ch[s.charAt(i)] == -1){
                ch[s.charAt(i)] =i;
            }else{
                ch[s.charAt(i)] = -2;
            }
        }
        int index=Integer.MAX_VALUE;
        for(int j : ch ){
            if(j >=0) {
                index = Math.min(index, j);
            }
        }
        System.out.println(s.charAt(index));
        return index;
    }
}
