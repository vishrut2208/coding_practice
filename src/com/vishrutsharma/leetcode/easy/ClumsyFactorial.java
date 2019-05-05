package com.vishrutsharma.leetcode.easy;

import java.util.HashSet;

public class ClumsyFactorial {

    public int clumsy(int N) {

        int div = N/4;
        int rem = N%4;
        int result =0;
        boolean u =false;

        System.out.println(cal(N, N-1, true));
        return cal(N, N-1, true);
    }

    public int cal(int num, int o, boolean update){
        if(o <= 0){
            return num;
        }
        int sub =0;
        if(update) {
            sub = calculateFirstTwo(num, o);
            update = false;
        }
        return calculateSecondTwo(sub, o-2);
//        }else{
//            int temp=0;
//            if(o>0){
//                temp = temp+(o);
//            }
//            if(o-1>0){
//              return  temp = temp - cal(o-1, o-2, true);
//            }


//            sub = calculateSecondTwo(num,o);
//            update = true;


    }

    public int calculateFirstTwo(int first, int i){

        if(i>0){
            first *= i;
        }

        if(i-1>0){
            first = first/(i-1);
        }

        return first;
    }

    public int calculateSecondTwo(int first, int j){
        if(j>0){
            first = first+(j);
        }
        if(j-1>0){
            first = first - cal(j-1, j-2, true);
        }

        return first;
    }

    public int shipWithinDays(int[] weights, int D) {

        int sum=0;
        for(int i: weights){
            sum+= i;
        }

        int div = sum/D;
        int temp =weights[0];
        int max =0;
        int tempsum=0;

        for(int j=0; j< weights.length-1; j++){

            if(temp <= div){
                if(j+1 <=weights.length-1){
                    if(temp + weights[j+1] <= div){
                        temp+= weights[j+1];
                        max = Math.max(max, temp);
                    }else if(Math.abs(temp-div) <= Math.abs(temp+weights[j+1] - div)){
                        max = Math.max(max, temp);
                        temp =weights[j+1];
                    }else{
                        max = Math.max(max, temp + weights[j+1]);
                        if(j+2 <weights.length -1){
                            temp = weights[j+2];
                            j=j+2;
                        }
                    }
                }
            }
        }
        System.out.println(max);
        return max;
    }

}
