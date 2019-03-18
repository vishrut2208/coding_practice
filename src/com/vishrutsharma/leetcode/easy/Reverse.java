package com.vishrutsharma.leetcode.easy;

public class Reverse {

    public int reverse(int n){
        int remainder=0;
        int temp=0;
        while(n>0){
            remainder = n%10;
            temp = temp *10 + remainder;
            n= n/10;

        }
        System.out.println(temp);
        return temp;
    }


}
