package com.search;

public class LinearSearch {
	
	private  int searchKey(int[] arr ,int key)
	{
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]==key)
				return i;
			
		}
		return -1;
	}

	public static void main(String[] args) 
	{
		int[] arr = {5, 1, 9, 2, 10, 15, 20};
		LinearSearch search=new LinearSearch();
		
		System.out.println(search.searchKey(arr, 5));

	}

}
