package com.coding;

import java.util.Arrays;
import java.util.HashSet;

// Java program to find a triplet
class FindTriplet {

    // returns true if there is triplet with sum equal
    // to 'sum' present in A[]. Also, prints the triplet
    boolean find3Numbers(int A[], int arr_size, int sum) {
        int l, r;

        // Fix the first element as A[i]
        for (int i = 0; i < arr_size - 2; i++) {

            // Fix the second element as A[j]
            for (int j = i + 1; j < arr_size - 1; j++) {

                // Now look for the third number
                for (int k = j + 1; k < arr_size; k++) {
                    if (A[i] + A[j] + A[k] == sum) {
                        System.out.print("Triplet is " + A[i] + ", " + A[j] + ", " + A[k]);
                        return true;
                    }
                }
            }
        }

        // If we reach here, then no triplet was found
        return false;
    }

    private static void getArrayTriplets(int[] inputArray) {
        System.out.println("Input Array : " + Arrays.toString(inputArray));

        //Creating HashSet called elementSet

        HashSet<Integer> elementSet = new HashSet<>();

        //Adding all elements into elementSet

        for (int i = 0; i < inputArray.length; i++) {
            elementSet.add(inputArray[i]);
        }

        System.out.println("Array triplets with sum of first two elements equals third :");

        for (int i = 0; i < inputArray.length - 1; i++) {
            for (int j = i + 1; j < inputArray.length; j++) {
                //Checking whether elementSet contains sum of any two elements

                if (elementSet.contains(inputArray[i] + inputArray[j])) {
                    System.out.println("[" + inputArray[i] + ", " + inputArray[j] + ", " + (inputArray[i] + inputArray[j]) + "]");
                }
            }
        }

        // Driver program to test above functions
//        public static void main(String[] args)
//    {
//        FindTriplet triplet = new FindTriplet();
//        int A[] = {12, 3, 4, 1, 6, 9};
//        int sum = 24;
//        int arr_size = A.length;
//
//        triplet.find3Numbers(A, arr_size, sum);
//    }
    }
}