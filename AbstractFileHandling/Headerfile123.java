package com.rsrc.java.abstracthandling;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileDescriptor;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.LineNumberReader;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;
import java.util.stream.Collectors;



public class Headerfile123 {

	/*********************--------------------------------------------------------------------------*******************/
	public void getDetails1(ArrayList<Content> li) {
		System.out.println("displaying the values from arraylist!!!");
		for(int i=0;i<li.size();i++)
		{
			System.out.println(li);
		}
		
	}
	public void convertToTxtFile1(ArrayList<Content> li) {
		System.out.println("Content file is created");

		try {
			  PrintWriter writer = new PrintWriter("D:\\java\\filehandling\\content.txt");
			    for (Content line : li) {
			        writer.println(line);
			    }
			    writer.close();
				
			} catch(Exception ex) {
			    ex.printStackTrace();
			}
	}
	public void readFile1(ArrayList<Content> li) {
		System.out.println("Reading the file");
		
		BufferedReader br = null;
	       try{	
	           br = new BufferedReader(new FileReader("D:\\java\\filehandling\\content.txt"));		

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
	public void countLength1(ArrayList<Content> li) {
		System.out.println("Content file");
		File file=new File("D:\\java\\filehandling\\content.txt");
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
	public void validateFile1(ArrayList<Content> li) throws IOException {
		FileInputStream fis = null;
        FileDescriptor fd = null;
        boolean bool = false;   
        
        try {
           fis = new FileInputStream("D:\\java\\filehandling\\content.txt");
           
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
	public void checkForWords(ArrayList<Content> li) throws IOException {
		System.out.println("to count words");
		String line;  
        int count = 0;  
        File file=new File("D:\\java\\filehandling\\content.txt");
        FileReader f=new FileReader(file);
        BufferedReader br=new BufferedReader(f);
        while((line = br.readLine()) != null) {  
            //Splits each line into words  
            String words[] = line.split(" ");  
            //Counts each word  
            count = count + words.length;  
        }  
          
        System.out.println("Number of words present in given file: " + count);  
        br.close();  
	
	}
	
	public void checkSKU(ArrayList<Content> li) {
		NewContent n1=new NewContent("001","FrontShieldGlass","1234545890987654545","12/02/2020","Y","CarSheild001212121","RED",123.45);
	     
		if(n1.getSku()!=null)
	     {
	    	 System.out.println("SKU is "+n1.getSku());
	    	 if(n1.getSku().contains("1234545890987654545"))
	    	 {
	    		 try 
	 	        {
	 	            new BigInteger(n1.getSku());
	 	            System.out.println(n1.getSku() + " is a valid integer number");
	 	        } 
	 	        catch (NumberFormatException e) 
	 	        {
	 	            System.out.println(n1.getSku() + " is not a valid integer number");
	 	        }
	    	 }
	     }
	}
	public void checkLineFile(ArrayList<Content> li) throws IOException {
	
		PrintWriter pw = new PrintWriter("D:\\java\\filehandling\\validrecords.csv");
	
        
      
        BufferedReader br1 = new BufferedReader(new FileReader("D:\\java\\filehandling\\content.txt"));//input-file
         
        String line1 = br1.readLine();
         
        while(line1 != null)
        {
            boolean flag = false;
         
            BufferedReader br2 = new BufferedReader(new FileReader("D:\\java\\filehandling\\validrecords.csv"));//output-file
             
            String line2 = br2.readLine();
            
            while(line2 != null)
            {   
            	
                if(line1.equals(line2))
                {
                    flag = true; 
                    System.out.println("duplicate line is: "+line2);
                    break;
                }
                line2 = br2.readLine();
            }
             
            if(!flag){
                pw.println(line1);
                
                pw.flush();
            }
             
            line1 = br1.readLine();
             
        }
         
        br1.close();
        pw.close();
         
        System.out.println("File operation performed successfully");
    }

 }
		



	

