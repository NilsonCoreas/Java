package com.syntax.class17;

public class Main {
	String countryName;
	String capital;
	double population;

	void instanceVariables(String countryName, String capital, double population) {
		
		System.out.println(countryName);
	}

	public static void main() {
		Main obj = new Main();
		obj.countryName = "USA";
		obj.capital = "Washington DC";
		obj.population = 330000000;

		Main obj1 = new Main();
		obj1.countryName = "Kazakhstan";
		obj1.capital = "Astana";
		obj1.population = 18500000;
	}

}