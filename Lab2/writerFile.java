package com.src.java.lab2exercise;

import java.io.FileWriter;

public class writerFile
{
	public static void main(String args[])
	{
		try
		{
			FileWriter fw=new FileWriter("filename.txt");
			fw.write("hello this is java program");
			fw.close();
		      System.out.println("Successfully wrote to the file.");
			
		}catch(Exception e)
		{
			System.out.println("Error "+e);
		}
		 
	}

}
