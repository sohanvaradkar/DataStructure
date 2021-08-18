package com.coding;

public class Fibonacci
{
    public static int fib(int n)
    {
        if(n==0) return 0;
        if (n==1) return 1;
        int left=fib(n-1);
        int right=fib(n-2);
        return left+right;
    }
    public  static int fib2(int n)
    {
        int[] table=new int[n+1];
        table[0]=0;
        table[1]=1;
        for (int i=2;i<=n;i++)
        {
            table[i]=table[i-1]+table[i-2];
        }
        return table[n];
    }
    public static void main(String[] args) {

        System.out.println(fib2(6));
    }
}
