package com.review09;

public class Phone {

	String serialNumber;
	String brand;
	double price;
	
	public Phone(String serialNumber, String brand) {
		this.serialNumber=serialNumber;
		this.brand=brand;
		
	}
	
	public void displayInfo() {
		System.out.println("This is a "+ brand +" phone with serial number "+ serialNumber);
		System.out.println("It costs "+price);
	}
}
