package com.src.java.lab2exercise;

import java.util.Arrays;

public class IntersectionArrays  {
	public static void main (String[] args)
	{
	    int a[] = { 1, 2, 5, 6, 2, 3, 5 };
	    int b[] = { 2, 4, 5, 6, 8, 9, 4, 6, 5 };
	    int n=a.length;
	    int t=b.length;
	    Arrays.sort(a);
        Arrays.sort(b);
	    intersection(a,7,b,9);
	}

	private static void intersection(int[] a, int n, int[] b, int t) {
	
		int i=0,j=0;
		while(i<n && j<t)
		{
			if(a[i]>b[j])
			{
				j++;
			}
			else if(b[j]>a[i])
			{
				i++;
			}else
			{
				System.out.println(a[i]+" ");
				  i++;
	              j++;
			}
		
		}
	}
}
