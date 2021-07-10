package com.list;

public class ArrayRemove {
static 	int[] n= {10,20,30,40};
	public static void main(String[] args) {
	
		
		//System.out.println(n[3]);
		removeAt(1,n.length);
	}
	public static  void removeAt(int index,int l)
	{
		if(index<0|| index>=l) 
			throw new IllegalArgumentException();
		for (int i = index; i < l; i++) 
		{
			System.out.println(n[i]);
			n[i]=n[i+1];
			l--;
		}
		
		System.out.println(n.length);
	}
	

}
