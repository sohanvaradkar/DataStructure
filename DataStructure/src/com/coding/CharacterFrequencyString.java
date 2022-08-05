package com.coding;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

//import static java.util.stream.Collectors.groupingBy;

public class CharacterFrequencyString {
    public static void main(String[] args) {
        String s="i love goa";

       Map<String,Long> result= Arrays.stream(s.split("")).
               collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
        System.out.println(result);

        System.out.println(Runtime.getRuntime().availableProcessors());
    }


}
