package com.src.java.collections;

import java.util.ArrayList;
import java.util.List;

public class MethodClass {
 
	void addData(List l)
	{
		for(int i=0;i<l.size();i++)
		{
			System.out.println(l);
		}
	}

	public void bubbleSortArrayList(List<FruitClass> l) {
		FruitClass temp;
		    boolean sorted = false;

		    while (!sorted) {
		        sorted = true;
		        for (int i = 0; i < l.size()-1; i++) {
		            if (l.get(i).compareTo(l.get(i + 1)) > 0) {
		                temp = l.get(i);
		                l.set(i, l.get(i + 1));
		                l.set(i + 1, temp);
		                sorted = false;
		            }
		        }
		    }
	}



}


