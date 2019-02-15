package com.vishrutsharma.leetcode.easy;

import java.util.*;

public class AlienDictionary {

    public String alienDictionary(String[] words){

        LinkedHashMap<Character, Integer> s = new LinkedHashMap<>();

        for(int j=0; j<26; j++){
            for(int i =0; i<words.length; i++){
                if(j < words[i].length()) {
                    if (!s.containsKey(words[i].charAt(j))) {
                        s.put(words[i].charAt(j), i);
                    }else{
                       if(s.get(words[i].charAt(j)) + 1 != i){
                           return "";
                       }
                    }
                }

            }
        }
        String ans1 ="";
        for (Map.Entry<Character, Integer> e : s.entrySet()) {
            //to get key
            ans1 += e.getKey();
            //and to get value
            //e.getValue();
        }
        System.out.println(ans1);
       return s.toString();
    }
}
