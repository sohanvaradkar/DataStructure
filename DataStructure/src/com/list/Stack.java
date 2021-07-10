package com.list;

import java.util.Iterator;

public class Stack {
	int stack[] = new int[5];
	int top = 0;

	public void push(int data) {
		stack[top] = data;
		top++;
	}

	public void print() 
	{

		for (int i : stack) 
		{
           System.out.print (i+" ");
		}
	}
	public int pop()
	{
		int data;
		top--;
		data=stack[top];
		return data;
	}

}
