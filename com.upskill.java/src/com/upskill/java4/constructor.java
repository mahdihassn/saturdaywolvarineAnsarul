package com.upskill.java4;

public class constructor {
	
	String admin;
	int adAge;
	
	public constructor(String name, int age){
		admin = name;
		adAge = age;
		
	}
	public static void main(String[] args) {
		
		constructor myObj = new constructor("Ansarul", 35); 
		
		System.out.println(myObj.admin);
		System.out.println(myObj.adAge);
		

	}

}
