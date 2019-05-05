package com.vishrutsharma.leetcode.easy;

import java.util.ArrayList;
import java.util.List;

public class PrimeFactorization {

    public List<Integer> primeFactors(int x){

        List<Integer> ans = new ArrayList<>();

        if(x ==0 || x ==1){
            return ans;
        }

        for(int i =2; i <=x; i++){

            while(x%i == 0){
                x = x/i;
                ans.add(i);
            }
            if(i != 2){
                i++;
            }
        }
        double p = -5;
        double y = 5;
        System.out.println(p/3);
        System.out.println(y/3);

        System.out.println(ans);
        System.out.println(Math.max(p/3, y/3));
        return ans;

//        while (n%2==0)
//        {
//            System.out.print(2 + " ");
//            n /= 2;
//            ans.add(2);
//        }
//
//        // n must be odd at this point.  So we can
//        // skip one element (Note i = i +2)
//        for (int i = 3; i <= Math.sqrt(n); i+= 2)
//        {
//            // While i divides n, print i and divide n
//            while (n%i == 0)
//            {
//                System.out.print(i + " ");
//                n /= i;
//                ans.add(i);
//            }
//        }
//
//        // This condition is to handle the case whien
//        // n is a prime number greater than 2
//        if (n > 2)
//            ans.add(n);
//            //System.out.print(n);
//        System.out.println(ans);
//        return ans;

    }
}
