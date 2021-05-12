package com.rsrc.java.abstracthandling;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.LineNumberReader;
import java.util.ArrayList;

public class HeaderCostNotMatchingException extends Exception{
	 String date = null; 
	 String Oemmanufacturer = "";
	 String time="";
     int numberofRecords = 0;
	 String filesequence="";
	 int totalcost=0;
	public void errorMethod(ArrayList<Sample> list) {

		Sample s=new Sample(date,time,Oemmanufacturer,numberofRecords,filesequence,totalcost);
	
	if(s.getTotalcost()== 0 || s.getTotalcost()< 0)
	{
		try
		{
			throw new HeaderCostNotMatchingException();
		}catch(HeaderCostNotMatchingException e)
		{
			System.out.println("exception is catched");
			e.printStackTrace();
		}
	}
	}
	
	
}
