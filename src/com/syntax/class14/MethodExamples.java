package com.syntax.class14;

public class MethodExamples {

	//want to create a method that will be greeting a person
	
	void greet() {
		System.out.println("Hello Neo");
	}
	void greet1(String name) {
		System.out.println("Hello " + name);
	}
	public static void main(String[] args) {
		//how to I call method greet? --> 1st, create an Object of the class to where that method belongs
		
		//className  VariableName=new ClassNAme();
		MethodExamples object1=new MethodExamples();
		object1.greet1("Neo");
		object1.greet1("Nilson");
		object1.greet1("Nilz");
		object1.greet1("Niles");
	}
}
