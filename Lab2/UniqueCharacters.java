package com.src.java.lab2exercise;

import java.util.Scanner;

public class UniqueCharacters {
	 boolean uniquechar(String input) {
			for(int i=0;i<input.length();i++)
			{
			 for (int j = i + 1; j < input.length(); j++)
		           if (input.charAt(i) == input.charAt(j))
		                    return false;
			}return true;
		}
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the string");
		String input=sc.nextLine();
		
		UniqueCharacters uc=new UniqueCharacters();
		if(uc.uniquechar(input))
		{
	       System.out.println("The String " + input + " has all unique characters");
		}else
		{
           System.out.println("The String " + input + " has duplicate characters");
		}
	}

	
}
