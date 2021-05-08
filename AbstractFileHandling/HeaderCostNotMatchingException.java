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
		int TotalCost = 0;
	if(TotalCost==0 || TotalCost<0)
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
