package com.src.java.lab2exercise;

import java.util.Scanner;

public class RemoveWhiteSpace {

	
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string");
		String str=sc.nextLine();
		System.out.println("Given String: "+str);
		
	   str=str.replaceAll("\\s", "");
	   System.out.println("current String: "+str);
	}
}
