//package com.vishrutsharma.leetcode.easy;
//
//import sun.security.util.Length;
//
//import java.util.HashMap;
//
//public class LongestSubstring395 {
//
//    public String longestSubstringAtleastK(String k, int t){
//
//            //ababbc
//            //012345
//        //a - 2
//        //b - 4
//        //c -5
//        HashMap<Character, Integer> cMap = new HashMap<>();
//
//        for(int i=0; i<k.length(); i++){
//            cMap.put(k.charAt(i), i);
//        }
//
//        HashMap<Character, Integer> cCount = new HashMap<>();
//        int startPtr =0;
//        int max =0;
//        int maxLength =0;
//        int Length =0;
//        int leastcount =Integer.MAX_VALUE;
//        for(int j=0; j<k.length(); j++){
//            cCount.put(k.charAt(j), cCount.getOrDefault(k.charAt(j), 0)+1);
//            leastcount = Math.min(leastcount, cCount.get(k.charAt(j)));
//            if((cCount.get(k.charAt(j)) < t) && (cMap.get(k.charAt(j)) == j)){
//                startPtr = j+1;
//                for(Character i : cMap.keySet()){
//                    if(cCount.get(i) == leastcount && leastcount < t){
//                        if(cMap.get(i) )
//                    }
//                }
//
//            }else{
//
//                Length = j - startPtr +1;
//                if(maxLength < Length){
//                    maxLength = Length;
//                    max = startPtr;
//                }
//                //maxLength = Math.max(maxLength, Length);
//            }
//
//
//        }
//        System.out.println(k.substring(max, max+maxLength));
//        return k.substring(max, max+maxLength);
//    }
//}

