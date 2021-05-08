package com.src.java.lab2exercise;

import java.util.Scanner;

public class HighestNumber {

	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of array");
	    int size=sc.nextInt();
	    int[] arr=new int[size];
	    
	    System.out.println("Enter the elements in an array:");
	    for(int i=0;i<size;i++)
	    {
	    	arr[i]=sc.nextInt();
	    }
	    System.out.println("elements in the array are:");
	    for(int i=0;i<size;i++)
		   {
			   System.out.println(arr[i]+" ");
		   }
	    System.out.println("The first highest Number in the Array is: "+getHighestnumber(arr,size));
	}

	 static int getHighestnumber(int[] arr, int size) {
     	int temp=0;
	    for(int i=0;i<size;i++)
	   {
		  for(int j=i+1;j<size;j++)
		 {
			 if(arr[i]>arr[j])
			 {
				temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
		    	}
	 	 }
    	}
		 return arr[size-1];
	 }
}
