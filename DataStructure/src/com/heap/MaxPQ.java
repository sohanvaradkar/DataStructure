package com.heap;

public class MaxPQ {
	
	private Integer [] heap;
	private int size;
	
	
	public MaxPQ(int capacity) {
		heap=new Integer[capacity+1];
		size=0;
	}
	
	public boolean isEmpty()
	{
		return size==0;
	}
	public int size()
	{
		return size;
	}
	public void insert(int x)
	{
		if(size==heap.length-1)
			resize(2*heap.length);
		
		size++;
		heap[size]=x;
		swap(size);
	
	}
	

	private void swap(int k) {
		while (k>1&&heap[k/2]<heap[k]) {
			int temp=heap[k];
			heap[k]=heap[k/2];
			heap[k/2]=temp;
			k=k/2;
	
		}
		
	}

	private void resize(Integer capacity) {
		Integer[] temp=new Integer[capacity];
		for (int i = 0; i < heap.length; i++) {
			temp[i]=heap[i];	
		}
		heap=temp;
		
		
	}
	private void printHeap()
	{
		for (int i = 1; i <= size; i++) {
			System.out.print(heap[i]+" ");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		MaxPQ pq=new MaxPQ(3);
		System.out.println(pq.isEmpty());
		System.out.println(pq.size());
		pq.insert(4);
		pq.insert(5);
		pq.insert(2);
		pq.insert(6);
		pq.insert(1);
		pq.insert(3);
		pq.printHeap();
		System.out.println(pq.size());
		
		

	}

}
