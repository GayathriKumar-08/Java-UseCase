package com.src.java.thread.filehandler.filehandler;

import java.util.List;

public class Filethread implements Runnable {
	
	private List<Textfiles> payload;
	
	public Filethread(List<Textfiles> payload)
	{
		this.payload=payload;
	}

	@Override
	public void run() {
		Fileprocessor.getInstance().processpayload(payload);
	}

}
