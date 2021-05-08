package com.src.java.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class TestingClass {
	 public static void main(String[] args) {
	  
		 //GorceryClass gc=new GorceryClass("Lays","dry","laysman",12,"snacks","30/04/2021",5,"medium");
		// GorceryClass gc1=new GorceryClass("slice","liquid","sliceman",30,"drink","30/04/2021",5,"medium");
		// GorceryClass gc2=new GorceryClass("chocolates","dry","chocoman",20,"snacks","30/04/2021",5,"medium");
		// GorceryClass gc3=new GorceryClass("biscuits","dry","parleyG",15,"snacks","30/04/2021",5,"medium");
	
		 ArrayList<GorceryClass> li=new ArrayList<GorceryClass>();
		 li.add(new GorceryClass(101,"Lays","dry","laysman",12,"snacks","30/04/2021",5,"medium"));
		 li.add(new GorceryClass(103,"slice","liquid","sliceman",30,"drink","30/04/2021",35,"medium"));
		 li.add(new GorceryClass(102,"chocolates","dry","chocoman",20,"snacks","30/04/2021",15,"medium"));
		 li.add(new GorceryClass(104,"biscuits","dry","parleyG",15,"snacks","30/04/2021",20,"medium"));
		 li.add(new GorceryClass(100,"cookies","dry","dairy",25,"snacks","30/04/2021",30,"large"));
		
			System.out.println(li);
			 Collections.sort(li);
		        
		        System.out.println("Sorted ArrayList: " 
		                + li);
		        int index = Collections.binarySearch(li, new GorceryClass(102,"chocolates","dry","chocoman",20,"snacks","30/04/2021",5,"medium"));
		        
		        if(index >= 0)
		            System.out.println("Grocery found at index: " + index);        
		        else
		            System.out.println("Grocery not found in ArrayList");
		 
		    }
            
 }


