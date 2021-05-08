package com.src.java.lab2exercise;

import java.util.Scanner;

public class CountWords {

	
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string:");
		String str=sc.nextLine();
		System.out.println(wordCount(str)+" words");
	}

	 static int wordCount(String str)
	 {
		 int count=0;
		 char[] ch=new char[str.length()];
		 
		 for(int i=0;i<str.length();i++)
		 {
			 ch[i]=str.charAt(i);
             if( ((i>0)&&(ch[i]!=' ')&&(ch[i-1]==' ')) || ((ch[0]!=' ')&&(i==0)) )  
				 count++;
		 }
		return count;
		 
	 }
}
