package com.vishrutsharma.leetcode.easy;

import java.util.*;

public class AmazonListOfString {


        int countkDist(String str, int k)
        {

            int res = 0;

            int n = str.length();


            int cnt[] = new int[26];

            for (int i = 0; i < n; i++)
            {
                int dist_count = 0;


                Arrays.fill(cnt, 0);


                for (int j=i; j<n; j++)
                {

                    if (cnt[str.charAt(j) - 'a'] == 0)
                        dist_count++;


                    cnt[str.charAt(j) - 'a']++;

                    if (dist_count == k)
                        res++;
                }
            }
            System.out.println(res);
            return res;
        }
    }