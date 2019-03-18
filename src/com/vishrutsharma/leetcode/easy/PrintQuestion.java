package com.vishrutsharma.leetcode.easy;

import java.util.Stack;

public class PrintQuestion {


    public String printQuestion(String s){


        StringBuilder sb = new StringBuilder();
        Stack<String> t = new Stack<>();
        String number ="";
        String temp = "";
        for(int i=s.length()-1; i>=0; i--){
            if(s.charAt(i) >= 'a' && s.charAt(i)<='z'){
                temp = s.substring(i, i+1);
                t.push(temp);
                temp ="";
                i--;
                while(i>=0 &&  (!s.substring(i-1, i).equals("]")) && (!s.substring(i-1, i).equals("[")) ){
                    String o = s.substring(i-1, i);
                    number = o+number;
                    i--;
                }
                t.push(number);
                number ="";

                String u = t.pop();
                String a = t.pop();
                for(int j=0; j<Integer.parseInt(u); j++ ){
                    sb.insert(0,a);
                }
            }else if(s.charAt(i) == '[' && temp.equals("")){
                t.push(sb.toString());
                i--;
                while(i>=0 &&(!s.substring(i, i+1).equals("]"))){
                    String o = s.substring(i, i+1);
                    number = o+number;
                    i--;
                }
                t.push(number);
                number ="";

                String u = t.pop();
                String a = t.pop();
                for(int j=0; j<Integer.parseInt(u); j++ ){
                    sb.insert(0,a);
                }
            }

        }
        System.out.println(sb.toString());
        return sb.toString();

    }
}
