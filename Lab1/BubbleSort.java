package com.srm.lab1.java;

public class BubbleSort {
	public static void main(String args[]) {
	int arr[]= {10,4,20,26,8,30,25,14,38,11};
	System.out.println("Before Bubble sort");
	for(int i=0;i<arr.length;i++)
	{
		System.out.println(arr[i]+" ");
	}
	bubblesort(arr);
	System.out.println("After Bubble sort");
	for(int i=0;i<arr.length;i++)
	{
		System.out.println(arr[i]+" ");
	}
	}
	  public static void bubblesort(int arr1[])
	 {
		int n=arr1.length;
		int temp=0;
		for(int i=0;i<n;i++)
		{
			for(int j=1;j<(n-1);j++)
			{
				if(arr1[j-1]>arr1[j])
				{
					temp=arr1[j-1];
					arr1[j-1]=arr1[j];
					arr1[j]=temp;
				}
			}
	}
   }
}
