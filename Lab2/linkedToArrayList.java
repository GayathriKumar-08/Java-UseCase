package com.src.java.lab2exercise;

import java.util.ArrayList;
import java.util.LinkedList;

public class linkedToArrayList {
	
	public static void main(String args[])
	{
		LinkedList<String> li=new LinkedList<String>();
		li.add("Mango");
		li.add("apple");
		li.add("orange");
		li.add("grapes");
		li.add("watermelon");
		li.add("kiwi");
		li.add("banana");
		System.out.println("Linked List");
		for(int i=0;i<li.size();i++)
		{
			System.out.println(li.get(i));
		}
		System.out.println("=======================================");
		System.out.println(" From Linked list to Array list");
		ArrayList<String> alist=new ArrayList<String>(li);
		for(int i=0;i<alist.size();i++)
		{
			System.out.println(alist.get(i));
		}
	}

}
