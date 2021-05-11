package com.src.java.scientific.calc;

import java.util.Scanner;

public class SquareRootClass {

	public void squareRootMethod() {
    
		Scanner sc=new Scanner(System.in);
		
		System.out.println("square root of numbers");
		
		System.out.println("Enter the numbers that you want to find square root:");
		float n1=sc.nextInt();
		
		float n2=sc.nextInt();
	
		float square= (float) Math.sqrt(n1);
		float square1= (float) Math.sqrt(n2);
		
		System.out.println("Result is: " +square);
		System.out.println("Result is: " +square1);
	}

}
