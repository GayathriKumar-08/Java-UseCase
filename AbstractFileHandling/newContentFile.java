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
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;

public class newContentFile {

	public void getDetails11(ArrayList<NewContent> li) {
		for(int i=0;i<li.size();i++)
		{
			System.out.println(li);
		}
		}

	public void convertToTxtFile11(ArrayList<NewContent> li) {
		System.out.println("sample file is created");

		try {
			  PrintWriter writer = new PrintWriter("D:\\java\\filehandling\\newcontent.txt");
			    for (NewContent line : li) {
			        writer.println(line);
			    }
			    writer.close();
				
			} catch(Exception ex) {
			    ex.printStackTrace();
			}
		
	}

	public void readFile11(ArrayList<NewContent> li) {
      System.out.println("Hello this is new content file");
		
		BufferedReader br = null;
	       try{	
	           br = new BufferedReader(new FileReader("D:\\java\\filehandling\\newcontent.txt"));		

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

	public void countLength11(ArrayList<NewContent> li) {
		System.out.println("Content file");
		File file=new File("D:\\java\\filehandling\\newcontent.txt");
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

	public void validateFile11(ArrayList<NewContent> li) throws IOException {
		FileInputStream fis = null;
        FileDescriptor fd = null;
        boolean bool = false;   
        
        try {
           fis = new FileInputStream("D:\\java\\filehandling\\newcontent.txt");
           
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

	public void checkForWords11(ArrayList<NewContent> li) throws IOException {
		System.out.println("to count words");
		
		String line;  
		
        int count = 0;  
        
        File file=new File("D:\\java\\filehandling\\newcontent.txt");
        
        FileReader f=new FileReader(file);
        
        BufferedReader br=new BufferedReader(f);
        
        while((line = br.readLine()) != null) {  
          
            String words[] = line.split(",");  
         
            count = count + words.length;  
        }  
          
        System.out.println("Number of words present in given file: " + count);  
        br.close();  
	
	}

	
		
}


