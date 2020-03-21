package com.syntax.class14;

public class Car {

		//Template for another class to create the new info about cars
		// define feature of the car
		String make;
		String model;
		int year;
		String color;
		int speed;
		
		//define behavior, usually behaviors are words
		//each behavior has to be separate such as below, but can have several codes within one behavior such as line 30
		void drive() { //method --> void
			
			System.out.println(make+" can drive");
		}
		void accelerate() {
			
			System.out.println(make+" can accelerate");
		}
		void makeNoise() {
			
			System.out.println(make+" can make make noise");
		}
		void stop() {
			
			System.out.println(make+" stops");
			System.out.println(make+" can stop using brakes");
		}
		
	}


