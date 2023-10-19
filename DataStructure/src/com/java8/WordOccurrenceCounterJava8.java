package com.java8;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class WordOccurrenceCounterJava8 {

    public static void main(String[] args) {
        String text = "Hi EPAM bye EPAM goodbye EPAM welcome ePAM Hi There epAM bye bye EPaM";
        Map<String, Long> wordOccurrences = findWordOccurrences(text);

        wordOccurrences.forEach((word, count) -> System.out.println("Occurrences of the word '" + word + "': " + count));
    }

    public static Map<String, Long> findWordOccurrences(String text) {
        return Arrays.stream(text.split("\\s+"))
                .map(String::toLowerCase)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
    }
}
