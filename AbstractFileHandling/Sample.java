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
	public String oemmanufacturer;
    public int numberofRecords;
	
	public String filesequence;
	public int totalcost;
	

	public Sample(String date, String time, String oemmanufacturer, int numberofRecords, String filesequence,
			int totalcost) {
		super();
		this.date = date;
		this.time = time;
		this.oemmanufacturer = oemmanufacturer;
		this.numberofRecords = numberofRecords;
		this.filesequence = filesequence;
		this.totalcost = totalcost;
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




	public String getOemmanufacturer() {
		return oemmanufacturer;
	}




	public void setOemmanufacturer(String oemmanufacturer) {
		this.oemmanufacturer = oemmanufacturer;
	}




	public int getNumberofRecords() {
		return numberofRecords;
	}




	public void setNumberofRecords(int numberofRecords) {
		this.numberofRecords = numberofRecords;
	}




	public String getFilesequence() {
		return filesequence;
	}




	public void setFilesequence(String filesequence) {
		this.filesequence = filesequence;
	}




	public int getTotalcost() {
		return totalcost;
	}




	public void setTotalcost(int totalcost) {
		this.totalcost = totalcost;
	}




	@Override
	public String toString() {
		return "Sample [date=" + date + ", time=" + time + ", oemmanufacturer=" + oemmanufacturer + ", numberofRecords="
				+ numberofRecords + ", filesequence=" + filesequence + ", totalcost=" + totalcost + "]";
	}




	public static void main(String args[]) throws IOException
	{
		 String date = null; 
		 String Oemmanufacturer = "";
		 String time="";
	     int numberofRecords = 0;
		 String filesequence="";
		 int totalcost=0;
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
		 
	
	
	


