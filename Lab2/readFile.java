package com.src.java.lab2exercise;

import java.io.File;
import java.util.Scanner;

public class readFile {
	 public static void main(String[] args) {
		    try {
		    	File fe=new File("filename.txt");
		    	Scanner myreader=new Scanner(fe);
		    	while(myreader.hasNext())
		    	{
		    		 String data = myreader.nextLine();
		    	        System.out.println(data);
		    	  }
		    	 myreader.close();		
		    }catch(Exception e)
		    {
		    	System.out.println("Error: "+e);
		    }
		    
}

}
