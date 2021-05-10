package com.rsrc.java.abstracthandling;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.LineNumberReader;
import java.util.ArrayList;

public class HeaderCostNotMatchingException extends Exception{

	public void errorMethod(ArrayList<Sample> list) {

		Sample s=new Sample("12/05/2020","23:45:34","SuperToughGlass",50,"00112345",0);
	
		int totalCost = 0;
	if(s.getTotalcost()== 0 || s.getTotalcost()< 0)
	{
		try
		{
			throw new HeaderCostNotMatchingException();
		}catch(HeaderCostNotMatchingException e)
		{
			System.out.println("exception is catched");
			e.printStackTrace();
		}
	}
	}
	
	
}
