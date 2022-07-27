package com.coding;

import java.util.ArrayList;
import java.util.List;

//Cisco
public class SubStringMoreThanOne {

    public static List<String> findMoreThanOneSubString(String s,int len)
    {
        List<String> al=new ArrayList<>();
        String sub="";
        for (int i=0;i<=s.length()-len;i++)
        {
            sub=s.substring(i,len+i);

          if (s.indexOf(sub,len+i)!=-1)
              al.add(sub);

        }
     return al;

    }

    public static void main(String[] args) {
        String s="QQWEQQWERTQERTQWEQ";
        System.out.println(findMoreThanOneSubString(s,4).toString());
    }
}
