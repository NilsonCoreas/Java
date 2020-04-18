package com.syntax.class19;

public class TestClass {
	public static void main(String[] args) {
		//access variables from own class
		Dog dog=new Dog();
		//access variables from parent class .ex Animals class
		dog.breed="Husky";
		dog.color="Grey";
		dog.fur="Too much";
		dog.size="Extra Large";
		
		//access method from own class
		dog.bark();
		//access methods from own class
		dog.beWild();
		dog.eat();
		dog.sleep();
		
		Animals animal=new Animals();
		//can access only features defined within its own class
		animal.color="Any";
		animal.size="Any";
		animal.fur="Any";
		//animal.breed cannot be found because its an attribute
		
		animal.sleep();
		animal.eat();
		animal.beWild();
	}
}
