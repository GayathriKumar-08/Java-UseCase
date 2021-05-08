package com.src.java.collections.generics;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class FruitClassGenerics extends BaseClass implements Comparable<FruitClassGenerics>{
	
	int fruitid;
     String fruitname;
     String fruittype;
     String fruitcolor;
     int fruitcost;
     double fruitweight;
     String expirydate;
     String distributorname;
     String location ;
     int costperkg;
     
     public FruitClassGenerics(int fruitid,String fruitname,String fruittype, String fruitcolor,int fruitcost,double fruitweight,String expirydate,
  			String distributorname, String location ,int costperkg) 
  	{
     	 this.fruitid=fruitid;
  		this.fruitname=fruitname;
  		this.fruittype=fruittype;
  		this.fruitcolor=fruitcolor;
  		this.fruitcost=fruitcost;
  		this.fruitweight=fruitweight;
  		this.expirydate=expirydate;
  		this.distributorname=distributorname;
  		this.location=location;  
  		this.costperkg=costperkg;
  	}
	public static void main(String args[]) {
         Scanner sc=new Scanner(System.in);
         int fruitid;
         String fruitname;
         String fruittype;
         String fruitcolor;
         int fruitcost;
         double fruitweight;
         String expirydate;
         String distributorname;
         String location ;
         int costperkg;
         System.out.println("Enter the number for inserting the records:");
         int n=sc.nextInt();
         
         Map<Integer,List<FruitClassGenerics>> hmap=new HashMap<Integer,List<FruitClassGenerics>>();
        //Map<Integer,String> map=new HashMap<Integer,String>();
       List<FruitClassGenerics> l=new ArrayList<FruitClassGenerics>();
        for(int i=0;i<n;i++)
        {
     	
            System.out.println("Enter Fruit Id:");
             fruitid=sc.nextInt();
  
            System.out.println("Enter Fruitname:");
            fruitname=sc.next();
        	  
        	   System.out.println("Enter fruit type:");
            fruittype=sc.next();
        	  
        	   System.out.println("Enter fruit color:");
              fruitcolor=sc.next();
        	  
        	   System.out.println("Enter fruit cost:");
            fruitcost=sc.nextInt();
        	  
        	  System.out.println("Enter fruit weight:");
        	  fruitweight=sc.nextDouble();
        	  
        	 System.out.println("Enter  expiry date:");
          expirydate=sc.next();        	
           System.out.println("Enter  distributorname:");
           distributorname=sc.next();
        	 
           System.out.println("Enter location:");
           location=sc.next();
           
           System.out.println("Enter cost per kg:");
           costperkg=sc.nextInt();
        
           l.add(new FruitClassGenerics(fruitid,fruitname, fruittype, fruitcolor, fruitcost, fruitweight, expirydate, distributorname, location, costperkg));
            hmap.put(0, l);
     }
        MethodTesingGen mc=new MethodTesingGen();
        mc.addData(hmap);
        mc.sortData(l);
      
        
        for(int i=0;i<hmap.size();i++)
        {
        	System.out.println(hmap.get(i));
        }
       }
	
	public int getFruitid() {
		return fruitid;
	}
	public void setFruitid(int fruitid) {
		this.fruitid = fruitid;
	}
	public String getFruitname() {
		return fruitname;
	}
	public void setFruitname(String fruitname) {
		this.fruitname = fruitname;
	}
	public String getFruittype() {
		return fruittype;
	}
	public void setFruittype(String fruittype) {
		this.fruittype = fruittype;
	}
	public String getFruitcolor() {
		return fruitcolor;
	}
	public void setFruitcolor(String fruitcolor) {
		this.fruitcolor = fruitcolor;
	}
	public int getFruitcost() {
		return fruitcost;
	}
	public void setFruitcost(int fruitcost) {
		this.fruitcost = fruitcost;
	}
	public double getFruitweight() {
		return fruitweight;
	}
	public void setFruitweight(double fruitweight) {
		this.fruitweight = fruitweight;
	}
	public String getExpirydate() {
		return expirydate;
	}
	public void setExpirydate(String expirydate) {
		this.expirydate = expirydate;
	}
	public String getDistributorname() {
		return distributorname;
	}
	public void setDistributorname(String distributorname) {
		this.distributorname = distributorname;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public int getCostperkg() {
		return costperkg;
	}
	public void setCostperkg(int costperkg) {
		this.costperkg = costperkg;
	}
	@Override
	public String toString() {
		return "FruitClassGenerics [fruitid=" + fruitid + ", fruitname=" + fruitname + ", fruittype=" + fruittype
				+ ", fruitcolor=" + fruitcolor + ", fruitcost=" + fruitcost + ", fruitweight=" + fruitweight
				+ ", expirydate=" + expirydate + ", distributorname=" + distributorname + ", location=" + location
				+ ", costperkg=" + costperkg + "]";
	}
	
	public boolean equals(FruitClassGenerics obj)
    {
   	 if(obj==null)
   		 return false;
   	 if(obj==this)
   		 return true;
   	 if(obj.getClass()!=getClass())
   		 return false;
   	 
   	 FruitClassGenerics fc = (FruitClassGenerics) obj;
        if(fc.getFruitname().equals(getFruitname())&&fc.getFruitcolor().equals(getFruitcolor()))
   	 return true;
   	 
		return false;
    }
    public int compareTo(FruitClassGenerics o) {
   	    return getFruitname().compareTo(o.getFruitname());
   	  }
    public boolean equals(Object o) {
   	    return false;
   	  }
	 
}
  

