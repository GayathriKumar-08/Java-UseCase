package com.src.java.thread.filehandler.filehandler;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;
import java.util.TreeMap;
import java.util.TreeSet;

public class Fileprocessor {

	private static Fileprocessor fileprocessor=null;
	
	private TreeMap<ContentFile,String> tmap=new TreeMap<ContentFile,String>(new SortClass());
	
	private TreeSet<String> unique = new TreeSet<String>();
	
	private Fileprocessor()
	{//none
	}
	public static Fileprocessor getInstance()
	{
		if(fileprocessor==null)
		{
	    	 fileprocessor=new Fileprocessor();
		}
		return fileprocessor;
	}
	
	public void processpayload(List<Textfiles> lstfiles) 
	{
		for(Textfiles tf:lstfiles)
		{
		    doTheWork(tf);
		}
	}
	public void doTheWork(Textfiles tf) 
	{
		//Reading the file
		System.out.println(tf.getFilename());
		File file=new File(tf.getLoc().concat(tf.getFilename()));
		
	 	BufferedReader br = null;
	 	try {
		br=new BufferedReader(new FileReader(file));
		String line;
		String[] contents;
		
		while((line=br.readLine())!=null)
		{
			//System.out.println(line);
			contents=line.split(",");
			
			 ValidationPage vp=new ValidationPage();
	    		vp.checkLength();
			
    	if(!contents[0].equalsIgnoreCase("id"))
    	{
		ContentFile cf=new ContentFile(contents[0],contents[1],contents[2],contents[3],contents[4],contents[5],contents[6],contents[7],contents[8]);
		 // synchronized(this)
		//  {
		     tmap.put(cf, cf.getId());
		 //  }
		}
		}
	 	}catch(FileNotFoundException e)
	 	{
	 		System.out.println("Error");
	 		e.printStackTrace();
	 	}catch(IOException e1)
	 	{
	 	  e1.printStackTrace();
	 	}finally {
	 	try {
			br.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	 	}
		
	}
	public TreeMap<ContentFile,String> getFinalResult(){
		return tmap;
	}
}
