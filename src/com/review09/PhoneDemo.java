package com.review09;

public class PhoneDemo {
	public static void main(String[] args) {
		
	Phone p1 = new Phone("2345678", "Apple");
	p1.price=1200;
	
	p1.displayInfo();
	System.out.println("------Changing serial number------");
	p1.serialNumber="bla bla bla";
	p1.displayInfo();
	
	}
}
