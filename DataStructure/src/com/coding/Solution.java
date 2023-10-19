package com.coding;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;




/*
 * Complete the 'maxProfit' function below.
 *
 * The function is expected to return an INTEGER.
 * The function accepts following parameters:
 *  1. INTEGER noOfJobs
 *  2. 2D_INTEGER_ARRAY jobDetails
 */








public class Solution {


    int start;
    int finish;
    int profit;

    public Solution(int start,int finish, int profit)
    {
        this.start=start;
        this.finish=finish;
        this.profit=profit;
    }
    public static void main(String[] args)  {


        int job=4;
        Solution[] jobs={
                new Solution(1,2,50),
                new Solution(3,5,20),
                new Solution(6,19,100),
                new Solution(2,100,200)
        };

        int result=highestProfit(job,jobs);

        System.out.println(result);
    }

    public static int highestProfit(int n,Solution[] jobs)
    {
        Arrays.sort(jobs,
                Comparator.comparingInt(j -> j.finish));

        int[] maxProfit=new int[n];
        maxProfit[0]=jobs[0].profit;

        for(int i=1;i<n;i++)
        {

            int index=-1;
            for(int j=i-1;j>=0;j--)
            {
                if(jobs[j].finish<=jobs[i].start)
                {
                    index=j;
                    break;
                }
            }

            int currentProfit=jobs[i].profit;

            if(index!=-1)
            {
                currentProfit+=maxProfit[index];
            }

            maxProfit[i]=Math.max(maxProfit[i-1], currentProfit);

        }

        return maxProfit[n-1] ;

    }
}

