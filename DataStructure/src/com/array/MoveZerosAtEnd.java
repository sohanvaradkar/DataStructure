package com.array;

public class MoveZerosAtEnd
{

	
	public static void printArray(int[] arr) {
		int n=arr.length;
		for (int i = 0; i < n; i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
	//11 22 33 0 5 0 7 
	//11 22 33 5 7 0 0
	public static void moveZeros(int[] numbers,int n)
	{
		int j=0; //focus on zero elements
	for (int i = 0; i < n; i++) {//focus on nonzero elements
		
		if(numbers[i]!=0&&numbers[j]==0)
		{
			int temp=numbers[i];
			numbers[i]=numbers[j];
			numbers[j]=temp;
		}
		if(numbers[j]!=0)
			{j++;}
	}	

	}
	public static void main(String[] args) {

    int[] numbers= {11,22,33,0,5,0,7} ;
    
    printArray(numbers);
    moveZeros(numbers,numbers.length);
    printArray(numbers);
	}

}
