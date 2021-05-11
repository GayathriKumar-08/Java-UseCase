package com.src.java.thread.filehandler.filehandler;

import java.io.PrintWriter;
import java.util.ArrayList;


public class headerMethod {
	public void viewDetails(ArrayList<HeaderFile> li) {
	for(int i=0;i<li.size();i++)
	{
		System.out.println(li);
	}
	}
	
	public void convertToCSV(ArrayList<HeaderFile> li) {
		System.out.println("Header csv file is created");

		try {
			  PrintWriter writer = new PrintWriter("D:\\java\\csvfiles\\header123.csv");
			    for (HeaderFile line : li) {
			        writer.println(line);
			    }
			    writer.close();
				
			} catch(Exception ex) {
			    ex.printStackTrace();
			}
		
	}

	public void viewDetails1(ArrayList<ContentFile> alist) {
		
		for(int i=0;i<alist.size();i++)
		{
			System.out.println(alist);
		}
	}

	public void convertToCSV1(ArrayList<ContentFile> alist) {
		System.out.println("Content csv file is created");

		try {
			  PrintWriter writer = new PrintWriter("D:\\java\\csvfiles\\content123.csv");
			    for (ContentFile line : alist) {
			        writer.println(line);
			    }
			    writer.close();
				
			} catch(Exception ex) {
			    ex.printStackTrace();
			}
		
	}



}
