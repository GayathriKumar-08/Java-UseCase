package com.srm.lab1.java;

import java.util.Arrays;
import java.util.Scanner;

public class stringAnagram {
     public static void main(String args[])
     {
    	 Scanner sc=new Scanner(System.in);
	  System.out.println("Enter the first string");
	  String str1=sc.nextLine();
	  System.out.println("Enter the second string");
	  String str2=sc.nextLine();
	  
	  str1=str1.toLowerCase();
	  str2=str2.toLowerCase();
	  
	  if(str1.length()==str2.length())
	  {
		  char[] char1=str1.toCharArray();
		  char[] char2=str2.toCharArray();
		  
		  Arrays.sort(char1);
		  Arrays.sort(char2);
		  
		  boolean result=Arrays.equals(char1, char2);
		 if(result)
		 {
			 System.out.println(str1+" and "+str2+" are anagram");
		 }
		 else
			 System.out.println(str1+" and "+str2+" are not anagram");
	  }
     }
}
