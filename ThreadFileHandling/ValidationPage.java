package com.src.java.thread.filehandler.filehandler;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;


public class ValidationPage {

	public void checkLength()  throws IOException {
		 BufferedReader reader1=null;
		 BufferedReader reader2=null;
			try
			{
				        reader1 = new BufferedReader(new FileReader("D:\\java\\csvfiles\\content123.csv"));
				       
					    reader2 = new BufferedReader(new FileReader("D:\\java\\csvfiles\\header123.csv"));

	                   boolean areEqual = true;
	                   
	                   int lineNum = 1;
	                   
	                   String line1 = reader1.readLine();
	                   
	                   String line2 = reader2.readLine();
	                   
	                   while (line1 != null || line2 != null)
	                   {
	                           if(line1 == null || line2 == null)
	                           {
	                                   areEqual = false;
	                                   break;
	                           }
	                           else if(! line1.equalsIgnoreCase(line2))
	                           {
	                                   areEqual = false;
	                                   break;
	                           }

	                           line1 = reader1.readLine();
	                           line2 = reader2.readLine();
	                           lineNum++;
	                   }
	                   if(areEqual)
	                   {
	                       System.out.println("Two files have same content.");
	                   }
	                   else
	                   {
	                       System.out.println("Two files have different content. They differ at line "+lineNum);
	                        
	                       System.out.println("File1: "+line1+"  File2: "+line2+" at line "+lineNum);
	                       
	                       System.out.println("invalid records: Length of the files are different");
	                       
	                   }
	                    
	                   reader1.close();
	                    
	                   reader2.close();
	                   
		    	}catch(IOException e)
		   	{
				  System.out.println("Please try again later");
				  e.printStackTrace();
		 	}
		}
}

