package com.rsrc.java.abstracthandling;

import java.io.FileDescriptor;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;


public class Sample extends HeaderCostNotMatchingException {
	public String date; 
	public String time;
	public String OEMManufacturer;
    public int numberofRecords;
	
	public String FileSequence;
	public int TotalCost;
	
	public Sample(String date, String time, String oEMManufacturer, int numberofRecords, String fileSequence,
			int totalCost) {
		super();
		this.date = date;
		this.time = time;
		OEMManufacturer = oEMManufacturer;
		this.numberofRecords = numberofRecords;
		FileSequence = fileSequence;
		TotalCost = totalCost;
	}
	@Override
	public String toString() {
		return "Sample [date=" + date + ", time=" + time + ", OEMManufacturer=" + OEMManufacturer + ", numberofRecords="
				+ numberofRecords + ", FileSequence=" + FileSequence + ", TotalCost=" + TotalCost + "]";
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
	public String getOEMManufacturer() {
		return OEMManufacturer;
	}
	public void setOEMManufacturer(String oEMManufacturer) {
		OEMManufacturer = oEMManufacturer;
	}
	public int getNumberofRecords() {
		return numberofRecords;
	}
	public void setNumberofRecords(int numberofRecords) {
		this.numberofRecords = numberofRecords;
	}
	public String getFileSequence() {
		return FileSequence;
	}
	public void setFileSequence(String fileSequence) {
		FileSequence = fileSequence;
	}
	public int getTotalCost() {
		return TotalCost;
	}
	public void setTotalCost(int totalCost) {
		TotalCost = totalCost;
	}

	public static void main(String args[]) throws IOException
	{
		 String date = null; 
		 String OEMManufacturer = " ";
		 String time=" ";
	     int numberofRecords = 0;
		 String FileSequence="";
		 int TotalCost=0;
		ArrayList<Sample> list=new ArrayList<Sample>();
		
		list.add(new Sample("12/05/2020","23:45:34","SuperToughGlass",50,"00112345",0));
	
		
	     Scanner sc=new Scanner(System.in);
	     TestingFiles hf=new TestingFiles();
	     LengthComapre lc=new LengthComapre();
	     HeaderCostNotMatchingException throwerr=new HeaderCostNotMatchingException();
			
		System.out.println("Enter the number for looping");
		int n=sc.nextInt();
		for(int i=0;i<n;i++) {
		 System.out.println("Enter the number to invoke methods:");
            int num = sc.nextInt();
            switch (num) {
                case 1:
                	hf.getDetails(list);
                    break;
                case 2:
                	hf.convertToTxtFile(list);
                    break;
                case 3:
                	hf.readFile(list);
                    break;
                case 4:
                	  hf.countLength(list);
                    break;
                case 5:
                	   hf.validateFile(list);
                    break;
                case 6:
                	  lc.lenghtComapre();
                    break;
                case 7:
                	  lc.lenghtComapre1();
                    break;
                case 8:
                	throwerr.errorMethod(list);
                    break;
                default:
                    System.out.println("Input no corresponding operation, please re-enter");
            }
	     }
	}
	    
}
		 
	
	
	


