package com.src.java.collections.generics;

import java.util.HashMap;
import java.util.Map;

public class GroceryMethod {

	public static void main(String args[])
	{
		GroceryClassGenerics gc=new GroceryClassGenerics(101,"Lays","dry","laysman",12,"snacks","30/04/2021",5,"medium");
		GroceryClassGenerics gc1=new GroceryClassGenerics(103,"slice","liquid","sliceman",30,"drink","30/04/2021",5,"medium");
		GroceryClassGenerics gc2=new GroceryClassGenerics(104,"chocolates","dry","chocoman",20,"snacks","30/04/2021",5,"medium");
		 GroceryClassGenerics gc3=new GroceryClassGenerics(102,"biscuits","dry","parleyG",15,"snacks","30/04/2021",5,"medium");
		 
		// Map<Integer,String> map=new HashMap<Integer,String>();
		// map.put(gc.getGroceryid(),gc);
		// map.put(gc1.getGroceryid(),gc1);
		// map.put(gc2.getGroceryid(),gc2);
		// map.put(gc3.getGroceryid(),gc3);
		 
	}
}
