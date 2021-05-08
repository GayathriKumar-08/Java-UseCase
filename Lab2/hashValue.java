package com.src.java.lab2exercise;

import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class hashValue {

	  public static void main(String args[])
	   {
		  HashMap<Integer, String> hmap = new HashMap<Integer, String>();
	       hmap.put(5, "apple");
	       hmap.put(11, "mango");
	       hmap.put(4, "banana");
	       hmap.put(77, "watermelon");
	       hmap.put(9, "grapes");
	       hmap.put(66, "kiwi");
	       
	       System.out.println("Before Sorting:");
	       Set set = hmap.entrySet();
	       Iterator iterator = set.iterator();
	          while(iterator.hasNext())
	         {
	            	Map.Entry me=(Map.Entry)iterator.next();
	            	 System.out.println(me.getKey()+":"+me.getValue());
	          }
	          System.out.println("================================");
	          
	             Map<Integer,String> map=sortByValues(hmap);
	          
	             System.out.println("After Sorting:");
	             
	             Set set2=map.entrySet();
	             
	             Iterator iterator2=set2.iterator();
	             while(iterator2.hasNext())
	             {
	            	 Map.Entry me2=(Map.Entry)iterator2.next();
	            	 System.out.println(me2.getKey()+":"+me2.getValue());
	               } 
	   }
	  private static HashMap sortByValues (HashMap map)
	  {
		  List list=new LinkedList(map.entrySet());
		  Collections.sort(list, new Comparator()
		 {
			  public int compare(Object ob1,Object ob2)
			  {
		         return ((Comparable) ((Map.Entry) (ob1)).getValue())
                  .compareTo(((Map.Entry) (ob2)).getValue());
			  }
		 });
		  HashMap sortedHashMap = new LinkedHashMap();
		  for (Iterator it = list.iterator(); it.hasNext();) {
              Map.Entry entry = (Map.Entry) it.next();
              sortedHashMap.put(entry.getKey(), entry.getValue());
       } 
       return sortedHashMap;
  }
}


