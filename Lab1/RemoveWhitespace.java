package com.srm.lab1.java;

import java.util.Scanner;

public class RemoveWhitespace {
 public static void main(String args[])
 {
	 Scanner sc=new Scanner(System.in);
	 System.out.println("Enter a string");
	 String str=sc.nextLine();
	 System.out.println("given String: " + str);
	 
	 str = str.replaceAll("\\s", "");
	 System.out.println("current String: " + str);
 }
}
