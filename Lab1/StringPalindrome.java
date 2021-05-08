package com.srm.lab1.java;

import java.util.Scanner;

public class StringPalindrome {
public static void main(String args[])
{
    String a, b = "";
    Scanner s = new Scanner(System.in);
      System.out.print("Enter the string:");
      a = s.nextLine();
      int n = a.length();
      for(int i = n - 1; i >= 0; i--)
       {
           b = b + a.charAt(i);
        }
       if(b.equals(a))     //if(a.equalsIgnoreCase(b))
      {
        System.out.println(a+" is palindrome.");
      }
     else
    {
    System.out.println(a+" is not palindrome.");
    }
}
}