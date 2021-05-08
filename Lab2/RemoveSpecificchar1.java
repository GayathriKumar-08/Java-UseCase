package com.src.java.lab2exercise;

import java.util.Scanner;

public class RemoveSpecificchar1 {
	
	public static void main(String[] args) {  
		 Scanner sc=new Scanner(System.in);
		 System.out.println("Enter the string");
         String str = sc.nextLine();  
         System.out.println(charRemoveAt(str, 7));  
      }  
      public static String charRemoveAt(String str, int p) {  
         return str.substring(0, p) + str.substring(p+1);  
      }  
}
