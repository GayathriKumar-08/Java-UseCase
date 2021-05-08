package com.src.java.lab2exercise;

public class threadId extends Thread  {
	
	public static void main(String args[]) throws InterruptedException
	{
		threadId t1=new threadId();
		threadId t2=new threadId();
		
		t1.start();
		t2.start();
		t1.join();
	}
     public void run()
     {
    	System.out.println("current Thread Name: "+Thread.currentThread().getName());
    	 System.out.println("Current Thread Id:"+ Thread.currentThread().getId());
     }
}
