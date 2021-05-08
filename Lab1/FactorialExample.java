package com.srm.lab1.java;

import java.util.Scanner;

public class FactorialExample {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int num=sc.nextInt();
		int factRecursive=factRecursive(num);
		int factIter=factIter(num);
		 System.out.println("Factorial Recusrion of "+num+" is: "+factRecursive);   
		 System.out.println("Factorial Iteration of "+num+" is: "+factIter);   
	}
	public static int factRecursive(int n)
	{
		if(n==0)
			return 1;
		else
			return(n*factRecursive(n-1));
	}
	public static int factIter(int n)
	{
		int fact=1;
		for(int i=1;i<=n;i++)
		{
			fact=fact*i;
		}
		return fact;
		
	}

}
