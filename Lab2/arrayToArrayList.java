package com.src.java.lab2exercise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class arrayToArrayList {

	public static void main(String args[])
	{
		String[] str= {"Mango"," apple"," orange"," grapes"};
		
		List<String> l1=new ArrayList<String>(Arrays.asList(str));
		
		l1.add("banana");
		l1.add("watermelon");
		System.out.println(l1);
	}
}
