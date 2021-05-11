package com.src.java.thread.filehandler.filehandler;

import java.util.Date;

public class Textfiles {

	private int id;
	private String filename;
	private String loc;
	private Date date;
	public Textfiles(int id, String filename, String loc,Date date) {
		super();
		this.id = id;
		this.filename = filename;
		this.loc = loc;
		this.date=date;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFilename() {
		return filename;
	}
	public void setFilename(String filename) {
		this.filename = filename;
	}
	public String getLoc() {
		return loc;
	}
	public void setLoc(String loc) {
		this.loc = loc;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	@Override
	public String toString() {
		return "Textfiles [id=" + id + ", filename=" + filename + ", loc=" + loc + ", date=" + date + "]";
	}

	
}
