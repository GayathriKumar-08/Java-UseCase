package com.src.java.lab2exercise;

import java.util.HashSet;

public class IntersectionArrays2 {
   public static void main(String args[])
   {
	   int arr1[]= {7,6,8,9,10,4,4,6};
	   int arr2[]= {6,4,4,8,2};
	 
	   System.out.println("Intersection of two arrays is : ");
	   printIntersection(arr1, arr2);
	   printUnion(arr1, arr2);
	      
 }

     static void printUnion(int[] arr1, int[] arr2)
     {
    	 HashSet<Integer> hs = new HashSet<>();
	     for(int i=0;i<arr1.length;i++)
	    	 hs.add(arr1[i]);
	     for(int i=0;i<arr2.length;i++)
	    	 hs.add(arr2[i]);
	     System.out.println(hs);
     }

	static void printIntersection(int arr1[], int arr2[])
  {
	 HashSet<Integer> hs = new HashSet<>();
	 HashSet<Integer> hs1 = new HashSet<>();
	 
	 for(int i=0; i<arr1.length; i++)
	 hs.add(arr1[i]);
	 
	 for(int i=0;i<arr2.length;i++)
	 {
		 if(hs.contains(arr2[i]))
			 System.out.println(arr2[i]+" ");
	 }

  }
}
