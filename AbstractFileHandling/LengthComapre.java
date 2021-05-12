package com.rsrc.java.abstracthandling;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class LengthComapre{
	
	public void lenghtComapre() throws IOException {
		try
		{
			       BufferedReader reader1 = new BufferedReader(new FileReader("D:\\java\\filehandling\\content.txt"));
			       
				   BufferedReader reader2 = new BufferedReader(new FileReader("D:\\java\\filehandling\\sample.txt"));

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
                        
                       System.out.println("File1 has "+line1+" and File2 has "+line2+" at line "+lineNum);
                       
                       System.out.println("invalid records since there is not time mentions in content file");
                       
                   }
                    
                   reader1.close();
                    
                   reader2.close();
                   
	    	}catch(IOException e)
	   	{
			  System.out.println("Please try again later");
			  e.printStackTrace();
	 	}
	}

	public void lenghtComapre1() {
		try
		{
			       BufferedReader reader1 = new BufferedReader(new FileReader("D:\\java\\filehandling\\newcontent.txt"));
			       
				   BufferedReader reader2 = new BufferedReader(new FileReader("D:\\java\\filehandling\\sample.txt"));

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
                        
                       System.out.println("File1 has "+line1+" and File2 has "+line2+" at line "+lineNum);
                       
                       System.out.println("invalid records since there is not time mentions in content file");
                       
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
