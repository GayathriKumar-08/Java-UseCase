package com.src.java.lab2exercise;

import java.util.Scanner;

public class reverseArray {
	public static void main(String args[])
	{
		int [] arr= {10,20,30,40,50};
		System.out.println("Given array is:");
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(+arr[i]);
			
		}
		
		reverse(arr,arr.length);
	}

	 static void reverse(int[] arr, int n) {
	int[] b=new int[n];
	int j=n;
	for(int i=0;i<n;i++)
	{
		b[j-1]=arr[i];
		j=j-1;
	}
	System.out.println("reversed array");
	for(int k=0;k<n;k++)
	{
		System.out.println(b[k]);
	}
	
	}
}
