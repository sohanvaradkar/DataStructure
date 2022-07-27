package com.coding;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class FrownySmileys {

    public static long numFrownySmileys(String string) {
        // Regex Pattern To Find Frowny Smileys
        Pattern pattern = Pattern.compile(">?[:;8]'?[-~o]?[(C<\\[{@]");

        // Match Object To Find All Matches Of The Pattern In The String
        Matcher matcher = pattern.matcher(string);

        // Return The Number Of Matches
        return matcher.results().count();
    }

    // Test Code
    public static void main(String[] args) {
        String testOneString = "I want to buy a onesie… :o) but know >;-( it won’t suit me :'{";
        long testOneResult = numFrownySmileys(testOneString);

        String testTwoString = "Someone I know :o) recently combined Maple Syrup :'D & buttered Popcorn 8~C thinking it would taste like caramel popcorn >;'@. It didn’t :-< and they don’t recommend anyone ;{ else do it either :o@ :o3.";
        long testTwoResult = numFrownySmileys(testTwoString);

        String testThreeString = "I'd rather be a bird than a fish. :D";
        long testThreeResult = numFrownySmileys(testThreeString);

        // Display Result
        System.out.printf("Input String: %s\nOutput: %d\n\n", testOneString, testOneResult);
        System.out.printf("Input String: %s\nOutput: %d\n\n", testTwoString, testTwoResult);
        System.out.printf("Input String: %s\nOutput: %d\n\n", testThreeString, testThreeResult);
    }
}