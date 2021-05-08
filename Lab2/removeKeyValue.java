package com.src.java.lab2exercise;

import java.util.HashMap;
import java.util.Map;

public class removeKeyValue {

	public static void main(String args[])
	{
		Map<Integer,String> hmap=new HashMap<Integer,String>();
		
		 
		   hmap.put(5, "apple");
	       hmap.put(11, "mango");
	       hmap.put(4, "banana");
	       hmap.put(77, "watermelon");
	       hmap.put(9, "grapes");
	       hmap.put(66, "kiwi");
	       System.out.println("before removing: "+hmap);
	       hmap.remove(9,"grapes");
	       System.out.println("After removing: "+hmap);
	     
	}

	
}
