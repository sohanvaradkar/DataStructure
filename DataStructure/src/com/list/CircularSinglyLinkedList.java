package com.list;

import java.util.NoSuchElementException;

public class CircularSinglyLinkedList 
{
	ListNode last;
    int length;
	private class ListNode
	{
		ListNode next;
		int data;
		public ListNode(int data) {
			this.data=data;
		}
	}
	public CircularSinglyLinkedList() {
		last=null;
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
	public void printNodes() {
		if(last==null)
			return;
		ListNode first=last.next;
		while (first!=last) {
			System.out.print(first.data+"-->");
			first=first.next;	
		}
		System.out.println(first.data);
		//System.out.println("null");
	}
	
	public void createSinglyLinkedList() {
		ListNode first=new ListNode(11);
		ListNode second=new ListNode(22);
		ListNode third=new ListNode(33);
		ListNode fourth=new ListNode(44);
		ListNode fifth=new ListNode(55);
		
		first.next=second;
		second.next=third;
		third.next=fourth;
		fourth.next=first;
		last=fourth;
	}
	public void insertAtStart(int value) {
		ListNode temp=new ListNode(value);
		 if(last==null)
			 last=temp;
		 else
			 temp.next=last.next;
		 
		 last.next=temp;
		 length++;
		
	}
	public void insertAtEnd(int value) {
		ListNode temp=new ListNode(value);
		
		if (last==null) {
			last=temp;
			last.next=last;
		}
		else {
			temp.next=last.next;
			last.next=temp;
			last=temp;
			
		}
		length++;
	}
	public void removeFirst() {
		if(isEmpty())
			throw new NoSuchElementException();
		
		ListNode temp=last.next;
		if(last.next==last)
			last=null;
			else
		last.next=temp.next;
		
		temp.next=null;
		length--;
	}
	public static void main(String[] args) {
		CircularSinglyLinkedList cll=new CircularSinglyLinkedList();
		//cll.createSinglyLinkedList();
		cll.insertAtStart(11);
		cll.insertAtStart(22);
		cll.insertAtStart(33);
	//	cll.insertAtEnd(44);
		cll.printNodes();
		cll.removeFirst();
		System.out.println();
		cll.printNodes();
		
		//System.out.println(cll.length);
	}
}
