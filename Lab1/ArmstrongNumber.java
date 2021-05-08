package com.srm.lab1.java;

import java.util.Scanner;

public class ArmstrongNumber {
  public static void main(String args[])
  {
	  int c=0,temp,a;
	  Scanner sc=new Scanner(System.in);
	  System.out.println("Enter the number:");
	  int n=sc.nextInt();
	  temp=n;
	 
	  while(n!=0) //while(n>0)
	  {
		  a=n%10;
		  n=n/10;
		  c+=a*a*a;
	  }
	  if(temp==c)
	  {
		  System.out.println(temp+" is an armstrong number");
	  }
	  else
		  System.out.println(temp+" is not an armstrong number");
  }
}
