package com.array;

public class ArrayUtil {

	//11 22 33 2 44 55 
	//55 44 2 33 22 11 
	public static void reverse(int [] numbers,int start,int end) {
		while (start<end) {
			int temp=numbers[start];
			numbers[start]=numbers[end];
			numbers[end]=temp;
			start++;
			end--;
		}
	}
	  

	public static void printArray(int[] arr) {
		int n=arr.length;
		for (int i = 0; i < n; i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
	//11 22 33 2 44 55 
	//minimum value is 2
	public static void findMinimum(int[] arr) {
		if(arr==null||arr.length==0)
			throw new IllegalArgumentException("invalid input");
		int min=arr[0];
		for (int i = 0; i < arr.length-1; i++) {
			if(arr[i]<min)
				min=arr[i];
		}
		System.out.println("minimum value is "+min);
	}
	public static int[] resize(int[] arr,int capacity) {
		int[] temp=new  int[capacity];
		for (int i = 0; i < arr.length-1; i++) {
			temp[i]=arr[i];
		}
		return temp;
	}
	
	public static void main(String[] args) {
		int[] numbers= {11,22,33,2,44,55};
		
		printArray(numbers);
		//reverse(numbers, 0, numbers.length-1);;
		//printArray(numbers);
		//findMinimum(null);123
		System.out.println(numbers.length);
		int[] newcapacity=resize(numbers,10);
		System.out.println(newcapacity.length);
	}

}
