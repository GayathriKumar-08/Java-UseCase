package com.src.java.lab2exercise;

import java.util.Scanner;

public class stringConcat {
	
	public static void main(String[] args) {  
		 Scanner sc=new Scanner(System.in);
		 System.out.println("Enter the string");
       String str = sc.nextLine(); 
       System.out.println("String is: "+str);
  	 System.out.println("Enter another string for concating");
       String str1 = sc.nextLine(); 
       str=str.concat(" "+str1);
       System.out.println("String is: "+str);
       
	}
}
