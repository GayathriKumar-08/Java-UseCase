package com.srm.lab1.java;

import java.util.Scanner;

public class Swapping1 {
  public static void main(String args[])
  {
	  int temp=0;
	  Scanner sc=new Scanner(System.in);
	  System.out.println("swapping number by using third varibale");
	  System.out.println("---------------------------------");
       System.out.println("Enter the first number");
	  int x=sc.nextInt();
	  System.out.println("Enter the second number");
	  int y=sc.nextInt();
	  System.out.println("before swapping numbers: "+x +"  "+ y);  
	  temp=x;
	  x=y;
	  y=temp;
	  System.out.println("After swapping numbers: "+x +"  "+ y);  
  }
}
