package com.srm.lab1.java;

import java.util.Scanner;

public class Permutation 
{
	public static void main(String args[])
	{
		  Scanner sc=new Scanner(System.in);
		   System.out.println("Enter the string");
		   String str=sc.nextLine();
		   int n=str.length();
		Permutation permutation=new Permutation();
		permutation.permute(str,0,n-1);
	}

	private static void permute(String str, int l, int r) {
		if(l==r)
		{
			System.out.println(str);
		}
		else {
			for(int i=l;i<=r;i++)
			{
				str=swap(str,l,r);
				permute(str,l+1,r);
				str=swap(str,l,r);
			}
		}
	}
	private static String swap(String str, int l, int r) {
		
		char temp;
		char [] ch=str.toCharArray();
		temp=ch[l];
		ch[l]=ch[r];
		ch[r]=temp;
		
		return String.valueOf(ch);
	}
}
