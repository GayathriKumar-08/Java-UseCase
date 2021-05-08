package com.src.java.collections.generics;

public class GroceryClassGenerics <T> extends BaseClass{

	int groceryid;
	String groceryname; 
	String grocerytype;  
	String wholesellername;
	double groceryweight;
	String grocerycategory;
	String gexpdate;
	int costperpacket;
	String packetsize;
	
	public GroceryClassGenerics(int groceryid,String groceryname,String grocerytype,String wholesellername,double groceryweight,String gexpdate,
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

	public int getGroceryid() {
		return groceryid;
	}

	public void setGroceryid(int groceryid) {
		this.groceryid = groceryid;
	}

	public String getGroceryname() {
		return groceryname;
	}

	public void setGroceryname(String groceryname) {
		this.groceryname = groceryname;
	}

	public String getGrocerytype() {
		return grocerytype;
	}

	public void setGrocerytype(String grocerytype) {
		this.grocerytype = grocerytype;
	}

	public String getWholesellername() {
		return wholesellername;
	}

	public void setWholesellername(String wholesellername) {
		this.wholesellername = wholesellername;
	}

	public double getGroceryweight() {
		return groceryweight;
	}

	public void setGroceryweight(double groceryweight) {
		this.groceryweight = groceryweight;
	}

	public String getGrocerycategory() {
		return grocerycategory;
	}

	public void setGrocerycategory(String grocerycategory) {
		this.grocerycategory = grocerycategory;
	}

	public String getGexpdate() {
		return gexpdate;
	}

	public void setGexpdate(String gexpdate) {
		this.gexpdate = gexpdate;
	}

	public int getCostperpacket() {
		return costperpacket;
	}

	public void setCostperpacket(int costperpacket) {
		this.costperpacket = costperpacket;
	}

	public String getPacketsize() {
		return packetsize;
	}

	public void setPacketsize(String packetsize) {
		this.packetsize = packetsize;
	}

	@Override
	public String toString() {
		return "GroceryClassGenerics [groceryid=" + groceryid + ", groceryname=" + groceryname + ", grocerytype="
				+ grocerytype + ", wholesellername=" + wholesellername + ", groceryweight=" + groceryweight
				+ ", grocerycategory=" + grocerycategory + ", gexpdate=" + gexpdate + ", costperpacket=" + costperpacket
				+ ", packetsize=" + packetsize + "]";
	}


}
