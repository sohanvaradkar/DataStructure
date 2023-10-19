package com.binary;

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

public class Demo {
    public static void main(String[] args) {
        int[] numbers={5,6,1,1,4,4,4,3};

        Arrays.stream(numbers).boxed().sorted((a, b)-> b.compareTo(a)).forEach(System.out::println);
        Map<Integer,Long> countByNumber= Arrays.stream(numbers).boxed().collect((Collectors.groupingBy
                (Integer::intValue, Collectors.counting())));

        System.out.println(countByNumber.toString());

    }

}
