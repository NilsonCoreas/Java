package com.syntax.class14;

public class Garage {

	public static void main(String[] args) {
		// build individual objects
		//must match looks from class Car
		Car car1=new Car();
		car1.make="Lambo";
		car1.model="Gallardo";
		car1.year=2020;
		car1.color="Blue";
		
		System.out.println(car1.make);
		
		Car car2=new Car();
		car2.make="BMW";
		car2.model="M5";
		car2.year=2019;
		car2.color="Black";
		
		Car car3=new Car();
		car3.make="Honda";
		car3.speed=160; //was able to add it since i added int speed to Class Car
		
		System.out.println(car2.make); //prints BMW
		System.out.println(car1.make); //prints Lambo
		
		//accessing behavior/methods of Car with Car1(Lambo)
		car1.drive();
		car1.accelerate();
		car1.makeNoise();
		car1.stop();
		
		//accesing behavior/method of Car with Car2(BMW)
		car2.drive();
		car2.accelerate();
		car2.makeNoise();
		car2.stop();
		
		
		System.out.println("I drive " +car2.color+" "+car2.make); //prints i drive black bmw
		
		//new Bike(); cannot create an object if we don't have a class

	}

}
