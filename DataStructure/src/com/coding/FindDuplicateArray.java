package com.coding;

import java.util.*;
import java.util.stream.Collectors;

public class FindDuplicateArray {

    public static int findDuplicate(int[] nums) {
        if(nums.length <= 1) return -1;
        int slow = nums[0], fast = nums[nums[0]]; //slow = head.next, fast = head.next.next
        while(slow != fast){
            System.out.println(slow+" :: "+fast);//check for loop
            slow = nums[slow];
            fast = nums[nums[fast]];

        }
        if(slow != fast) return -1;
        slow = 0; //reset one pointer
        while(slow != fast){ //find starting point of loop
            slow = nums[slow];
            fast = nums[fast];
        }
        return slow;
    }

    //Method 3 : Using HashSet

    private static void findDuplicatesUsingHashSet(int[] inputArray)
    {
        HashSet<Integer> set = new HashSet<Integer>();

        for (int element : inputArray)
        {
            if( ! set.add(element))
            {
                System.out.println("Duplicate Element : "+element);
            }
        }
    }
    public static int[] findDuplicateUsingTreeSet(int input1,int[] input2)
    {
        Set<Integer> hs=new TreeSet<>();
        Set<Integer> al=new TreeSet<>();

        for (Integer num:input2)
        {
            if (!hs.add(num))
            {
                al.add(num);
            }

        }
        if (al.size()==0)
            al.add(-1);
        int[] arr = al.stream().mapToInt(i -> i).toArray();
        return arr;
    }
    private static int[] findDuplicatesUsingHashMap(int input ,int[] inputArray)
    {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int element : inputArray)
        {
            if(map.get(element) == null)
                map.put(element, 1);
            else
                map.put(element, map.get(element)+1);
        }
        Set<Map.Entry<Integer, Integer>> entrySet = map.entrySet();
        Set<Integer> ts=new TreeSet<>();
        for (Map.Entry<Integer, Integer> entry : entrySet)
        {
            if(entry.getValue() > 1)
            {
                ts.add(entry.getKey());
            }
        }
        int[] arr = ts.stream().mapToInt(i -> i).toArray();
        return arr;
    }
    private static void findDuplicatesUsingJava8(int[] inputArray)
    {
        Set<Integer> uniqueElements = new HashSet<>();

        Set<Integer> duplicateElements =  Arrays.stream(inputArray)
                .filter(i -> !uniqueElements.add(i))
                .boxed()
                .collect(Collectors.toSet());


       // Collections.sort(duplicateElements);
        System.out.println(duplicateElements);
    }
    public static void main(String[] args) {
        int input = 6 ;
        int[] input2 ={2,-1,-1,3,6,8,90,58,60} ;
        findDuplicateUsingTreeSet(input2.length,input2);
        //System.out.println( findDuplicatesUsingJava8(input2));
    }
}
