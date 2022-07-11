package com.coding;

import java.util.HashMap;
import java.util.Map;

public class LongSubWithRep {


    private static int lengthOfLongestSub(String s)
    {
        Map<Character,Integer> hs=new HashMap<>();
        int start=0;
        int maxLength=0;
        for (int end=0;end<s.length();end++)
        {
            char c=s.charAt(end);
            if (hs.containsKey(c))
                start=Math.max(start,hs.get(c)+1);

            hs.put(c,end);

            maxLength=Math.max(maxLength,end-start+1);

        }

        return maxLength;
    }

    public static void main(String[] args) {
        String s="pwwkew";

        System.out.println(lengthOfLongestSub(s));
    }
}
