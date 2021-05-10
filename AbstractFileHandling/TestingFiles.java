package com.rsrc.java.abstracthandling;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileDescriptor;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.LineNumberReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;

public class TestingFiles {

	public void getDetails(ArrayList<Sample> list)
	{
		System.out.println("displaying the values from arraylist!!!");
		for(int i=0;i<list.size();i++)
		{
			System.out.println(list);
		}
	}
	//---------------------------------------------------------------------------------------------------
	public void convertToTxtFile(ArrayList<Sample> list) throws IOException {
		System.out.println("sample file is created");

		try {
			  PrintWriter writer = new PrintWriter("D:\\java\\filehandling\\sample.txt");
			    for (Sample line : list) {
			        writer.println(line);
			    }
			    writer.close();
				
			} catch(Exception ex) {
			    ex.printStackTrace();
			}
	}
	//--------------------------------------------------------------------------------------------------
	public void readFile(ArrayList<Sample> list) {
		System.out.println("sample file is read!!!!");
		
		BufferedReader br = null;
	       try{	
	           br = new BufferedReader(new FileReader("D:\\java\\filehandling\\sample.txt"));		

		   String contentLine = br.readLine();
		   while (contentLine != null) {
		      System.out.println(contentLine);
		      contentLine = br.readLine();
		   }
	       }
	       catch (IOException ioe) 
	       {
		   ioe.printStackTrace();
	       } 
	       finally 
	       {
	    	   try {
	    		      if (br != null)
	    			 br.close();
	    	   } 
	    	   catch (IOException ioe) 
	               {
	    		System.out.println("Error in closing the BufferedReader");
	               }
		   }
	    
	}
	//-------------------------------------------------------------------------------------------------------
	
	public void countLength(ArrayList<Sample> list) {
		File file=new File("D:\\java\\filehandling\\sample.txt");
		if(file.exists())
		{
		try
		{
			BufferedReader br = new BufferedReader(new FileReader(file));	
			LineNumberReader lr=new LineNumberReader(br);
			int linenocount=0;
			try
			{
				while(lr.readLine()!=null)
				{
					linenocount++;
				}
				System.out.println("Total number of line in this file is "+linenocount);
			}catch(IOException e)
			{
				e.printStackTrace();
			}
			}catch(FileNotFoundException e)
		     {
				e.printStackTrace();
			}
		}
		
	}
	///----------------------------------------------------------------------------------------------
	
	public void validateFile(ArrayList<Sample> list) throws IOException {
		FileInputStream fis = null;
        FileDescriptor fd = null;
        boolean bool = false;   
        
        try {
           fis = new FileInputStream("D:\\java\\filehandling\\sample.txt");
           
           fd = fis.getFD();
          
           bool = fd.valid();
          
           System.out.print("is file descriptor valid?: "+bool);
           
        } catch(Exception e) {
           e.printStackTrace();
        } finally {
           if(fis!=null)
              fis.close();   
        }
		
	}
}
