package com.stack;

import java.util.EmptyStackException;

public class StackUtil 
{
	ListNode top;
	int length;

	private class ListNode{
		int data;
		ListNode next;
		 public ListNode(int data) {
			this.data=data;
		}
	}
	
	public StackUtil() {
		top=null;
		length=0;
	}
	
	public int length()
	{
		return length;
	}
	public boolean isEmpty()
	{
		return length==0;
	}
	
	public void push(int data)
	{
		ListNode temp=new ListNode(data);
		temp.next=top;
		top=temp;
		length++;
	}
	 public int pop() {
		 if(isEmpty())
			 throw new EmptyStackException();
		 
		 int result=top.data;
		 top=top.next;
		 length--;
		 return result;
		
	}
	 public int peek()
	 {
		 if(isEmpty())
			 throw new EmptyStackException();
		 
		 return top.data;
	 }
	 
	 public static void main(String[] args) {
		StackUtil stackUtil=new StackUtil();
		stackUtil.push(11);
		stackUtil.push(22);
		stackUtil.push(33);
		System.out.println(stackUtil.pop());
		System.out.println(stackUtil.peek());
	}
	
}
