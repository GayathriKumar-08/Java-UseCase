package com.srm.lab1.java;

import java.util.Scanner;

public class SecondHighestNo {
	public static int getSecondlargest(int arr[],int size)
	{
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
		return arr[size-2];
	}
	
	
	
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		   System.out.println("Enter the size");
		   int size=sc.nextInt();
		   int [] arr=new int[size];
		   System.out.println("Enter the elements:");
		   for(int i=0;i<size;i++)
		   {
			   arr[i]=sc.nextInt();
		   }
		   System.out.println("The elements in the array are:");
		   for(int i=0;i<size;i++)
		   {
			   System.out.println(arr[i]+" ");
		   }
		   System.out.println("Second Largest Number is:"+getSecondlargest(arr,size));
	}
    
}
