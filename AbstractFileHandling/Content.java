package com.rsrc.java.abstracthandling;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class Content extends BaseClass {

	public long Id;
	public String Category;
	public String SKU;
	public String DateofManufacturer;
	public String ISFragile;
	public String ModelNumber;
	public String Color;
	public double CostStep;
	
	public Content(long id, String category, String sKU, String dateofManufacturer, String iSFragile, String modelNumber,
			String color, double costStep) {
		super();
		Id = id;
		Category = category;
		SKU = sKU;
		DateofManufacturer = dateofManufacturer;
		ISFragile = iSFragile;
		ModelNumber = modelNumber;
		Color = color;
		CostStep = costStep;
	}
	
	@Override
	public String toString() {
		return "Content [Id=" + Id + ", Category=" + Category + ", SKU=" + SKU + ", DateofManufacturer="
				+ DateofManufacturer + ", ISFragile=" + ISFragile + ", ModelNumber=" + ModelNumber + ", Color=" + Color
				+ ", CostStep=" + CostStep + "]";
	}

	public long getId() {
		return Id;
	}

	public void setId(long id) {
		Id = id;
	}

	public String getCategory() {
		return Category;
	}

	public void setCategory(String category) {
		Category = category;
	}

	public String getSKU() {
		return SKU;
	}

	public void setSKU(String sKU) {
		SKU = sKU;
	}

	public String getDateofManufacturer() {
		return DateofManufacturer;
	}

	public void setDateofManufacturer(String dateofManufacturer) {
		DateofManufacturer = dateofManufacturer;
	}

	public String getISFragile() {
		return ISFragile;
	}

	public void setISFragile(String iSFragile) {
		ISFragile = iSFragile;
	}

	public String getModelNumber() {
		return ModelNumber;
	}

	public void setModelNumber(String modelNumber) {
		ModelNumber = modelNumber;
	}

	public String getColor() {
		return Color;
	}

	public void setColor(String color) {
		Color = color;
	}

	public double getCostStep() {
		return CostStep;
	}

	public void setCostStep(double costStep) {
		CostStep = costStep;
	}

	public static void main (String args[]) throws IOException, InCorrectDateOfManufacturerException
	{
		try
	    {
		 long Id=0;
		 String Category="";
		 String SKU="";
		 String DateofManufacturer = null;
		 String ISFragile="";
		 String ModelNumber="";
		 String Color="";
		 double CostStep=0.0;
		
		ArrayList<Content> li=new ArrayList<Content>();
		Content c1=new Content(001,"FrontShieldGlass","1234545890987654545","12/02/2020","Y","CarSheild001212121","RED",123.45);
		Content c2=new Content(002,"FrontShieldGlass","1234567890987654545","13/02/2020","Y","CarSheild001212121","BLUE",123.45);
		Content c3=new Content(003,"FrontShieldGlass","123453489098765454","00/02/2020","Y","CarSheild001212121","YEL",123.45);
		Content c4=new Content(004,"FrontShieldGlass","1256567890987654545","15/02/2020","Y","CarSheild001212121","ORG",123.45);
		Content c5=new Content(002,"FrontShieldGlass","1234567890987654545","13/02/2020","Y","CarSheild001212121","BLUE",123.45);
		Content c6=new Content(006,"FrontShieldGlass","1234578890987654545","17/02/2020","Y","CarSheild001212121","RED",123.45);
		Content c7=new Content(007,"FrontShieldGlass","1234567890987654545","18/02/2020","Y","CarSheild001212121","RED",123.45);
	    Content c8=new Content(001,"FrontShieldGlass","1234545890987654545","12/02/2020","Y","CarSheild001212121","RED",123.45);
   	    Content c9=new Content(001,"FrontShieldGlass","1234545890987654545","12/02/2020","Y","CarSheild001212121","RED",123.45);
	    Content c10=new Content(006,"FrontShieldGlass","1234578890987654545","17/02/2020","Y","CarSheild001212121","RED",123.45);	
		
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
		//System.out.println("hello "+li.get(3));
		Content c=new Content(Id, Category, SKU, DateofManufacturer, ISFragile, ModelNumber, Color, CostStep);
		 
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
