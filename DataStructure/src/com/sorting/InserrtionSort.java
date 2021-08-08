package com.sorting;

public class InserrtionSort {
	
	private void printArray(int arr[])
	{
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
	//Time Complexity: O(n^2) --1 2 5 9 10 
	private void sortArray(int[] array)
	{
		for (int i = 1; i < array.length; i++)//unsorted 
		{
			//System.out.println("called");
			int temp=array[i];
			int j=i-1; //sorted arr
			while (j>=0&&array[j]>temp) 
			{
				array[j+1]=array[j];//shifting larger element by 1 position
				j--;
			}
			array[j+1]=temp;
		}
		
	}

	public static void main(String[] args) {
		int[] arr= {5,1,2,9,10};
		InserrtionSort sort=new InserrtionSort();
		sort.printArray(arr);
		sort.sortArray(arr);
		sort.printArray(arr);

	}

}
