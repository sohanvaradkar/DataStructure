package com.sorting;

public class MergeSort {
	
	private static void  sort1(int[] arr1,int[] arr2,int m,int n)
	{
		Integer[] result=new Integer[m+n];
		int i=0;
		int j=0;
		int k=0;
		while (i<m&&j<n) {
		
				if(arr1[i]>arr2[j])
				{
					result[k]=arr2[j];
					j++;
				}
				else {
					result[k]=arr1[i];
					i++;	
			}
				k++;
		}
		while(i<m)
		{
			result[k]=arr1[i];
			i++;
			k++;
		}
		while(j<n)
		{
			result[k]=arr2[j];
			j++;
			k++;
		}
		
		for (int k2 = 0; k2 < result.length; k2++) {
			System.out.print(result[k2]+" ");
			
		}
		System.out.println();
	}
	public void printArray(int[] arr) {
        int n = arr.length;
        for(int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
	//-1 2 3 4 5 9 
	public void sort(int[] arr, int[] temp, int low, int high){
        if(low < high){ // base case
            int mid = low + (high - low) / 2; // overflow condition (low + high) / 2;
            sort(arr, temp, low, mid);
            sort(arr, temp, mid + 1, high);
            merge(arr, temp, low, mid, high);
        }
    }

    private void merge(int[] arr, int[] temp, int low, int mid, int high) {
        for(int i = low; i <= high; i++){
            temp[i] = arr[i];
        }
        int i = low; // traverse left sorted subarray
        int j = mid + 1; // traverse right sorted subarray
        int k = low; // will merge both arrays into original array (arr)

        while(i <= mid && j <= high){
            if(temp[i] <= temp[j]){
                arr[k] = temp[i];
                i++;
            } else {
                arr[k] = temp[j];
                j++;
            }
            k++;
        }

        while(i <= mid){
            arr[k] = temp[i];
            k++;
            i++;
        }
    }
	public static void main(String[] args)
	{
		int arr1[]= {2,5,7,8};
		int arr2[]= {3,4,9};
		//sort(arr1,arr2,arr1.length,arr2.length);
		
		
		int[] arr = new int[] {9, 5, 2, 4, 3, -1};
        MergeSort ms = new MergeSort();
        ms.sort(arr, new int[arr.length], 0, arr.length - 1);
        ms.printArray(arr);
	}

}
