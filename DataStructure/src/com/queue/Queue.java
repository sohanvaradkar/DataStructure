package com.queue;

import java.util.NoSuchElementException;

public class Queue {
	
	private ListNode front;
	private ListNode rear;
	int length;
	
	public class ListNode{
		int data;
		ListNode next;
		public ListNode(int data) {
			this.data=data;
			this.next=null;
		}
	}
	public Queue() {
		front=null;
		rear=null;
		length=0;
	}
	
	public int length() {
		return length;
	}
	public boolean isEmpty()
	{
		return length==0;
	}
    public void enqueue(int data) {
	ListNode temp=new ListNode(data);
	if(isEmpty())
		front=temp;
	else
		rear.next=temp;
	
	rear=temp;
	length++;
    }
    //11-->22-->33-->44-->null
    //22-->33-->44-->null
    public int dequeue() {
    	if(isEmpty())
    		throw new NoSuchElementException();
    	int result=front.data;
    	front=front.next;
    	if(front==null)
    		rear=null;
    	length--;
    	return result;
		
	}
    public void print() {
    	ListNode current=front;
    	if (isEmpty())
    		return;
    	
    	while (current!=null) {
			System.out.print(current.data+"-->");
		current=current.next;
		}
    	System.out.println("null");
		
	}
	public static void main(String[] args) {
	Queue queue=new Queue();
	queue.enqueue(11);
	queue.enqueue(22);
	queue.enqueue(33);
	queue.enqueue(44);
	queue.print();
	queue.dequeue();
  //  System.out.println(queue.dequeue());
    queue.print();
	}

}
