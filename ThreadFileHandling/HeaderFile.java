package com.src.java.thread.filehandler.filehandler;

import java.io.IOException;
import java.util.ArrayList;

public class HeaderFile {
	String datetime;
	String region;
	String clinictype;
	String numberofrecords;
	String filesequence;
	
	public HeaderFile(String datetime, String region, String clinictype, String numberofrecords, String filesequence) {
		super();
		this.datetime = datetime;
		this.region = region;
		this.clinictype = clinictype;
		this.numberofrecords = numberofrecords;
		this.filesequence = filesequence;
	}

	public String getDatetime() {
		return datetime;
	}

	public void setDatetime(String datetime) {
		this.datetime = datetime;
	}

	public String getRegion() {
		return region;
	}

	public void setRegion(String region) {
		this.region = region;
	}

	public String getClinictype() {
		return clinictype;
	}

	public void setClinictype(String clinictype) {
		this.clinictype = clinictype;
	}

	public String getNumberofrecords() {
		return numberofrecords;
	}

	public void setNumberofrecords(String numberofrecords) {
		this.numberofrecords = numberofrecords;
	}

	public String getFilesequence() {
		return filesequence;
	}

	public void setFilesequence(String filesequence) {
		this.filesequence = filesequence;
	}

	@Override
	public String toString() {
		return "HeaderFile [datetime=" + datetime + ", region=" + region + ", clinictype=" + clinictype
				+ ", numberofrecords=" + numberofrecords + ", filesequence=" + filesequence + "]";
	}
	
	public static void main(String args[]) throws IOException
	{
		String datetime="";
		String region="";
		String clinictype="";
		String numberofrecords="";
		String filesequence="";
		
		ArrayList<HeaderFile> li=new ArrayList<HeaderFile>();
		li.add(new HeaderFile("12/05/2020 23:45:34","UK","General","025","001"));
		//System.out.println(li);
		
		headerMethod hm=new headerMethod();
		hm.viewDetails(li);
		hm.convertToCSV(li);
		
		
		
	}
	
}
