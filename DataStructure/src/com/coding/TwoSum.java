package com.coding;

import java.util.HashMap;
import java.util.Map;

public class TwoSum
{
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
    public static void main(String[] args) {
        int[] arr = {1, 3, 6, 8, 2, 4, 7};
       int[] result= twoSum(arr,9);
        System.out.println(result[0]+" e "+result[1]);
    }
}
