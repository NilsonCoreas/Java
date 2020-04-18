package com.syntax.class16;

import com.syntax.class17.Main;

public class Main01 {
	String countryName;
	String capital;
	long population;

	void display() {

		System.out.println("The capital of "+countryName+" is "+capital+ " and population is "+population);
	}
	
	
	public static void main(String[] args) {
		Main01 main = new Main01();
		
		main.countryName="USA";
		main.capital="Washington DC";
		main.population=330000000;
		
		main.display();
		
		Main01 main1=new Main01();
		main1.countryName="Kazakhstan";
		main1.capital="Astana";
		main1.population=18500000;
		
		main1.display();
		
	}

}
//The capital of USA is Washington DC and population is 330000000
//The capital of Kazakhstan is Astana and population is 18500000
