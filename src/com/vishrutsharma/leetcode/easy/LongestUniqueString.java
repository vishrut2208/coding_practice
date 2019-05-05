package com.vishrutsharma.leetcode.easy;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LongestUniqueString {

    public String longestUniqueString(String[] l, String s){

        Map<Character, Integer> hchar = new HashMap<>();
        char[] c = s.toCharArray();
        int ptr=0;
        int length =0;
        int maxLength =0;
        int start =0;
//        for(int i = 0; i<s.length(); i++){
//            if(hchar.containsKey(s.charAt(i))){
//                length = i - ptr;
//                if(length > maxLength){
//                    maxLength = length;
//                    start = ptr;
//                }
//                for(int j=ptr ; j < hchar.get(s.charAt(i)); j++ ){
//                    hchar.remove(s.charAt(j));
//                }
//                ptr = hchar.get(s.charAt(i)) +1;
//
//            }else{
//                hchar.put(s.charAt(i), i);
//            }
//        }
//
//        if(hchar.size() > maxLength){
//            start = ptr;
//            maxLength = hchar.size();
//        }

        HashMap<String, Integer> hl = new HashMap<>();

        for(int i=0; i<l.length; i++){
            if(hl.containsKey(l[i]) && hl.get(l[i]) > ptr){
                length = i - ptr;
                if(length > maxLength){
                    maxLength = length;
                    start = ptr;
                }

                ptr = hl.get(l[i]) +1;
            }else{
                hl.put(l[i], i);
            }
        }
        maxLength = Math.max(maxLength, length);
        if(hl.size() > maxLength){
            start = ptr;
            maxLength = hl.size();
        }
        System.out.println(maxLength);
        for(int t=start ; t<=start+maxLength-1; t++){
            System.out.print(l[t]);
            System.out.print(", ");
        }
        System.out.println();
        System.out.println(s.substring(start, start + maxLength));
        return s.substring(start, start + maxLength);


    }
}
