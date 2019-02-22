package com.vishrutsharma.leetcode.easy;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;

public class AmazonSubstring {

    public List<String> amazonSubstring(String str, int k){
        if(str.length() ==0 || str.length()<k){
            return null;
        }
        int o=0;
        int count=0;
        HashSet<String> ans = new HashSet<>();
        HashSet<Character> s = new HashSet<>();

        for(int i=0; i< str.length(); i++){
            s.add(str.charAt(i));
            for(int j=i+1; j<k ; j++ ){
                if(s.contains(str.charAt(j))){
                    count++;
                }else{
                    s.add(str.charAt(j));
                }
                o=j;
            }
            s.remove(str.charAt(i));
            if(count == 1){
                ans.add(str.substring(i,o +1));
            }
            count =0;
            if(k+1<=str.length()){
                k=k+1;
            }else{
                break;
            }

        }
        for(String p : ans){
            System.out.println(p);
        }
        return new LinkedList<>(ans);
    }

//    public List<String> subStringsLessKDist(String inputString, int num){
//        List<String> list = new LinkedList();
//        HashSet<String> hset = new HashSet();
//        int len = inputString.length();
//        if(len < num){
//            return list;
//        }
//        char[] c = inputString.toCharArray();
//        int start = 0; int end = 0;
//        HashMap<Character, Integer> hmap = new HashMap();
//        while(end<len){
//            System.out.println(start+" "+end);
//            if(end-start==num){
//                if(hmap.size()==num-1){
//                    hset.add(inputString.substring(start,end));
//                }
//                hmap.put(c[start],hmap.get(c[start])-1);
//                if(hmap.get(c[start])==0){
//                    hmap.remove(c[start]);
//                }
//                start++;
//            }else{
//                hmap.put(c[end],hmap.getOrDefault(c[end],0)+1);
//                end++;
//            }
//        }
//        if(end-start==num){
//            if(hmap.size()==num-1){
//                hset.add(inputString.substring(start,end));
//            }
//        }
//        System.out.println(hmap);
//        return new LinkedList(hset);
//    }


}
