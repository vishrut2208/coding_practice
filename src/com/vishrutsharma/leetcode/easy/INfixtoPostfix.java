package com.vishrutsharma.leetcode.easy;

import org.omg.CORBA.INTERNAL;

import java.util.HashMap;
import java.util.Stack;

public class INfixtoPostfix {

    HashMap<String, Integer> h = new HashMap<>();

    public void helper(Stack<String> so, Stack<String>sop){
        String temp1 = so.pop();
        String temp2 = so.pop();
        String temp3 = sop.pop();
        String add = temp2 + temp1 + temp3;
        so.push(add);
    }
    public void calculate(Stack<String> so, Stack<String>sop){
        int temp1 = Integer.parseInt(so.pop());
        int temp2 = Integer.parseInt(so.pop());
        int add =0;
        String temp3 = sop.pop();
        if(temp3.equals("*")){
             add = temp2 * temp1;
        }else if(temp3.equals("/")){
            add = temp2 / temp1;
        }else if(temp3.equals("+")){
             add = temp2 + temp1;
        }else if(temp3.equals("-")){
             add = temp2 - temp1;
        }else if(temp3.equals("^")){
            double ans = Math.pow((double) temp2, (double) temp1);
             add = (int) ans;
        }

        so.push(Integer.toString(add));
    }

    public String infixToPostfix(String s) {

        h.put("^", 4);
        h.put("/", 3);
        h.put("*", 3);
        h.put("+", 1);
        h.put("-", 1);
        h.put("(", 7);
        h.put(")", 7);
        //a*b^(c^d)-e
        Stack<String> so = new Stack<>();
        Stack<String> sop = new Stack<>();

        int number = Integer.parseInt(s.substring(0, 1));
        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) >= '0' && s.charAt(i) <= '9') {
                int temp1 = Integer.parseInt(s.substring(i, i + 1));
                number = (number * 10) + temp1;
            } else if ((s.charAt(i) == '^' || s.charAt(i) == '/' || s.charAt(i) == '*' || s.charAt(i) == '+' || s.charAt(i) == '-') && sop.isEmpty()) {
                if(number !=0){
                    so.push(Integer.toString(number));
                    number = 0;
                }
                sop.push(s.substring(i, i + 1));
            } else if ((!s.substring(i, i + 1).equals(")"))){
                        if (s.substring(i,i+1).equals("(")) {
                            sop.push(s.substring(i, i + 1));
                        }else if(sop.peek().equals("(")){
                            if(number !=0){
                                so.push(Integer.toString(number));
                                number = 0;
                            }
                            sop.push(s.substring(i, i + 1));
                        }else if ((h.get(s.substring(i, i + 1)) > h.get(sop.peek()))) {
                                    if(number !=0){
                                        so.push(Integer.toString(number));
                                        number = 0;
                                    }
                                    sop.push(s.substring(i, i + 1));

                        }else{
                            if(number !=0){
                                so.push(Integer.toString(number));
                                number = 0;
                            }
                            while ((sop.size() > 0) && (h.get(s.substring(i, i + 1)) < h.get(sop.peek())) && (!sop.peek().equals("("))) {
                                //helper(so,sop);
                                calculate(so, sop);
                            }

                            sop.push(s.substring(i, i + 1));
                        }
            } else{
                if(number !=0){
                    so.push(Integer.toString(number));
                    number = 0;
                }
                    while (!sop.peek().equals("(")) {
                        //helper(so,sop);
                        calculate(so, sop);
                    }
                    sop.pop();
            }
        }
        if(number !=0){
            so.push(Integer.toString(number));
            //number = 0;
        }

        while(sop.size() > 0) {
             //helper(so,sop);
            calculate(so, sop);
        }
        System.out.println(so.peek());
        return so.pop();

        }

    }
