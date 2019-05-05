package com.vishrutsharma.leetcode.easy;

import java.util.HashMap;
import java.util.List;

public class match {

    public int count(List<Integer> requestTime){

        HashMap<Integer, Integer> countmap = new HashMap<>();

        int secondCount =0;
        int totalcount =0;
        int tencount =0;
        int twcount =0;
        int thcount =0;
        int fcount =0;
        int ficount=0;
        int sixcount=0;

        for(int i=0; i< requestTime.size(); i++){

            countmap.put(requestTime.get(i), countmap.getOrDefault(requestTime.get(i),0)+1);
            totalcount++;
            if(countmap.get(requestTime.get(i))>3){
                secondCount++;
            }





//            if(requestTime.get(i) <=60){
//                if(requestTime.get(i) && requestTime.get(i) <=10){
//                    tencount++;
////                }else if(requestTime.get(i) >=11 && requestTime.get(i) <=20){
////                    twcount++;
////                }else if(requestTime.get(i) >=21 && requestTime.get(i) <=30){
////                    thcount++;
////                }else if(requestTime.get(i) >=31 && requestTime.get(i) <=40){
////                    fcount++;
////                }else if(requestTime.get(i) >=41 && requestTime.get(i) <=50){
////                    ficount++;
////                }else if(requestTime.get(i) >=51 && requestTime.get(i) <=60){
////                    sixcount++;
////                }
//
//            }

        }

        if(tencount >20){
            secondCount = secondCount + tencount -20;
        }
        if(twcount >20){
            secondCount = secondCount + twcount -20;
        }
        if(thcount >20){
            secondCount = secondCount + thcount -20;
        }
        if(fcount >20){
            secondCount = secondCount + fcount -20;
        }
        if(ficount >20){
            secondCount = secondCount + ficount -20;
        }
        if(sixcount >20){
            secondCount = secondCount + sixcount -20;
        }

        if(totalcount > 60){
                secondCount = secondCount + (totalcount - 60);

        }


        System.out.println(secondCount);
        return secondCount;
    }
}
