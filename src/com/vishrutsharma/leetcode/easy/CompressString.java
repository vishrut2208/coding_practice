package com.vishrutsharma.leetcode.easy;

public class CompressString {

    public String compressString(String s){

        int count =1;
        StringBuilder sb = new StringBuilder();
        for(int i=1; i<s.length(); i++){
            if(s.charAt(i-1) == s.charAt(i)){
                count++;
            }else{
                sb.append(s.charAt(i-1));
                sb.append(count);
                count =1;
            }
        }
        sb.append(s.charAt(s.length()-1));
        sb.append(count);
        System.out.println(sb.toString().length() > s.length() ? s : sb.toString());
        return sb.toString().length() > s.length() ? s : sb.toString();
    }
}
