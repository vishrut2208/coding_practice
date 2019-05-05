package com.vishrutsharma.leetcode.easy;

import java.util.*;
public class lockproblem {


    public int countFruits(String s){

        HashMap<Character,Integer> m = new HashMap();
        int start = 0;
        int end = 1;
        int count =0;
        int maxcount =0;

        for(int i=0; i< s.length(); i++){
            if(m.containsKey(s.charAt(i))){
                m.put(s.charAt(i), i);
                count++;
            }else if(m.size() <2){
                m.put(s.charAt(i), i);
                count++;
            }else{
                int com = Integer.MAX_VALUE;
                char d='/';
                for(char c : m.keySet()){
                    if(m.get(c) < com){
                        start = m.get(c)+1;
                        com = m.get(c);
                        d = c;
                    }
                }
                m.remove(d);
                count = i - start +1;
                m.put(s.charAt(i), i);
            }
            maxcount = Math.max(maxcount, count);
        }
        System.out.println(count);
        return count;
    }

    public int shortestSubstring(String s) {
        // Write your code here

        HashSet<Character> charset = new HashSet<>();
        HashSet<Character> check = new HashSet<>();

        for(char c : s.toCharArray()){
            charset.add(c);
        }


        int start =0, min=0, ans=Integer.MAX_VALUE;

        for(int i=0; i< s.length(); i++){

            check.add(s.charAt(i));

            if(check.size() == charset.size()){
                if(s.charAt(start) == s.charAt(start+1)){
                    start++;
                }
                check.clear();
                min = i-start +1;
                start = i+1;
                ans = Math.min(ans, min);
            }

            //ans = Math.min(ans, min);

        }
        System.out.println(ans);
        return ans;

    }
}
