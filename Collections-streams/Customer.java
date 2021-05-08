package com.src.java.collections.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Customer extends BaseModel{
	int id;
	String custname;
	String address;
	String basectry;
	String pno;
	boolean is4g;
	int billamt;
	int pid;
	 String description;
	 int vasid;
	 String vas;
	 boolean isActive;
	 
	public Customer(int id, String custname, String address, String basectry, String pno, boolean is4g,
			int billamt, int pid, String description, int vasid, String vas, boolean isActive) {
		super();
		this.id = id;
		this.custname = custname;
		this.address = address;
		this.basectry = basectry;
		this.pno = pno;
		this.is4g = is4g;
		this.billamt = billamt;
		this.pid = pid;
		this.description = description;
		this.vasid = vasid;
		this.vas = vas;
		this.isActive = isActive;
	}
	public static void main(String args[])
	 {
		//1
		 Customer c1=new Customer(108,"gayathri","perambur","India","984021356",true,399,811,"prepaid",118,"VAS:games",true);
		 //2
		 Customer c2=new Customer(102,"vv","oosur","India","615894361",true,355,185,"postpaid",0,"VAS:Disabled",false);
		 //3
		 Customer c3=new Customer(107,"arya","chetpet","India","981894231",true,199,196,"prepaid",681,"VAS:callertune",true);
		 //4
		 Customer c4=new Customer(100,"grace","tanzania11","Tanzania","569423611",false,366,581,"postpaid",0,"VAS:Disabled",false);
		 //5
		 Customer c5=new Customer(101,"daisy","annanagar","India","99425863",true,355,185,"postpaid",0,"VAS:Disabled",false);
		 //6
		 Customer c6=new Customer(112,"abc","Nigeria12","Nigeria","565494361",true,355,115,"prepaid",511,"VAS:sports",true);
		 //7
		 Customer c7=new Customer(120,"bcd","SouthAfrica12","SouthAfrica","616989461",true,299,982,"prepaid",289,"VAS:games",true);
		 //8
		 Customer c8=new Customer(103,"liya","SouthAfrica66","SouthAfrica","998866554",true,355,268,"prepaid",693,"VAS:callertune",true);
		 //9
		 Customer c9=new Customer(121,"hello","Rwanda123","Rwanda","669582361",true,199,321,"prepaid",231,"VAS:sports",true);
		 //10
		 Customer c10=new Customer(104,"xyz","japan123","Japan","9852368",true,299,928,"prepaid",298,"VAS:callertune",true);
		 //11
		 Customer c11=new Customer(111,"mrs","america114","America","69758515",true,355,111,"postpaid",0,"VAS:Disabled",false);
		 //12
		 Customer c12=new Customer(122,"mary","uganda001","Uganda","615954261",true,345,545,"postpaid",0,"VAS:Disabled",false);
		 
		
		 ArrayList<Customer> li=new ArrayList<Customer>();
		 li.add(c1);
		 li.add(c2);
		 li.add(c3);
		 li.add(c4);
		 li.add(c5);
		 li.add(c6);
		 li.add(c7);
		 li.add(c8);
		 li.add(c9);
		 li.add(c10);
		 li.add(c11);
		 li.add(c12);
		
			 System.out.println(li);
			 Scanner sc=new Scanner(System.in);
			 CustomerBaseClass cb=new CustomerBaseClass();
			
			 System.out.println("Enter the number to invoke methods:");
	            int num = sc.nextInt();
	            switch (num) {
	                case 1:
	                	 cb.limitedRecord(li);
	                    break;
	                case 2:
	                	 cb.addDetails(li);
	                    break;
	                case 3:
	                	 cb.searchCtryDesc(li);
	                    break;
	                case 4:
	                	 cb.searchCtryDesc2(li);
	                    break;
	                case 5:
	                	 cb.fectchingDetails(li);
	                    break;
	                case 6:
	                	 cb.fectchingDetails2(li);
	                    break;
	                case 7:
	                	 cb.sortDetails(li);
	                    break;
	                case 8:
	                	cb.matchingRecords(li);
	                    break;
	                case 9:
	                	cb.printRecords(li);
	                    break;
	                    
	                case 10:
	                	 cb.sortDetails1(li);
	                    System.exit(0);
	                default:
	                    System.out.println("Input no corresponding operation, please re-enter");
	            }
		 
	 }
public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCustname() {
		return custname;
	}
	public void setCustname(String custname) {
		this.custname = custname;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getBasectry() {
		return basectry;
	}
	public void setBasectry(String basectry) {
		this.basectry = basectry;
	}
	public String getPno() {
		return pno;
	}
	public void setPno(String pno) {
		this.pno = pno;
	}
	public boolean isIs4g() {
		return is4g;
	}
	public void setIs4g(boolean is4g) {
		this.is4g = is4g;
	}
	public int getBillamt() {
		return billamt;
	}
	public void setBillamt(int billamt) {
		this.billamt = billamt;
	}
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public int getVasid() {
		return vasid;
	}
	public void setVasid(int vasid) {
		this.vasid = vasid;
	}
	public String getVas() {
		return vas;
	}
	public void setVas(String vas) {
		this.vas = vas;
	}
	public boolean isActive() {
		return isActive;
	}
	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}
@Override
public String toString() {
	return "Customer [id=" + id + ", custname=" + custname + ", address=" + address + ", basectry=" + basectry
			+ ", pno=" + pno + ", is4g=" + is4g + ", billamt=" + billamt + ", pid=" + pid + ", description="
			+ description + ", vasid=" + vasid + ", vas=" + vas + ", isActive=" + isActive + "]";
}
}
