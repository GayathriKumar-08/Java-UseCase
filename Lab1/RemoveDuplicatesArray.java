package com.srm.lab1.java;

import java.util.Scanner;

public class RemoveDuplicatesArray {
	
     public static void main(String args[])
     {
    	 
 		int[] arr = new int[20];

 		int a,b,i;
 		
 		
 		Scanner sc = new Scanner(System.in);
 		
 		System.out.print("Enter array size: ");
 		int size = sc.nextInt();
 		
 		
 		for(i=0;i<size;++i)
 		{
 			System.out.print("Elements added " +i +": ");
 			arr[i] = sc.nextInt();
 		}
 		
 		System.out.println("Before removing duplicate element array are :");

 		for(i=0;i<size;++i)
 		{
 			System.out.println(arr[i]);
 		}

 		System.out.println("After removing duplicate element array are :");
 		for(a=0;a<size;++a)
 		{
 			for(b=a+1;b<size;){
 			
 				if(arr[a] == arr[b]){
 					for(int temp = b; temp<size; ++temp){
 						arr[temp] = arr[temp+1];
 					}
 					size =size-1;		
 				}		
 				else
 					b++;		
 			}
 		}
 		
 		for(i=0;i<size;++i)
 			System.out.println(arr[i]);
 	}
 	}






