package com.src.java.collections.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class CustomerBaseClass {

	public void addDetails(ArrayList<Customer> li) {
			
				System.out.println(li);
			
	}
	public void limitedRecord(ArrayList<Customer> li) {
		System.out.println("-----------------------------------------------------------");
		System.out.println("Fetching 4 records of India");

				li.stream().filter(cust -> cust.basectry.equals("India")).limit(4).forEach(System.out::println);
	}

	public void searchCtryDesc(ArrayList<Customer> li) {
		System.out.println("-----------------------------------------------------------");
		System.out.println("fetching records for Tanzania and postpaid");
	
		li.stream().filter(cust -> cust.basectry.equals("Tanzania") && cust.description.equals("postpaid")
				&& cust.isActive == false).map(customer -> customer).forEach(System.out::println);
	}

	public void searchCtryDesc2(ArrayList<Customer> li) {
		System.out.println("-----------------------------------------------------------");
		System.out.println("fetching records for SouthAfrica &Rwanda and prepaid");
		
		li.stream().filter(customer -> customer.basectry.equals("SouthAfrica")||customer.basectry.equals("Rwanda")&& customer.description.equals("prepaid")
				&& customer.isActive==true).map(customer -> customer).forEach(System.out::println);
	}

	public void fectchingDetails(ArrayList<Customer> li) {
		System.out.println("-----------------------------------------------------------");
		System.out.println("fetching records of numbers starting with 61");
	    li.stream().filter((customer) -> customer.pno.startsWith("61")).forEach(System.out::println);	
	}

	public void fectchingDetails2(ArrayList<Customer> li) {
		System.out.println("-----------------------------------------------------------");
		System.out.println("fetching records of numbers starting with 61,base country is Uganda and 4g is true");
		
		li.stream().filter((customer) -> customer.pno.startsWith("61")&& customer.basectry.equals("Uganda")
				&&customer.is4g==true).forEach(System.out::println);	
	}

	public void sortDetails(ArrayList<Customer> li) {
		
		System.out.println("-----------------------------------------------------------");
		System.out.println("Sorted based on customer name and phone number");
		
		Comparator<Customer> compareByName = Comparator
                .comparing(Customer::getCustname)
                .thenComparing(Customer::getPno);

    	List<Customer> list=li.stream().sorted(compareByName).collect(Collectors.toList());
  	    list.forEach(System.out::println);
	}
	public void printRecords(ArrayList<Customer> li) {
		System.out.println("-----------------------------------------");
		System.out.println("Fetching records in one line");
		li.stream().map(customer->customer).forEach(System.out::println);
		}

	public void matchingRecords(ArrayList<Customer> li) {
		System.out.println("-----------------------------------------------------------");
		System.out.println("finding whether the records are matched");
		   Predicate<Customer> p1 = s -> s.getId()==104 && s.getCustname().equals("xyz");

		   boolean b1=li.stream().anyMatch(p1);
	
	      if(b1==true)
	      {
	    	  System.out.println("records matches for the given id and name");
	   	  }
	      else
	      {
	    	  System.out.println("No records found");
	      }
	}
	public void sortDetails1(ArrayList<Customer> li) {
		
		System.out.println("-----------------------------------------------------------");
		System.out.println("Sorted based on customer name and phone number");
		  
		
		System.out.println("Names changed to uppercase");
			 String names = li.stream() .map(customer -> customer.custname.toUpperCase()) .collect(Collectors.joining(","));
			 System.out.println(names);
		   
			
			 Comparator<Customer> compareByName = Comparator
		                .comparing(Customer::getCustname)
		                .thenComparing(Customer::getPno);
			 
			 li.stream().filter((customer) -> customer.pno.startsWith("56")&& customer.basectry.equals("Nigeria"))
			 .sorted(compareByName).collect(Collectors.toList()).forEach(System.out::println);	
			
			}
	
	}

	
	
