package com.search;

public class BinarySearch 
{

	private int searchNum(int[] arr,int num)
	{
		int low =0;
		int high=arr.length-1;
		while (low<=high) {
			int mid=high+low/2;
			if(arr[mid]==num)
				return mid;
			
			if(num<arr[mid])
				high=mid-1;
			else
				low=mid+1;
		}
		return -1;
	}
	public static void main(String[] args) {
		int num[]= {3,5,8,43,78,87,98};
		BinarySearch binarySearch=new BinarySearch();
		;
		System.out.println(binarySearch.searchNum(num, 43));
		
	}
}
