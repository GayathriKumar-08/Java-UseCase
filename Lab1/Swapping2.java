package com.srm.lab1.java;

import java.util.Scanner;

public class Swapping2 {
	
	public static void main(String args[])
	  {
		  Scanner sc=new Scanner(System.in);
		  System.out.println("swapping number without using third varibale");
		  System.out.println("-------------------------------------------------");
	      System.out.println("Enter the first number");
		  int x=sc.nextInt();
		  System.out.println("Enter the second number");
		  int y=sc.nextInt();
		  System.out.println("before swapping numbers: "+x +"  "+ y);  
		  x=x+y;
		  y=x-y;
		  x=x-y;
		  System.out.println("After swapping numbers: "+x +"  "+ y);  
	  }

}
