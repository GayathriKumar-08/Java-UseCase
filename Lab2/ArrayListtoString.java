package com.src.java.lab2exercise;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListtoString {
	
	public static void main(String args[])
	{
		ArrayList<String> alist=new ArrayList<String>();
		alist.add("Mango");
		alist.add("apple");
		alist.add("orange");
		alist.add("grapes");
		alist.add("watermelon");
		alist.add("banana");
		System.out.println(alist);
		
		String[] str= getStringfromArray(alist);
		System.out.println("String arrya[]:"+Arrays.toString(str));
	}

	 static String[] getStringfromArray(ArrayList<String> alist) {
	
		 String[] str=new String[alist.size()];
		 for(int i=0;i<alist.size();i++)
		 {
			 str[i]=alist.get(i);
		 }
		return str;
	}

}
