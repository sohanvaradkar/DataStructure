package com.practice;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {

    public static int[] twoSum(int[] nums, int target)
    {

        Map<Integer,Integer> hs=new HashMap<>();
        int result=0;
        int[] output=new int[2];
        for(int i=0;i<nums.length;i++)
        {
            result=target-nums[i];//
            if(hs.containsKey(result))
            {
                output[0]=hs.get(result);
                output[1]=i;
            }
            else
            {
                hs.put(nums[i],i);//7=0,
            }
        }
        System.out.println(output[0]+" "+output[1]);

        return output;
    }
    public static void main(String[] args) {
        int[] nums ={3,2,4};
        int target = 6;

        // twoSum(nums,target);
        System.out.println(twoSum(nums,target));
    }
}
