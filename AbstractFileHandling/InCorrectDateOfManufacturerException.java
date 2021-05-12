package com.rsrc.java.abstracthandling;

import java.util.ArrayList;

public class InCorrectDateOfManufacturerException extends Exception {
	 String id="";
	 String category="";
	 String sku="";
	 String dateofmanufacturer = null;
	 String isfragile="";
	 String modelnumber="";
	 String color="";
	 double costStep=0.0;
	

	public void checkValidDate(ArrayList<Content> li) {
		NewContent n1=new NewContent(id,category,sku,dateofmanufacturer,isfragile,modelnumber,color,costStep);
		if(n1.getDateofmanufacturer()!=null)
		{
			// System.out.println("Dateofmanufacturer: "+n1.getDateofManufacturer());
			 try {
			 if(n1.getDateofmanufacturer().contains("00/02/2020"))
			 {
				 throw new InCorrectDateOfManufacturerException();
		}
		}catch(InCorrectDateOfManufacturerException e)
			 {
			   System.out.println("Invalid date "+n1.getDateofmanufacturer()+" , please enter the correct date");
			   e.printStackTrace();
			 }
		}
	}
	}

