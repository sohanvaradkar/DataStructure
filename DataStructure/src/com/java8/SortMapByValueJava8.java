package com.java8;

import java.util.*;

public class SortMapByValueJava8 {

    public static void main(String[] args) {
        Map<String, Integer> unsortedMap = new HashMap<>();
        unsortedMap.put("Apple", 50);
        unsortedMap.put("Banana", 30);
        unsortedMap.put("Cherry", 70);
        unsortedMap.put("Durian", 20);
        unsortedMap.put("Elderberry", 10);

        // Sort the map by values in descending order and print both keys and values
        unsortedMap.entrySet().stream()
                .sorted(Map.Entry.<String, Integer>comparingByValue().reversed())
                .forEach(entry -> System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue()));
    }
}
