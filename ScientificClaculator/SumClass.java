package com.src.java.scientific.calc;

import java.util.Scanner;

public class SumClass {

	public void additionOperation() {
		//System.out.println("This addition method");
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the numbers below for addition");
		
		System.out.println("Enter the First number:");
		int n1=sc.nextInt();
		
		System.out.println("Enter the second number:");
		int n2=sc.nextInt();
	
		int total=n1+n2;
		System.out.println("Result is: " +total);
		
	}

	
}
