package com.src.java.lab2exercise;

import java.util.Scanner;

public class RemoveSpecificchar2 {

	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string");
         String str = sc.nextLine();  
         System.out.println(str);
         removeString(str);
	}

	 static String removeString(String str) {
		
		 StringBuilder sb = new StringBuilder(str);
	      
	        sb.deleteCharAt(str.length() - 1);
	 
	        sb.deleteCharAt(0);
	  
	        return sb.toString();
		
	}
}
