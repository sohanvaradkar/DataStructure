package com.coding;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum
{
    //O(n)
    public static int[] twoSum(int[] numbers, int target) {
        int[] result = new int[2];
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < numbers.length; i++) {
            if (!map.containsKey(target - numbers[i])) {
                map.put(numbers[i], i);
            } else {
                System.out.println(i+" e "+map.get(target - numbers[i]));
                result[1] = i;
                result[0] = map.get(target - numbers[i]);
                return result;
            }
        }
        throw new IllegalArgumentException("Two numbers not found");
    }
    public static int[] twoSumII(int[] arr, int target) {
        // Sorting and Two Pointer
        Arrays.sort(arr); // 0 2 6 7 10 11
        int left = 0;
        int right = arr.length - 1;
        int[] result = new int[2];
        while(left < right){
            int sum = arr[left] + arr[right];
            if(sum == target){
                result[0] = arr[left];
                result[1] = arr[right];
                return result;
            } else if(sum < target){
                left++;
            } else {
                right--;
            }
        }
        return new int[0];
    }
    public static void main(String[] args) {
        int[] arr = {1, 3, 6, 8, 2, 4, 7};
       int[] result= twoSumII(arr,9);
        System.out.println(result[0]+" e "+result[1]);
    }
}
