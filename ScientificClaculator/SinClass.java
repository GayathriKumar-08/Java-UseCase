package com.src.java.scientific.calc;

import java.util.Scanner;

public class SinClass {

	public void sinMethod() {
		
		System.out.println("sin method");
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the number");
		
		double a=sc.nextDouble();
		double b=Math.toRadians(a);
		System.out.println(Math.sin(b));
		
		System.out.println("Enter the number");
		double a1=sc.nextDouble();
		double b1=Math.toRadians(a1);
		System.out.println(Math.sin(b1));
		
	}
	
}
