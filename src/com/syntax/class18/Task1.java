package com.syntax.class18;

public class Task1 {
//Write a program that will have a constructor: one with parameters and second without any parameters. Create a separate Test class where you will execute both of the constructors.


//Write a java program of Class Students that takes students name and 3 subject grades. Inside your class also have a method to Calculate Average Grade. Test Student class for 5 different students with different marks. Your program should print an average mark of each students name.
//NOTE: please use different names for instance and local variables.
	String name;
	int grade1, grade2, grade3;

	Task1(String studentName, int studentGrade1, int studentGrade2, int studentGrade3) {
		name = studentName;
		grade1 = studentGrade1;
		grade2 = studentGrade2;
		grade3 = studentGrade3;
	}

	public int gradeAverage() {
		int total = grade1 + grade2 + grade3;
		int average = total / 3;
		return average;
	}

	public static void main(String[] args) {
		Task1 obj1 = new Task1("Ali", 80, 88, 90);
		System.out.println("Student " + obj1.name + " avarage grade is " + obj1.gradeAverage());

		Task1 obj2 = new Task1("Ahmet", 85, 78, 90);
		System.out.println("Student " + obj2.name + " avarage grade is " + obj2.gradeAverage());

		Task1 obj3 = new Task1("Abdullah", 90, 82, 95);
		System.out.println("Student " + obj3.name + " avarage grade is " + obj3.gradeAverage());
	}

}
