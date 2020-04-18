package com.syntax.class16;

public class Main {
	int year;
	String schoolName;
	int batchNumber;

	public static void main(String[] args) {
		Main obj = new Main();
		obj.year = 2020;
		obj.schoolName = "Syntax";
		obj.batchNumber = 6;

		System.out.println(
				"I am a student of batch " + batchNumber + " studying at " + schoolName + " in the year of " + year);
	}

}
