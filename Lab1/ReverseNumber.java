package com.srm.lab1.java;

import java.util.Scanner;

public class ReverseNumber {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the numbers");
		int num=sc.nextInt();
		int reverse=0;
		System.out.println("Number entered is: "+num);
		while(num!=0)
		{
			int number=num%10;
			reverse=reverse*10+number;
			num=num/10;
		}
		System.out.println("Reversed number is: "+reverse);
	}
}
