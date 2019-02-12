package com.vishrutsharma.ctci.ArraysAndStrings;

import javax.print.DocFlavor;

public class URLify {

    public String urlify(String A, int trueLength){

        char[] c = A.toCharArray();
        int spacecount =0, index=0;

        for(int i=0; i< trueLength; i++){
            if(Character.isWhitespace(c[i])){
                spacecount++;
            }
        }

        index = trueLength + spacecount *2;

        for(int i = trueLength-1; i>=0; i--){
            if(Character.isWhitespace(c[i])){
                c[index-1] = '0';
                c[index-2] = '2';
                c[index-3] = '%';
                index = index -3;
            }else{
                c[index-1] = c[i];
                index--;
            }
        }

        for(char a: c) {
            System.out.print(a);
        }
        System.out.println("");
        System.out.println(new String(c));
        return c.toString();
    }
}
