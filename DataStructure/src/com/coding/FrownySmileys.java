package com.coding;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class FrownySmileys {

    public static long numFrownySmileys(String string) {

        Pattern pattern = Pattern.compile(">?[:;8]'?[-~o]?[(C<\\[{@]");
        Matcher matcher = pattern.matcher(string);
        //return matcher.results().count();
        return 1;
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


//    import java.io.BufferedReader;
//import java.io.IOException;
//import java.io.InputStreamReader;
//import java.nio.charset.StandardCharsets;
//import java.util.regex.Pattern;
//import java.util.regex.Matcher;
//    /**
//     * The Main class implements an application that reads lines from the standard input
//     * and prints them to the standard output.
//     */
//    public class Main {
//        /**
//         * Iterate through each line of input.
//         */
//        public static long numFrownySmileys(String string)
//        {
//            Pattern pattern=Pattern.compile(">?[:;8]'?[-~o]?[(C<\\[{@]");
//            Matcher matcher = pattern.matcher(string);
//            return matcher.results().count();
//        }
//
//        public static void main(String[] args) throws IOException {
//            InputStreamReader reader = new InputStreamReader(System.in, StandardCharsets.UTF_8);
//            BufferedReader in = new BufferedReader(reader);
//            String line;
//            while ((line = in.readLine()) != null) {
//                long n=numFrownySmileys(line);
//                System.out.println(n);
//            }
//
//        }
//    }

}