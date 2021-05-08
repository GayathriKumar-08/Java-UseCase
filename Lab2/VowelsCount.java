package com.src.java.lab2exercise;

import java.util.Scanner;

public class VowelsCount {
	public static void main(String[] args) {  
		 Scanner sc=new Scanner(System.in);
		 System.out.println("Enter the string");
        String str = sc.nextLine();  
        System.out.println("String is: "+str);
        System.out.println(getCountofvowels(str));
	}
    static boolean isVowel(char ch)
    {
    	ch=Character.toUpperCase(ch);
    	return (ch=='A'|| ch=='E'||ch=='I'||ch=='O'||ch=='U');
    }
	
	public static int getCountofvowels(String str) {
		int count=0;
		for(int i=0;i<str.length();i++)
		{
			if(isVowel(str.charAt(i)))
				++count;
		}
		return count;
	}
	
}
