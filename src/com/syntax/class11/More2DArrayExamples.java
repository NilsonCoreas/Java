package com.syntax.class11;

public class More2DArrayExamples {

	public static void main(String[] args) {
		// lets create 2D array in which we store professions
		
		String[][] professions= {
				{"QA Tester", "Devs", "Product Owners", "Scrum Master"}, //1st array
				{"Math teacher", "Science teacher", "ESL teacher"}, //2nd array
				{"Dentist", "Surgeon"} //3rd array
				};
		//get elements using advanced for loop
		for(String[] occupation:professions) {
			for(String title:occupation) {
				System.out.println(title+ " ");
			}
			System.out.println();
		}
		//Task 1. Create an array of cars : american, german, korean, italian. Then retrieve all values from that array using 2 different loops
//Task 2. Create an array of countries: north america countries, south america countries, europe countries, asian countries, african countries.
	//Then print all values from that array using 2 different loops and calculate how many total countries been stored.
		
	}
}