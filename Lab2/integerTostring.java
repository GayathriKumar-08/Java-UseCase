package com.src.java.lab2exercise;

import java.util.Scanner;

public class integerTostring {

	public static void main(String arg[])
	{
		 Scanner sc=new Scanner(System.in);
		 System.out.println("Enter the number");
        int num = sc.nextInt();  
        System.out.println("the number is:" +num);
        
        String s=String.valueOf(num);
        System.out.println("converted into string: "+s + 100);
        
        String s1=Integer.toString(num);  
        System.out.println("converted into string: "+s1 + 100);
        
        String s2=String.format("%d",num);  
        System.out.println("converted into string: "+s2 + 100);
	}
}
