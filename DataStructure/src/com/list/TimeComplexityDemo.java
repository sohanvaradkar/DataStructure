package com.list;

public class TimeComplexityDemo 
{
public static void main(String[] args) 
{
	TimeComplexityDemo demo=new TimeComplexityDemo();
	double now=System.currentTimeMillis();
	System.out.println(demo.findSum(50000));
	System.out.println("Time Taken :- "+(System.currentTimeMillis()-now)+" MilleSecs ");
}

/*
 * public int findSum(int n) { return n*(n+1)/2; }
 */


  public int findSum(int n) { int sum=0; for (int i = 0; i <=n; i++) {
  sum=sum+i; } return sum; }
 
}
