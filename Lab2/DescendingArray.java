package com.src.java.lab2exercise;

import java.util.ArrayList;
import java.util.Collections;

public class DescendingArray {

	public static void main(String args[])
	{
		ArrayList alist=new ArrayList();
		alist.add("apple");
		alist.add("watermelon");
		alist.add("banana");
		alist.add("kiwi");
		alist.add("grapes");
		alist.add("orange");
		
		System.out.println("Before sorting: "+alist);
		
		Collections.sort(alist,Collections.reverseOrder());
		
		System.out.println("After sorting: "+alist);
	}
	
}
