package com.src.java.collections.generics;

import java.util.Collection;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class MethodTesingGen {

	//public void addData(List<FruitClassGenerics> l) {
		//for(int i=0;i<l.size();i++)
		//{
			//System.out.println(l);
		//}
	//}
	
	public void addData(Map<Integer, List<FruitClassGenerics>> hmap) {
		for(int i=0;i<hmap.size();i++)
		{
			System.out.println(hmap);
		}
	}


	public void sortData(List<FruitClassGenerics> l) {

		Set<FruitClassGenerics> s = new TreeSet<FruitClassGenerics>();
	    s.addAll(l);
	 
	    for (FruitClassGenerics it : s) {
	      System.out.println(s);
	    }

	  }
		
	}
	
	

		
		//Set<FruitClassGenerics> s = new TreeSet<FruitClassGenerics>();
	   // s.addAll((Collection<? extends FruitClassGenerics>) hmap);

	  //  for (FruitClassGenerics it : s) {
	  //    System.out.println(s);
	 //   }

//	}
	
