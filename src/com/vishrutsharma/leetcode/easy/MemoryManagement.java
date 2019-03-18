package com.vishrutsharma.leetcode.easy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class MemoryManagement {
    private int size;
    private int vsize;
    private int gptr =0;

     private HashMap<String, List<Integer>> h;
     private HashMap<Integer, Integer> r;

    public MemoryManagement(int size){
        this.size = size;
        vsize = size;
        h = new HashMap<>();
        r = new HashMap<>();
    }

    public int getSize(){
        return this.size;
    }

    public boolean setSize(int x){
        if(vsize - x >=0){
            vsize -= x;
            return true;
        }
        return false;
    }

    public void userRequest(int x, String s){
        boolean flag = false;
        if(!r.isEmpty()){
            for(Integer i : r.keySet()){
                if(i > x){
                    List<Integer> temp1 = new ArrayList<>();
                    temp1.add(r.get(i));
                    temp1.add(x);
                    h.put(s, temp1);
                    r.put(r.get(i) + x, i-x);
                    r.remove(i);
                    flag = true;
                    break;
                }else if(i.equals(x)){
                    List<Integer> temp1 = new ArrayList<>();
                    temp1.add(r.get(i));
                    temp1.add(x);
                    h.put(s, temp1);
                    r.remove(i);
                    flag = true;
                    break;
                }
            }
        }else if(setSize(x) && flag == false){
                if(gptr <= size){
                    List<Integer> temp = new ArrayList<>();
                    temp.add(gptr);
                    temp.add(x);
                    h.put(s, temp);
                    gptr = gptr + x ;
                }
       }
    }

    public boolean releaseMemory(String user){
        if(h.containsKey(user)){
            //this.vsize = this.vsize + h.get(user).get(1);
            r.put(h.get(user).get(1), h.get(user).get(0));
            h.remove(user);
            System.out.println(" vsize ---->" + vsize);
            return true;
        }
        return false;
    }

    public void print(){
        for(List i : h.values()){
            System.out.println(i.toString());
        }

        System.out.println("=====================");
        for(Integer i : r.values()){
            System.out.println(i);
        }
    }
}
