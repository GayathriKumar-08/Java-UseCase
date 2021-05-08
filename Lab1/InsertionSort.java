package com.srm.lab1.java;

public class InsertionSort {
	
	public static void main(String args[])
	{
		int arr[]= {10,4,20,26,8,30,25,14,38,11};
		System.out.println("Before insertion sort");
		for(int i:arr)
		{
			System.out.println(i+" ");
		}
		System.out.println();
		insertionsort(arr);
		System.out.println("after insertion sort");
		for(int i:arr)
		{
			System.out.println(i+" ");
		}
	}
	public static void insertionsort(int arr1[])
	{
		int n=arr1.length;
		for(int j=0;j<n;j++)
		{
			int key=arr1[j];
			int i=j-1;
			while((i>-1)&&(arr1[i]>key))
			{
				arr1[i+1]=arr1[i];
				i--;
			}
			arr1[i+1]=key;
		}
	}

}
