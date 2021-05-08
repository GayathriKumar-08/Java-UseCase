package com.srm.lab1.java;

import java.util.Scanner;

public class DuplicateCharacters {
   public static void main(String args[])
   {
	   Scanner sc=new Scanner(System.in);
	   System.out.println("Enter a String");
	   String str=sc.nextLine();
	   int count=0;
	   char[] stri=str.toCharArray();
	   System.out.println("duplicate characters.......");
	   for(int i=0;i<stri.length;i++)
	   {
		   count=1;
		   for(int j=i+1;j<stri.length;j++)
		   {
			   if(stri[i] == stri[j] && stri[i] != ' ') {    
                   count++;    
                   stri[j] = '0';    
               }    
		   }
		   if(count>1 && stri[i]!='0')
		   {
			   System.out.println("Duplicate character present in the string is: "+stri[i]);
		   }
	   }
   }
}
