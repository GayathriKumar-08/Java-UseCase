package com.src.java.collections;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FruitClass extends OrangeFruit implements Comparable<FruitClass>{
	 int fruitid;
  
	String fruitname;
     String fruittype;
     String fruitcolor;
     double fruitcost;
     double fruitweight;
     String expirydate;
     String distributorname;
     String location ;
     double costperkg;
     
  
     public FruitClass(int fruitid,String fruitname,String fruittype, String fruitcolor,double fruitcost,double fruitweight,String expirydate,
 			String distributorname, String location ,double costperkg) 
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
        double fruitcost;
        double fruitweight;
        String expirydate;
        String distributorname;
        String location ;
        double costperkg;
        System.out.println("Enter the number for inserting the records:");
        int n=sc.nextInt();
       List l=new ArrayList<>();
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
       	  
       
       	  System.out.println("Enter fruit weight:");
       	  fruitweight=sc.nextDouble();
       	  
       	 System.out.println("Enter  expiry date:");
         expirydate=sc.next();
       	
          System.out.println("Enter  distributorname:");
          distributorname=sc.next();
       	 
          System.out.println("Enter location:");
          location=sc.next();
          
          System.out.println("Enter cost per kg:");
          costperkg=sc.nextDouble();
          
          
        	  fruitcost=costperkg *fruitweight;
          
          l.add(new FruitClass(fruitid,fruitname, fruittype, fruitcolor, fruitcost, fruitweight, expirydate, distributorname, location, costperkg));  
    }
    MethodClass mc=new MethodClass();
    mc.addData(l);
    mc.bubbleSortArrayList(l);
   //
    //mc.bubbleSort(l);

    for(int i=0;i<l.size();i++)
    {
    	System.out.println(l.get(i));
    }
    	}
     
     public int getFruitid() {
		return fruitid;
	}
	public void setFruitid(int fruitid) {
		this.fruitid = fruitid;
	}
    
	
	@Override
	public String toString() {
		return "FruitClass [fruitid=" + fruitid + ", fruitname=" + fruitname + ", fruittype=" + fruittype
				+ ", fruitcolor=" + fruitcolor + ", fruitcost=" + fruitcost + ", fruitweight=" + fruitweight
				+ ", expirydate=" + expirydate + ", distributorname=" + distributorname + ", location=" + location
				+ ", costperkg=" + costperkg + "]";
	}
	public int compareTo(FruitClass fc) {
		int res = 0;
        if (this.fruitid < fc.getFruitid()) {
            res =- 1;
        }
        if (this.fruitid > fc.getFruitid()) {
            res = 1;
        }
        return res;
	}
}