package com.src.java.thread.filehandler.filehandler;

import java.util.ArrayList;

public class ContentFile {

	String id;
	String patientrefnum;
	String lipidprofile;
	String lcdlebel;
	String pcslevel;
	String opdlevel;
	String sgtlevel;
	String chlratio;
	String age;
	public ContentFile(String id, String patientrefnum, String lipidprofile, String lcdlebel, String pcslevel,
			String opdlevel, String sgtlevel, String chlratio, String age) {
		super();
		this.id = id;
		this.patientrefnum = patientrefnum;
		this.lipidprofile = lipidprofile;
		this.lcdlebel = lcdlebel;
		this.pcslevel = pcslevel;
		this.opdlevel = opdlevel;
		this.sgtlevel = sgtlevel;
		this.chlratio = chlratio;
		this.age = age;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPatientrefnum() {
		return patientrefnum;
	}
	public void setPatientrefnum(String patientrefnum) {
		this.patientrefnum = patientrefnum;
	}
	public String getLipidprofile() {
		return lipidprofile;
	}
	public void setLipidprofile(String lipidprofile) {
		this.lipidprofile = lipidprofile;
	}
	public String getLcdlebel() {
		return lcdlebel;
	}
	public void setLcdlebel(String lcdlebel) {
		this.lcdlebel = lcdlebel;
	}
	public String getPcslevel() {
		return pcslevel;
	}
	public void setPcslevel(String pcslevel) {
		this.pcslevel = pcslevel;
	}
	public String getOpdlevel() {
		return opdlevel;
	}
	public void setOpdlevel(String opdlevel) {
		this.opdlevel = opdlevel;
	}
	public String getSgtlevel() {
		return sgtlevel;
	}
	public void setSgtlevel(String sgtlevel) {
		this.sgtlevel = sgtlevel;
	}
	public String getChlratio() {
		return chlratio;
	}
	public void setChlratio(String chlratio) {
		this.chlratio = chlratio;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "ContentFile [id=" + id + ", patientrefnum=" + patientrefnum + ", lipidprofile=" + lipidprofile
				+ ", lcdlebel=" + lcdlebel + ", pcslevel=" + pcslevel + ", opdlevel=" + opdlevel + ", sgtlevel="
				+ sgtlevel + ", chlratio=" + chlratio + ", age=" + age + "]";
	}
	public static void main(String args[])
	{
		ArrayList<ContentFile> alist=new ArrayList<ContentFile>();
		ContentFile cf1=new ContentFile("003","UKSUSEX002116243434334","4.56","1.56","5.56","9.56","2.6","1.67","75");
		ContentFile cf2=new ContentFile("006","UKSUSEX002216243434334","5.56","2.56","5.56","9.56","2.6","2.67","65");
		ContentFile cf3=new ContentFile("001","UKSUSEX002316243434334","6.56","3.56","5.56","9.56","2.6","4.67","35");
		ContentFile cf4=new ContentFile("008","UKSUSEX002416243434334","7.56","4.56","5.56","9.56","2.6","5.6","45");
		ContentFile cf5=new ContentFile("005","UKSUSEX002516243434334","8.56","5.56","5.56","9.56","2.6","6.67","55");
		ContentFile cf6=new ContentFile("002","UKSUSEX002616243434334","9.56","6.56","5.56","9.56","2.6","7.67","65");
		ContentFile cf7=new ContentFile("009","UKSUSEX002716243434334","4.66","7.56","5.56","9.56","2.6","8.67","15");
		ContentFile cf8=new ContentFile("004","UKSUSEX002816243434334","4.76","8.56","5.56","9.56","2.6","9.67","05");
		ContentFile cf9=new ContentFile("007","UKSUSEX002916243434334","4.86","9.56","5.56","9.56","2.6","5.88","25");
		ContentFile cf10=new ContentFile("010","UKSUSEX003916243434334","4.96","3.96","5.56","9.56","2.6","1.97","95");
		alist.add(cf1);
		alist.add(cf2);
		alist.add(cf3);
		alist.add(cf4);
		alist.add(cf5);
		alist.add(cf6);
		alist.add(cf7);
		alist.add(cf8);
		alist.add(cf9);
		alist.add(cf10);
		System.out.println(alist);
		
		
		headerMethod hm=new headerMethod();
		hm.viewDetails1(alist);
		hm.convertToCSV1(alist);
	}
}
