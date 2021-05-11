package com.src.java.scientific.calc;

import java.util.Scanner;

public class CosClass {

	
	public void cosMethod()
	{
 
		System.out.println("cos method");
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the number");
		
		double a=sc.nextDouble();
		double b=Math.toRadians(a);
		System.out.println(Math.cos(b));
		
		System.out.println("Enter the number");
		double a1=sc.nextDouble();
		double b1=Math.toRadians(a1);
		System.out.println(Math.cos(b1));
	}
}
