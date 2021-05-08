package com.srm.lab1.java;

import java.util.Scanner;

public class ReverseFun1 {
	public static void main(String args[])
	{
		String rev="";
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a string");
		String input=sc.nextLine();
		for(int i=input.length()-1;i>=0;--i)
		{
		   rev+=input.charAt(i);
		}
		System.out.println(rev+"");
	}

}
