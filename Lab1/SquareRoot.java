package com.srm.lab1.java;

import java.util.Scanner;

public class SquareRoot {
  public static void main(String args[])
  {
	  Scanner sc=new Scanner(System.in);
	  System.out.println("Enter the number:");
	  int n=sc.nextInt();
	  System.out.println("the square root of: "+n+" "+doubleSquare(n));
  }
  public static double doubleSquare(int number)
  {
	double temp;
	double ds=number/2;
	do
	{
		temp=ds;
		ds=(temp+(number/temp))/2;
	}while((temp-ds)!=0);
	return ds;
  }
}
