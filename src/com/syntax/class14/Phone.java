package com.syntax.class14;

import java.util.Scanner;

public class Phone {

	String brand;
	String model;
	String color;
	int year;
	
	void talk() {
		System.out.println(brand+" can talk");
	}
	void music() {
		System.out.println(brand+" can play music");
	}
	void call() {
		System.out.println(brand+" can make calls");
	}
	public static void main(String[] args) {
		Phone iphone = new Phone();
		iphone.brand = "Apple";
		iphone.model = "XS";
		iphone.color = "Space Grey";
		iphone.year = 2020;
		iphone.talk();
		iphone.music();
		iphone.call();

		Phone android = new Phone();
		android.brand = "Samsung";
		android.model = "S10+";
		android.color = "Blue";
		android.year = 2020;
		android.talk();
		android.music();
		android.call();


		Phone nokia = new Phone();
		nokia.brand="Nokia";
		nokia.model="Gray";
		nokia.color="Black";
		nokia.year=2020;
		nokia.talk();
		nokia.music();
		nokia.call();
		
		String str="Hello Friends";
		str=str.replace("Hello", "Welcome");
		
		System.out.println(str);
		
		Scanner scan=new Scanner(System.in);
		scan.nextLine();

	}

}
