package com.list;

import java.util.NoSuchElementException;

public class DoubleLinkedList 
{
 LinkNode head;
 LinkNode tail;
  int   length;
	private class LinkNode
	{
		int data;
		LinkNode previous;
		LinkNode next;
		public LinkNode(int data) {
		this.data=data;
		}
	}
	public DoubleLinkedList() {
		
		this.head = null;
		this.tail = null;
		this.length = 0;
	}
	
	public boolean isEmpty()
	{
		return length==0;
	}
	public int length()
	{
		return length;
	}
	
	private void insertLast(int value) {
		LinkNode newNode=new LinkNode(value);
		if(isEmpty())
			head=newNode;
		else
			tail.next=newNode;
		
	newNode.previous=tail;
	tail=newNode;
	length++;

	}
	//11-->22-->33-->44-->null 
	public void printForward()
	{
		LinkNode temp=head;
		if(head==null)
			return;
		while (temp!=null) {
			System.out.print(temp.data+"-->");
			temp=temp.next;
		}
		System.out.print("null ");
	}
	//44-->33-->22-->11-->null
	public void printBackword()
	{
		if (tail==null)
			return;
		
		LinkNode temp=tail;
		
		while (temp!=null) {
			System.out.print(temp.data+"-->");
			temp=temp.previous;
		}
		System.out.print("null");
	}
	public void insertAtStart(int value)
	{
		LinkNode newNode=new LinkNode(value);
		if(isEmpty())
			head=newNode;
		else
			head.previous=newNode;
		
		newNode.next=head;
		head=newNode;
		length++;
	}
    //11-->22-->33-->44-->null 
	//22-->33-->44-->null 
	public void deleteFirst()
	{
		if(isEmpty())
			throw new NoSuchElementException();
		
		LinkNode temp=head;
		if(head==tail)
			tail=null;
		else
			head.next.previous=null;
		
		head=head.next;
		temp.next=null;
			length--;
	}
	//11-->22-->33-->44-->null 
	//11-->22-->33-->null 
	public void deleteLast()
	{
		if(isEmpty())
			throw new NoSuchElementException();
		
		LinkNode temp=tail;
		if(head==tail)
			head=null;
		else
			tail.previous.next=null;
		
		tail=tail.previous;
		temp.previous=null;
			length--;
	}
	public static void main(String[] args) {
		DoubleLinkedList list=new DoubleLinkedList();
		list.insertLast(11);
		list.insertLast(22);
		list.insertLast(33);
		list.insertLast(44);
		list.insertAtStart(55);
		list.deleteFirst();
		list.printForward();
		//list.deleteFirst();
		list.deleteLast();
		System.out.println();
		list.printForward();
		
		//list.printBackword();
	}

	
}
