package com.sorting;

public class BubbleSort {

	public void sortArr(int arr[])
	{
		int n=arr.length;
		for (int i = 0; i < n-1; i++) 
		{
			boolean isSwapped;
			
			for (int j = 0; j <n-i-1; j++) {
				if(arr[j]>arr[j+1])
				{
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
					isSwapped=true;
				}
				
			}
			if(isSwapped=false)
				break;
			
		}
	}
	public void printArray(int arr[])
	{
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
			
		}
		System.out.println();
	}
	public static void main(String[] args) {
		int arr[]= {44,32,2,1,66};
		BubbleSort sort=new BubbleSort();
		sort.printArray(arr);
		sort.sortArr(arr);
		sort.printArray(arr);
		
	}
}
