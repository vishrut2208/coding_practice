package com.vishrutsharma.leetcode.easy;

import java.util.ArrayList;
import java.util.List;

public class FindDuplicates {

    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> result = new ArrayList<>();

        for(int i = 0; i < nums.length; i++) {
            int value = Math.abs(nums[i]);
            if(nums[value - 1] < 0)
                result.add(value);

            nums[value - 1] *= -1;
        }

        return result;
    }
}
