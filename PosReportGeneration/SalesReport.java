package com.src.java.pos.report;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class SalesReport {

	
	int custid;
	Date date;
	int id;
	String description;
	int count;
	int costperitem;
	int total;
	
     	public SalesReport(int custid,Date date,int id, String description, int count, int costperitem,int total) {
		super();
		this.custid = custid;
		this.date=date;
		this.id = id;
		this.description = description;
		this.count = count;
		this.costperitem = costperitem;
		this.total = total;
	}

	public SalesReport() {
			super();
			// TODO Auto-generated constructor stub
		}

	public int getCustid() {
			return custid;
		}

		public void setCustid(int custid) {
			this.custid = custid;
		}


		public Date getDate() {
			return date;
		}


		public void setDate(Date date) {
			this.date = date;
		}


		public int getId() {
			return id;
		}


		public void setId(int id) {
			this.id = id;
		}


		public String getDescription() {
			return description;
		}


		public void setDescription(String description) {
			this.description = description;
		}


		public int getCount() {
			return count;
		}


		public void setCount(int count) {
			this.count = count;
		}


		public int getCostperitem() {
			return costperitem;
		}


		public void setCostperitem(int costperitem) {
			this.costperitem = costperitem;
		}

		public int getTotal() {
			return total;
		}

		public void setTotal(int total) {
			this.total = total;
		}


	@Override
		public String toString() {
			return "SalesReport [custid=" + custid + ", date=" + date + ", id=" + id + ", description=" + description
					+ ", count=" + count + ", costperitem=" + costperitem + ", total=" + total + "]";
		}

	public static void main(String args[])
	{
		
		
        int custid=0;
        Date date;
		int id=0;
		String description=" ";
		int count=0;
		int costperitem=0;
		int total=0;
          
         ArrayList<SalesReport> li=new ArrayList<SalesReport>();
		  Scanner sc=new Scanner(System.in);
		  Date dt=new Date();
		  System.out.println("enter the customer id");
		  custid=sc.nextInt();
		 //System.out.println("enter the date");
		// date=sc.next();
		 System.out.println("Enter the number of items to be added");
		 int n=sc.nextInt();
		 double gst=0.0;
	     System.out.println("Enter the Gst amount");
	     gst=sc.nextDouble();
		  double grandtotal;
		  
		  SalesReport sr=new SalesReport();
		  
	    	for(int i=0;i<n;i++) {
			System.out.println("Enter the id");
			id=sc.nextInt();
			System.out.println("Enterthe description");
			description=sc.next();
			System.out.println("Enter the number of count");
			count=sc.nextInt();
			System.out.println("Enter the cost per item");
			costperitem=sc.nextInt();
			
			total=count*costperitem;
			
			System.out.println("Total amount "+total);
		
			li.add(new SalesReport(custid,dt,id,description,count,costperitem,total));
	    	}
	    
		
	    	  System.out.println("\t\t\t\t\tE-Mart");
	          System.out.println("\t\t\t\t123 Avenue CA District ");
	   System.out.println("--------------------------------------------------------------------------------------------------------------------");
	   System.out.println("Customer-Id:"+custid);
	   System.out.println(" Date : "+dt);
	   System.out.println("--------------------------------------------------------------------------------------------------------------------");
	   System.out.println("custId\t\tDescription\t\t\tCount\t\t\tCostperitem\t\t\tTotal" );
	   

	          for (int i = 0; i <li.size(); i++)
	          {
	        	  SalesReport sr1=li.get(i);
	                System.out.println(sr1.getId()+"\t\t "+sr1.getDescription()+"\t\t\t"
	                 +sr1.getCount()+"\t\t\t"+sr1.getCostperitem()+"\t\t\t\t"+sr1.getTotal());
                    
	                 
	             }
	          System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t----------------------------");
	         
	          gst=gst/100;
	     // System.out.println(gst);
	          
	      double calgst=gst*total;
	    //  System.out.println(calgst);
	      
	     grandtotal=total+calgst+calgst;
	    
	    // total+=total;
	     PosReport srr=new PosReport();
		 int total1=srr.total(li);
			
	     System.out.println("\t\t\t\t\t\t\t\t\t   Total \t\t\t"+total1);
	     System.out.println("\t\t\t\t\t\t\t\t\t s GST(%6) \t\t\t"+calgst);
	     System.out.println("\t\t\t\t\t\t\t\t\t c GST(%6) \t\t\t"+calgst);
	     System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t----------------------------");
	   
	     
	     System.out.println("\t\t\t\t\t\t\t\t\t Garnd Total \t\t\t"+grandtotal);
	     
	   
	}
 

}
