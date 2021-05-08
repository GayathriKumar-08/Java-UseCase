package com.src.java.lab2exercise;

import java.util.Scanner;

public class lowerUppderDemo {
 
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a string in lower case");
		String st=sc.nextLine();
	    System.out.println("string is : " + st);
	    
	    char ch[]=st.toCharArray();
	    for(int i=0;i<ch.length;i++)
	    {
	    	if(ch[i]>='a'&&ch[i]<='z')
	    	{
	    		ch[i]=(char)((int) ch[i]-32);
	    	}
	    }
	   System.out.println("Upper case string is:");
	   for(int i=0;i<ch.length;i++)
	   {
		   System.out.print(ch[i]);
	   }
	}
}
