package com.rsrc.java.abstracthandling;

import java.util.ArrayList;

public class InCorrectDateOfManufacturerException extends Exception {

	public void checkValidDate(ArrayList<Content> li) {
		NewContent n1=new NewContent(001,"FrontShieldGlass","1234545890987654545","00/02/2020","Y","CarSheild001212121","RED",123.45);
		if(n1.getDateofManufacturer()!=null)
		{
			// System.out.println("Dateofmanufacturer: "+n1.getDateofManufacturer());
			 try {
			 if(n1.getDateofManufacturer().contains("00/02/2020"))
			 {
				 throw new InCorrectDateOfManufacturerException();
		}
		}catch(InCorrectDateOfManufacturerException e)
			 {
			   System.out.println("Invalid date "+n1.getDateofManufacturer()+" , please enter the correct date");
			   e.printStackTrace();
			 }
		}
	}
	}

