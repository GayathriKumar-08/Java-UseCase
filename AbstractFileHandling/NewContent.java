package com.rsrc.java.abstracthandling;

import java.io.IOException;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Scanner;

public class NewContent {
	public String id;
	public String category;
	public String sku;
	public String dateofmanufacturer;
	public String isfragile;
	public String modelnumber;
	public String color;
	public double costStep;
	
	
	
	public NewContent(String id, String category, String sku, String dateofmanufacturer, String isfragile,
			String modelnumber, String color, double costStep) {
		super();
		this.id = id;
		this.category = category;
		this.sku = sku;
		this.dateofmanufacturer = dateofmanufacturer;
		this.isfragile = isfragile;
		this.modelnumber = modelnumber;
		this.color = color;
		this.costStep = costStep;
	}
	



	public String getId() {
		return id;
	}




	public void setId(String id) {
		this.id = id;
	}




	public String getCategory() {
		return category;
	}




	public void setCategory(String category) {
		this.category = category;
	}




	public String getSku() {
		return sku;
	}




	public void setSku(String sku) {
		this.sku = sku;
	}




	public String getDateofmanufacturer() {
		return dateofmanufacturer;
	}




	public void setDateofmanufacturer(String dateofmanufacturer) {
		this.dateofmanufacturer = dateofmanufacturer;
	}




	public String getIsfragile() {
		return isfragile;
	}




	public void setIsfragile(String isfragile) {
		this.isfragile = isfragile;
	}




	public String getModelnumber() {
		return modelnumber;
	}




	public void setModelnumber(String modelnumber) {
		this.modelnumber = modelnumber;
	}




	public String getColor() {
		return color;
	}




	public void setColor(String color) {
		this.color = color;
	}




	public double getCostStep() {
		return costStep;
	}




	public void setCostStep(double costStep) {
		this.costStep = costStep;
	}




	@Override
	public String toString() {
		return "NewContent [id=" + id + ", category=" + category + ", sku=" + sku + ", dateofmanufacturer="
				+ dateofmanufacturer + ", isfragile=" + isfragile + ", modelnumber=" + modelnumber + ", color=" + color
				+ ", costStep=" + costStep + "]";
	}




	public static void main (String args[]) throws IOException, InCorrectDateOfManufacturerException
	{
		try
	    {
		 String id="";
		 String category="";
		 String sku="";
		 String dateofmanufacturer = null;
		 String isfragile="";
		 String modelnumber="";
		 String color="";
		 double costStep=0.0;
		
		ArrayList<NewContent> li=new ArrayList<NewContent>();
		
		NewContent n1=new NewContent("001","FrontShieldGlass","1234545890987654545","00/02/2020","Y","CarSheild001212121","RED",123.45);
		li.add(n1);
		
		Scanner sc=new Scanner(System.in);
		newContentFile hf1=new newContentFile();
        LengthComapre lc=new LengthComapre();

	 	
			System.out.println("Enter the number for looping");
			int n=sc.nextInt();
			for(int i=0;i<n;i++) {
			 System.out.println("Enter the number to invoke methods:");
	            int num = sc.nextInt();
	            switch (num) {
	                case 1:
	                	hf1.getDetails11(li);
	                    break;
	                case 2:
	                	hf1.convertToTxtFile11(li);
	                    break;
	                case 3:
	                	hf1.readFile11(li);
	                    break;
	                case 4:
	                	hf1.countLength11(li);
	                    break;
	                case 5:
                       hf1.validateFile11(li);
	                    break;
	                case 6:
	        			hf1.checkForWords11(li);
	                    break;
	                case 7:
	                	  lc.lenghtComapre1();
	                    break;
	                default:
	                    System.out.println("Input no corresponding operation, please re-enter");
	            }
		     }
	     
	     
	    }catch(RuntimeException e)
		{
	    	e.printStackTrace();
		}
		
		
	}
}
