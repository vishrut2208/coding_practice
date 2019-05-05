package com.vishrutsharma.leetcode.easy;

public class StringToInt {


    // may be a negative number

    public int stringToInt(String s){

        int number =0;
        char t;
        boolean flag = false;
        System.out.println(Integer.MAX_VALUE);
        for(int i = 0 ; i<s.length(); i++){

            t = s.charAt(i);
            if(t != '-') {
                number = 10 * number  + (t - '0');
            }else{
                flag = true;
            }
        }
        if(flag == true){
            number *= -1;
        }
        System.out.println(number);
        return number;


    }
}
