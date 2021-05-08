package com.srm.lab1.java;

import java.util.Scanner;

public class ReverseFun2 {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string:");
		String str=sc.nextLine();
	    reversefunction(str,str.length()-1);	
	}
      public static void reversefunction(String st, int position)
      {
    	  if(position>-1)
    	  {
    		  System.out.println(st.charAt(position));
    		  reversefunction( st,  position-1);
    	  }
      }
}
