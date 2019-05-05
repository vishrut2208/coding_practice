package com.vishrutsharma.leetcode.easy;

import java.util.*;

public class CommonCharacter {

    public List<String> commonChars(String[] A) {
        HashMap<Character, Integer> map = new HashMap<>();
        HashMap<Character, Integer> t = new HashMap<>();
        LinkedList<Character> r = new LinkedList<>();
        for(char c : A[0].toCharArray()){
            map.put(c, map.getOrDefault(c,0)+1);
        }

        for(int i=1; i< A.length; i++){

            for(char c : A[i].toCharArray()){
                t.put(c, t.getOrDefault(c,0)+1);
            }

            for(Character c : map.keySet()){
                if(t.containsKey(c)){
                    if(t.get(c) < map.get(c)){
                        map.put(c, t.get(c));
                    }
                }else{
                    r.add(c);
                }
            }

            t.clear();
        }

        for(int i=0; i< r.size() ;i++){
            map.remove(r.get(i));
        }
        List<String> ans = new LinkedList<>();
        for (Map.Entry<Character, Integer> e : map.entrySet()) {
            String key = e.getKey().toString();
            int value = e.getValue();
            for(int i=0; i< value; i++){
                ans.add(key);
            }
        }
        return ans;

    }
}
