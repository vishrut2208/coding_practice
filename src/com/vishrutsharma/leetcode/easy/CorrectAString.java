package com.vishrutsharma.leetcode.easy;


import com.vishrutsharma.ctci.ArraysAndStrings.StringRotation;

import java.util.LinkedList;
import java.util.Queue;

public class CorrectAString {



    public String correctString(String A){
//        StringBuilder s = new StringBuilder();
        String ans = "";
        Queue<String> q = new LinkedList<>();
        int i=A.length(), j=A.length()+1;
        int prej =j;
        while(j>0){
            i = j-1;
            while(i >0){
                if(checkword(A,i,j)){
                    if(j==prej)

                    q.add(A.substring(i-1,j-1));
                }
                i =i-1;
                if(i==0){
                break;
               }
            }
            j--;
        }

        System.out.println(ans);
        while(!q.isEmpty()){
            System.out.println(q.poll());
        }
        return ans;
    }

    public boolean checkword(String V, int i, int j){
        LinkedList<String> wordlist = new LinkedList<>();

        wordlist.add("i");
        wordlist.add("am");
        wordlist.add("vishrut");
        wordlist.add("t");
        wordlist.add("r");
        String temp = V.substring(i-1,j-1);
        if(wordlist.contains(temp)) {
            return true;
        }

        return false;
    }
}

