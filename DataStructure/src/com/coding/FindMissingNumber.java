package com.coding;

public class FindMissingNumber {

    public static int MissingNumber(int[] arr){
        int n = arr.length + 1;
        int sum = n * (n + 1) / 2;
        for(int num : arr){
            sum = sum - num;
        }
        return sum;
    }
    public static void main(String[] args) {
        int[] arr = {1, 3, 6, 8, 2, 4, 7};
        System.out.println(MissingNumber(arr));
    }
}
