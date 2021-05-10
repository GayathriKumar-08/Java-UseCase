package com.src.java.pos.report;

import java.util.ArrayList;

public class PosReport {

	double total=0;
	public double total(ArrayList<SalesReport> li) {

		//System.out.println("Hello this total method");
	
	     for(int i=0;i<li.size();i++)
	     {
	    	 SalesReport sr1=li.get(i);
          
            total += sr1.getTotal();
	     }
	     //System.out.println("Total:" + total);
		return total;
	}

}
