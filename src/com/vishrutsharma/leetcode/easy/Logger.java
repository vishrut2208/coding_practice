package com.vishrutsharma.leetcode.easy;

import java.util.*;

public class Logger {

    HashMap<String, Integer> ok;
    public Logger() {
        ok = new HashMap<>();
    }

    public boolean shouldPrintMessage(int timestamp, String message) {
        if (timestamp < ok.getOrDefault(message, 0))
            return false;
        ok.put(message, timestamp + 10);
        return true;


    }

    public String reverseWords(String s) {

        StringBuilder sb = new StringBuilder();

        String[] sub = s.split(" ");

        for(String i : sub){
            sb.append(reverse(i));
            sb.append(" ");
        }

        return sb.toString().trim();


    }

    public String reverse(String p){
            
         char[] c = p.toCharArray();
        char temp ;

        Character t = new Character('a');
        


        for(int i=0; i< c.length/2; i++){
            temp = c[i];
            c[i] = c[c.length -1-i];
            c[c.length-1-i] = temp;
        }


        System.out.println(String.valueOf(c));
        return String.valueOf(c);
    }
}
