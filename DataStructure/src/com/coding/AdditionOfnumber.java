package com.coding;

import java.util.HashMap;
import java.util.Map;

public class AdditionOfnumber {


    // Time complexity: O(n)

    private static int[] findTwoSumMap(int[] nums, int target) {
        Map<Integer, Integer> numMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];

            if (numMap.containsKey(complement))
            {
                System.out.println(complement+" :: "+nums[i]);

            } else
            {
                numMap.put(nums[i], i); //numMap.put(complement,i);
            }
        }
        return new
                int[] {}; }


    private static int[] findTwoSum_BruteForce(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[] { i, j };
                }
            }
        }
        return new int[] {};
    }

    private static int[] findTwoSum(int[] nums, int target) {

        int left = 0;
        int right = nums.length - 1;
        while(left < right) {
            if(nums[left] + nums[right] == target) {
                return new int[] {nums[left], nums[right]};
            } else if (nums[left] + nums[right] < target) {
                left++;
            } else {
                right--;
            }
        }
        return new int[] {};
    }
    public static void main(String[] args)
    {
        int[] nums= {1,2,3,4,5};
        int target=5;

        //addNumber(nums,target);
        //findTwoSum(m,n);

        int[] indices = findTwoSum(nums, target);
        System.out.println(indices.length);
        if (indices.length == 2) {
            System.out.println(indices[0] + " " + indices[1]);
        } else
        {
            System.out.println("No solution found!"); }

    }





}
