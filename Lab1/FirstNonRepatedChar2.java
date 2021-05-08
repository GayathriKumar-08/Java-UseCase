package com.srm.lab1.java;

import java.util.Scanner;

public class FirstNonRepatedChar2 {
	static final int ch = 256;
    static char count[] = new char[ch];
    
    static void getCount(String str)
    {
        for (int i = 0; i < str.length(); i++)
            count[str.charAt(i)]++;
    }
    static int firstNonRepeating(String str)
    {
        getCount(str);
        int index = -1;
 
        for (int i = 0; i < str.length(); i++) {
            if (count[str.charAt(i)] == 1) {
                index = i;
                break;
            }
        }
 
        return index;
    }
 
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string");
		String str=sc.nextLine();
		System.out.println("The Entered String is: "+str);
		  int index = firstNonRepeating(str);
		  
	        System.out.println("First non-repeating character is " + str.charAt(index));
	 }
	
}


