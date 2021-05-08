package com.rsrc.java.abstracthandling;

import java.io.IOException;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Scanner;

public class NewContent {
	public int Id;
	public String Category;
	public String SKU;
	public String DateofManufacturer;
	public String ISFragile;
	public String ModelNumber;
	public String Color;
	public double CostStep;
	public NewContent(int id, String category, String sKU, String dateofManufacturer, String iSFragile,
			String modelNumber, String color, double costStep) {
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
	public int getId() {
		return Id;
	}
	public void setId(int id) {
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
	@Override
	public String toString() {
		return "NewContent [Id=" + Id + ", Category=" + Category + ", SKU=" + SKU + ", DateofManufacturer="
				+ DateofManufacturer + ", ISFragile=" + ISFragile + ", ModelNumber=" + ModelNumber + ", Color=" + Color
				+ ", CostStep=" + CostStep + "]";
	}
	public static void main (String args[]) throws IOException, InCorrectDateOfManufacturerException
	{
		try
	    {
		 int Id=0;
		 String Category="";
		 String SKU="";
		 String DateofManufacturer = null;
		 String ISFragile="";
		 String ModelNumber="";
		 String Color="";
		 double CostStep=0.0;
		
		ArrayList<NewContent> li=new ArrayList<NewContent>();
		
		NewContent n1=new NewContent(001,"FrontShieldGlass","1234545890987654545","00/02/2020","Y","CarSheild001212121","RED",123.45);
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
