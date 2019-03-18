package com.vishrutsharma.leetcode.easy;

import java.util.Collections;
import java.util.PriorityQueue;

public class RunningMedian {

    PriorityQueue<Integer> minHeap = new PriorityQueue<>();
    PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());

    public double getMedian(int x){
        if(maxHeap.isEmpty()){
            maxHeap.add(x);
            return x;
        }else{
            if(x > maxHeap.peek()){
                minHeap.add(x);
                if(minHeap.size() > maxHeap.size()){
                    maxHeap.add(minHeap.remove());
                }
            }else{
                maxHeap.add(x);
                if(maxHeap.size() > minHeap.size() +1){
                    minHeap.add(maxHeap.remove());
                }
            }
        }

        if(maxHeap.size() == minHeap.size()){
            return ((double)minHeap.peek() + (double)maxHeap.peek())/2;
        }else{
            return (double)maxHeap.peek();
        }
    }
}
