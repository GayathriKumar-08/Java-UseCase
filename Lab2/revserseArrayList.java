package com.src.java.lab2exercise;

import java.util.ArrayList;
import java.util.Collections;

public class revserseArrayList {

	public static void main(String args[])
	{
		ArrayList<Integer> alist=new ArrayList<Integer>();
		
		alist.add(3);
		alist.add(5);
		alist.add(7);
		alist.add(9);
		alist.add(11);
		alist.add(13);
		alist.add(15);
		
		Collections.reverse(alist);
		
		System.out.print("Elements after reversing: ");
        printElements(alist);
    }

	 static void printElements(ArrayList<Integer> alist) {
		for(int i=0;i<alist.size();i++)
		{
			System.out.println(alist.get(i));
		}
	}
}
