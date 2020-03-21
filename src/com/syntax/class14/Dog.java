package com.syntax.class14;

public class Dog {
	//has to be outside main method
	String breed;
	String color;
	String name;
	int age;
	
	void bark() {
		System.out.println(name+" can bark");
	}
	void eat() {
		System.out.println(name+" can eat");
	}
	void run() {
		System.out.println(name+" can run");
	}
	void jump() {
		System.out.println(name+" can jump");
	}
	
	
	public static void main(String[] args) {
		Dog dog1=new Dog();
		dog1.breed="Lab";
		dog1.color="Tan";
		dog1.name="Bella";
		dog1.age=1;
		
		dog1.bark();
		dog1.eat();
		dog1.run();
		dog1.jump();
		
		Dog dog2=new Dog();
		dog2.breed="Shetland Sheepdog";
		dog2.color="black";
		dog2.name="Rambo";
		dog2.age=10;
		
		dog2.bark();
		dog2.eat();
		dog2.run();
		dog2.jump();
		

	}

}
