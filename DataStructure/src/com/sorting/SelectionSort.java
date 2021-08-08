package com.sorting;

public class SelectionSort {
	
private static void printArray(int[] arr)
{
	for (int i = 0; i < arr.length; i++) {
		System.out.print(arr[i]+" ");
		
	}
	System.out.println();
}
//0 1 2 5 9 10 
private static void sort(int[] arr)
{
	for (int i = 0; i < arr.length-1; i++) {
		int min=i;
		for (int j =i+1; j < arr.length; j++) {//compare wich each
			if(arr[j]<arr[min])
				min=j; //assin min

		}
		int temp=arr[min];
		arr[min]=arr[i];
		arr[i]=temp;
		
		
	}
}
	public static void main(String[] args) {
		int [] arr= {5,1,2,9,10,0};
		SelectionSort sort=new SelectionSort();
		sort.printArray(arr);
		sort(arr);
		printArray(arr);
		

	}

}
