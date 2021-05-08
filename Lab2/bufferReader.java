package com.src.java.lab2exercise;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class bufferReader {
	public static void main(String args[])
	{
		 BufferedReader objReader = null;
		  try {
		   String strCurrentLine;

		   objReader = new BufferedReader(new FileReader("filename.txt"));
		   
		   while ((strCurrentLine = objReader.readLine()) != null)
		   {
		    System.out.println(strCurrentLine);
		   }
		   
		  } catch (IOException e) 
		  {
		   e.printStackTrace();
		  } finally {

		   try {
		    if (objReader != null)
		     objReader.close();
		   } catch (IOException ex) {
		    ex.printStackTrace();
		   }
		  }
	}

}
