package com.list;

public class SingleLinkedList 
{
	private  ListNode head;
	
	private static class  ListNode
	{
		private int data;
	    private ListNode next;
	    
	    public ListNode(int data) {
	    	this.data=data;
	    	this.next=null;
			
		}
	}
	public void AddNode(int data)
	{
	//	if(head==null)
	//		head=ListNode.;
	}
	
	public  void print()
	{
		ListNode current=head;
		while (current!=null) 
		{
			System.out.print(current.data+" -->");
			current=current.next;
		}
		System.out.print("null");
	}
	
	public int lenth()
	{
		int count=0;
		ListNode node=head;
		
		if(node==null)
			return 0;
		while (node!=null) 
		{
		count++;
		node=node.next;
		
		}
		return count;
	}
	public void addAtStart(int value)
	{
		ListNode listNode=new ListNode(value);
		listNode.next=head;
		head=listNode;
	}
	public void addAtEnd(int value)
	{
		ListNode node=new ListNode(value);
		if(head==null)
		{
			System.out.println("called");
			head=node;
			return;
		}
		ListNode currentnode=head;
		while(currentnode.next!=null)
		{
			currentnode=currentnode.next;
		}
		currentnode.next=node;
	}
	public void insertAt(int index,int data)
	{
		ListNode node=new  ListNode(data);
		if(index==0)
		{
			node.next=head;
			head=node;
		}
		ListNode previous=head;
		for (int i = 0; i < index-1; i++) {
			
			previous=previous.next;
		}
		node.next=previous.next;
		previous.next=node;
	}
	public void deteteFirst()
	{
		if(head==null)
		{
			return ;
		}
		ListNode temp=head;
		head=head.next;
		temp.next=null;
	}
	public void deteteLast()
	{
		if(head==null||head.next==null)
		{
			return ;
		}
		ListNode current=head;
		ListNode previous=null;
		while(current.next!=null)
		{
			previous=current;
			current=current.next;
		}
		previous.next=null;
	}
	public void deleteAt(int position)
	{
		if(position==1)
			head=head.next;
		else
		{
			ListNode previous=head;
			int count=1;
			while(count<position-1)
			{
				previous=previous.next;
				count++;
			}
			ListNode current=previous.next;
			previous.next=current.next;
		}
		
	}
	public boolean searchKey(int key)
	{
		ListNode current=head;
		while (current!=null) {
			if(current.data==key)
				return true;
			current=current.next;
			
		}
		return false;
	}
	public ListNode reverse()
	{
		if(head==null)
			return head;
		
		ListNode current=head;
		ListNode previous=null;
		ListNode next=null;
		while (current!=null) {
			next=current.next;
			current.next=previous;
			previous=current;
			current=next;
			
		}
		return previous;
	}
	
	public ListNode getMiddleNode()
	{
		if(head==null)
			return null;
		
		ListNode slowPtr=head;
		ListNode fastPtr=head;
		while (fastPtr!=null&&fastPtr.next!=null)
		{
			slowPtr=slowPtr.next;
			fastPtr=fastPtr.next.next;
		}
		return slowPtr;
	}
	public ListNode getNthNodeFromEnd(int n) {
		if(head == null) {
			return null;
		}

		if(n <= 0) {
			throw new IllegalArgumentException("Invalid value: n = " + n);
		}

		ListNode mainPtr = head;
		ListNode refPtr = head;

		int count = 0;

		while(count < n) {
			if(refPtr == null) {
				throw new IllegalArgumentException(n + " is greater than the number of nodes in list");
			}
			refPtr = refPtr.next;
			count++;
		}

		while(refPtr != null) {
			refPtr = refPtr.next;
			mainPtr = mainPtr.next;
		}
		return mainPtr;
	}
	
	public void removeSortedDuplicate()
	{
		ListNode current=head;
		
		while (current!=null&&current.next!=null) {
			if (current.data==current.next.data)
			{
			current.next=current.next.next;	
			} else {
               current=current.next;
			}
			
		}
	}
	
	//22 -->33 -->66 -->77 -->88 -->null
	//22 -->33 -->66 -->67 -->77 -->88 -->null
	public ListNode insertInSortedList(int value)
	{
		ListNode newNode=new ListNode(value);
		if(head==null)
			return newNode;
		
		ListNode current=head;
		ListNode temp=null;
		while (current!=null&&current.data<newNode.data) {
			temp=current;
			current=current.next;
		}
		temp.next=newNode;
		newNode.next=current;
		return head;
	}
	//22 -->33 -->66 -->77 -->88 -->null
	//22 -->33 -->77 -->88 -->null
	public void removeNode(int value)
	{
		ListNode current=head;
		ListNode temp=null;
		if(current!=null&&current.data==value)
		{
		head=current.next;
		return;
		}
		while (current!=null&&current.data!=value) {
			temp=current;
		current=current.next;	
		}
		if(current==null)
			return ;
		
		temp.next=current.next;
	}
	public void createLoop()
	{
		ListNode first=new ListNode(1);
		ListNode second=new ListNode(2);
		ListNode third=new ListNode(3);
		ListNode fourth=new ListNode(4);
		ListNode fifth=new ListNode(5);
		ListNode sixth=new ListNode(6);
		head=first;
		first.next=second;
		second.next=third;
		third.next=fourth;
		fourth.next=fifth;
		fifth.next=sixth;
		sixth.next=third;
		
	}
	public boolean detectTheLoop()
	{
		ListNode slowPtr=head;
		ListNode fastPtr=head;
		while(fastPtr!=null&&fastPtr.next!=null)
		{
			slowPtr=slowPtr.next;
		    fastPtr=fastPtr.next.next;
		    if(slowPtr==fastPtr)
		    	return true;
		    
		}
		return false;
	}
	public ListNode startNodeInLoop() {
		ListNode slowPtr=head;
		ListNode fastPtr=head;
		while(fastPtr!=null&&fastPtr.next!=null)
		{
			slowPtr=slowPtr.next;
		    fastPtr=fastPtr.next.next;
		    if(slowPtr==fastPtr)
		    	return getStartingNode(slowPtr);
		    
		}
		return null;
		
	}
private ListNode getStartingNode(ListNode slowPtr) {
		ListNode temp=head;
		while (slowPtr!=temp) {
			temp=temp.next;
			slowPtr=slowPtr.next;
		}
		return temp;
	}
public void  removeLoop() 
{
	ListNode slowPtr=head;
	ListNode fastPtr=head;
	while(fastPtr!=null&&fastPtr.next!=null)
	{
		slowPtr=slowPtr.next;
	    fastPtr=fastPtr.next.next;
	    if(slowPtr==fastPtr)
	    	 removeLoop(slowPtr);
	    return;
	  }
}

private void removeLoop(ListNode slowPtr) {

ListNode temp=head;
while (temp.next!=slowPtr.next) {
	temp=temp.next;
	slowPtr=slowPtr.next;	
}
slowPtr.next=null;
}

public static void main(String[] args) 
{
	SingleLinkedList list =new SingleLinkedList();
	// list.head=new ListNode(10);
	/* ListNode second=new ListNode(1);
	 ListNode third=new ListNode(30);
	 ListNode fourth=new ListNode(55);

	  list.head.next=second;
	  second.next=third;
	  third.next=fourth;*/
	  list.addAtStart(88); list.addAtStart(77); list.addAtStart(66);
	  list.addAtStart(33); list.addAtStart(22);

	//list.addAtStart(66);
	
	//list.addAtEnd(44);
	//list.insertAt(3, 55);
	
	//list.deteteFirst();
	//list.deteteLast();
	//list.deleteAt(2);


	System.out.println();
	//System.out.println(list.searchKey(22));
	ListNode node=list.reverse();
	//ListNode node=list.getMiddleNode();
	list.print();
	//ListNode node=	list.getNthNodeFromEnd(4);
	//System.out.println(node.data);
	//list.removeSortedDuplicate();
	//list.insertInSortedList(67);
	//list.removeNode(22);
	
	//list.createLoop();
	//System.out.println(list.startNodeInLoop().data);
	//list.print();
	//list.removeLoop();
	//System.out.println();
	//list.print();
	//System.out.println(list.lenth());
	
}
}
