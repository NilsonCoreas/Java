package com.syntax.class09;

public class RetrieveElements {

	public static void main(String[] args) {
		char[] grades= {'A','B','C','D','E','F'};
		//getting all elements
		
		for(int i=0; i<grades.length; i++) {
			System.out.println(grades[i]+" ");
		}
		System.out.println("-----printing using advanced for loop-----");
		//printing using advanced for loop
		for(char grade:grades) {
			System.out.println(grade+" ");
		}
		//create an array of fruits and retrieve all elements
		String[] fruit= {"Banana", "Kiwi", "Apple", "Mango"};
		//if fruit is apple--> that is your favorite fruit
		//advanced for loop, enhanced for loop, for each loop
		
	  for(String fruit:fruits) { //anything after string
		  if(fruit.equals("Apple"))
			System.out.println(fruit+ " is your favorite food");
		}else {
			System.out.println(fruit);
		}
		System.out.println("--------------");
		//regular for loop
		//fruits.length=number of elements
		for(int i=0; i<fruits.length; i++) {
			System.out.println(fruits[i]);
		}
		

	}

}
