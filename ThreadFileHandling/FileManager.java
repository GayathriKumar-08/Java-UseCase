package com.src.java.thread.filehandler.filehandler;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class FileManager extends Baseclass{
	
	public final String file_folder="D:\\java\\csvfiles\\";
	public final int thread_file=1;
	

	public void doRun() throws InterruptedException, IOException
	{
		List<Textfiles> ltxtfiles=this.getFiles(file_folder);
		ltxtfiles.forEach(System.out::println);
		
		List<List<Textfiles>> lt=this.getPages(ltxtfiles, thread_file);
		lt.forEach(System.out::println);
		
		for(int i=0;i<lt.size();i++)
		{
			Filethread ft=new Filethread(lt.get(i));
			Thread t=new Thread(ft);
			t.setName("File Reader- "+i);
			t.start();
			t.join();
		}
		System.out.println(Fileprocessor.getInstance().getFinalResult());
		writeFinalResult(Fileprocessor.getInstance().getFinalResult());
		
		System.out.println("Csv file is created");
	}
	
	private void writeFinalResult(TreeMap<ContentFile,String> tmap) throws IOException
	{
		BufferedWriter bw;
		
		
       bw=new BufferedWriter(new FileWriter(file_folder.concat("content123"+System.currentTimeMillis()+".csv")));
       
		Set set=tmap.entrySet();
		Iterator it=set.iterator();
		
		while(it.hasNext())
		{
			Map.Entry me=(Entry) it.next();
			ContentFile cf=(ContentFile)me.getKey();
			bw.write(cf.getId()+","+cf.getPatientrefnum()+","+cf.getLipidprofile()+","+cf.getLcdlebel()+","+cf.getOpdlevel()+","+cf.getPcslevel()+","+
					cf.getSgtlevel()+","+cf.getChlratio()+","+cf.getAge()+"\n");
		}
		bw.close();
		
	}
	
	public static void main(String args[]) throws InterruptedException
	{
		try {
		new FileManager().doRun();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		
		
	}
}
