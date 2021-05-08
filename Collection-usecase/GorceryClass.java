package com.src.java.collections;

public class GorceryClass implements Comparable<GorceryClass>{
	int groceryid;
	String groceryname; 
	String grocerytype;  
	String wholesellername;
	double groceryweight;
	String grocerycategory;
	String gexpdate;
	int costperpacket;
	String packetsize;


	public  GorceryClass(int groceryid,String groceryname,String grocerytype,String wholesellername,double groceryweight,String gexpdate,
			String grocerycategory,int costperpacket,String packetsize) 
	{
		this.groceryid=groceryid;
		this.groceryname=groceryname;
		this.grocerytype=grocerytype;
		this.wholesellername=wholesellername;
		this.groceryweight=groceryweight;
		this.gexpdate=gexpdate;
		this.grocerycategory=grocerycategory;
		this.costperpacket=costperpacket;
		this.packetsize=packetsize;	
	}

	  public int compareTo( GorceryClass gc) {
	        
	        if(this.groceryid > gc.groceryid)
	            return 1;
	        else if(this.groceryid < gc.groceryid)
	            return -1;
	        else
	            return 0;
	        
	    }
	@Override
	public String toString() {
		return "GorceryClass [groceryid=" + groceryid + ", groceryname=" + groceryname + ", grocerytype=" + grocerytype
				+ ", wholesellername=" + wholesellername + ", groceryweight=" + groceryweight + ", grocerycategory="
				+ grocerycategory + ", gexpdate=" + gexpdate + ", costperpacket=" + costperpacket + ", packetsize="
				+ packetsize + "]";
	}

	


}
