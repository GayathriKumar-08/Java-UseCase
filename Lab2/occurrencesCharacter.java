package com.src.java.lab2exercise;

import java.util.Scanner;

public class occurrencesCharacter {

	 static final int maxch=256;
	 
	  static void getOccurencesChar(String str) {
		  
		int count[]=new int[maxch];
		int n=str.length();
		
		for(int i =0;i<n;i++)
			count[str.charAt(i)]++;
		
			char[] ch=new char[str.length()];
			
			for(int i =0;i<n;i++)
			{
				ch[i]=str.charAt(i);
				int find=0;
				
				for(int j=0;j<=i;j++)
				{
					if(str.charAt(i)==ch[j])
						find++;
				}
					if(find==1)
					{
			          System.out.println("Number of Occurrence of "+ str.charAt(i)+ " is:" + count[str.charAt(i)]);
					}
		}
		}
	
	   public static void main(String args[])
	   {
		   Scanner sc=new Scanner(System.in);
		   System.out.println("Enter the string");;
		   String str=sc.nextLine();

		   getOccurencesChar(str);
	  }

	
}
