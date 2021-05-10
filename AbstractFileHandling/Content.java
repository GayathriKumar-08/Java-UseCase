package com.rsrc.java.abstracthandling;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class Content extends BaseClass {

	public String id;
	public String category;
	public String sku;
	public String dateofmanufacturer;
	public String isfragile;
	public String modelnumber;
	public String color;
	public double costStep;
	
	
	public Content(String id, String category, String sku, String dateofmanufacturer, String isfragile,
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


	@Override
	public String toString() {
		return "Content [id=" + id + ", category=" + category + ", sku=" + sku + ", dateofmanufacturer="
				+ dateofmanufacturer + ", isfragile=" + isfragile + ", modelnumber=" + modelnumber + ", color=" + color
				+ ", costStep=" + costStep + "]";
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
		
		ArrayList<Content> li=new ArrayList<Content>();
		Content c1=new Content("001","FrontShieldGlass","1234545890987654545","12/02/2020","Y","CarSheild001212121","RED",123.45);
		Content c2=new Content("002","FrontShieldGlass","1234567890987654545","13/02/2020","Y","CarSheild001212121","BLUE",123.45);
		Content c3=new Content("003","FrontShieldGlass","123453489098765454","00/02/2020","Y","CarSheild001212121","YEL",123.45);
		Content c4=new Content("004","FrontShieldGlass","1256567890987654545","15/02/2020","Y","CarSheild001212121","ORG",123.45);
		Content c5=new Content("002","FrontShieldGlass","1234567890987654545","13/02/2020","Y","CarSheild001212121","BLUE",123.45);
		Content c6=new Content("006","FrontShieldGlass","1234578890987654545","17/02/2020","Y","CarSheild001212121","RED",123.45);
		Content c7=new Content("007","FrontShieldGlass","1234567890987654545","18/02/2020","Y","CarSheild001212121","RED",123.45);
	    Content c8=new Content("001","FrontShieldGlass","1234545890987654545","12/02/2020","Y","CarSheild001212121","RED",123.45);
   	    Content c9=new Content("001","FrontShieldGlass","1234545890987654545","12/02/2020","Y","CarSheild001212121","RED",123.45);
	    Content c10=new Content("006","FrontShieldGlass","1234578890987654545","17/02/2020","Y","CarSheild001212121","RED",123.45);	
		
		li.add(c1);
		li.add(c2);
		li.add(c3);
		li.add(c4);
		li.add(c5);
		li.add(c6);
		li.add(c7);
		li.add(c8);
	    li.add(c9);
	    li.add(c10);
		
		//Content c=new Content(id, category, sku, dateofmanufacturer,isfragile, modelnumber, color, costStep);
		 
		Scanner sc=new Scanner(System.in);
		
		 Headerfile123 hf=new Headerfile123();
		 LengthComapre lc=new LengthComapre();
		 InCorrectDateOfManufacturerException ic=new InCorrectDateOfManufacturerException();
	  
	     System.out.println("Enter the number for looping");
			int n=sc.nextInt();
			for(int i=0;i<n;i++) {
			 System.out.println("Enter the number to invoke methods:");
	            int num = sc.nextInt();
	            switch (num) {
	                case 1:
	                	hf.getDetails1(li);
	                    break;
	                case 2:
	                	hf.convertToTxtFile1(li);
	                    break;
	                case 3:
	                	hf.readFile1(li);
	                    break;
	                case 4:
	                	hf.countLength1(li);
	                    break;
	                case 5:
	                	hf.validateFile1(li);
	                    break;
	                case 6:
	                	hf.checkSKU(li);
	                    break;
	                case 7:
	                	  lc.lenghtComapre();
	                    break;
	                case 8:
	                	 hf.checkLineFile(li);
	                    break;
	                case 9:
	                	hf.checkForWords(li);
	                    break;
	                case 10:
	                	 ic.checkValidDate(li);
	                    break;
	                default:
	                    System.out.println("Input no corresponding operation, please re-enter");
	            }
		     }
		 
	     
	   }catch(RuntimeException e)
		{
		System.out.println("System Error has occurred, please try after sometime");
		e.printStackTrace();
		}
	}
	
}
