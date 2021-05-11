package com.src.java.scientific.calc;

import java.util.Scanner;

public class CubeRootClass {

	public void cubeRootMethod() {

		Scanner sc=new Scanner(System.in);
		
		System.out.println("cube root of numbers");
		
		System.out.println("Enter the numbers that you want to find cube root:");
		float n1=sc.nextInt();
		
		float n2=sc.nextInt();
	
		float cube= (float) Math.cbrt(n1);
		float cube1= (float) Math.cbrt(n2);
		
		System.out.println("Result is: " +cube);
		System.out.println("Result is: " +cube1);
		
	}

}
