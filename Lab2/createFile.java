package com.src.java.lab2exercise;

import java.io.File;
import java.io.IOException;

public class createFile {
	
	public static void main(String args[]) throws IOException
	{
		try {
		
	
		File myfile=new File("filename.txt");
		if(myfile.createNewFile())
		{
			System.out.println("New File created"+myfile.getName());
			System.out.println("New File created"+myfile.getAbsolutePath());
		}
		else
		{
			System.out.println("file already exist!!!1");
		}
	}catch(Exception e)
		{
		System.out.println("Error"+e);
		}
	}

}
