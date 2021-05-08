package com.src.java.lab2exercise;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

public class iteratorHashset {
	public static void main(String args[])
	{
		 HashSet<String> hset = new HashSet<String>();
		 hset.add("apple");
		 hset.add("mango");
		 hset.add("banana");
		 hset.add("watermelon");
		 hset.add("grapes");
		 hset.add("kiwi");
	      
	     Iterator<String> it = hset.iterator();
	     while(it.hasNext())
	     {
	    	   System.out.println(it.next());
	    }
	}

}
