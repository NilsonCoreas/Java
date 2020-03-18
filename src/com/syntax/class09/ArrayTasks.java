package com.syntax.class09;

public class ArrayTasks {

	public static void main(String[] args) {
		//Create an array of animals and store 6 elements into it. Using 2 different loops print all elements from the array.


//Create an array on integers and calculate the sum of all integer elements in an array.


//Create an array of countries. While retrieving all values from an array print capital for each country. (use 2 different loops).
		int[] numbers= {27, 43, 87, 322, 6, 32, 65, 85, 54, 7};
		int sum=0;
		
		for (int i:numbers) {
			sum +=1;
		}
		System.out.println("The sum of the numbers in this array is :"+sum);
		
		System.out.println("-'''Using another loop");
		int sum1=0;
		for(int i=0; i<numbers.length; i++) {
			sum1+=numbers[1];
		}
		System.out.println("The sum of the numbers in this array is :" +sum1);
		
		System.out.println("----------------");
		
		String [] countries ={"USA", "Poland", "Ukraine", "Turkey", "Spain"};
		for (String i:countries){
			if (i.equals("USA")){
				System.out.println("The capital of "+ i+ " is Washington DC");
			}else if (i.equals("Polang")){
				System.out.println("The capital of "+ i+ " is Warsaw");
			}else  if (i.equals("Ukraine")){
				System.out.println("The capital of "+ i+ " is Kiev");
			}else  if (i.equals("Turkey")){
				System.out.println("The capital of "+ i+ " is Ankara");
			}else if (i.equals("Spain")){
				System.out.println("The capital of "+ i+ " is Madrid");
			}
			System.out.println("--------2nd method----");
			for(int y=0; y<countries.length;y++){
				if (countries[y].equals("USA")){
					System.out.println("The capital of "+ countries[y]+ " is Washington DC");
				}else if (countries[y].equals("Poland")){
					System.out.println("The capital of "+ countries[y]+ " is Warsaw");
				}else  if (countries[y].equals("Ukraine")){
					System.out.println("The capital of "+ countries[y]+ " is Kiev");
				}else  if (countries[y].equals("Turkey")){
					System.out.println("The capital of "+ countries[y]+ " is Ankara");
				}else if (countries[y].equals("Spain")){
					System.out.println("The capital of "+ countries[y]+ " is Madrid");
				}
			}
		}
		System.out.println("----------Switch Case method");
		for (int y=0; y<countries.length; y++) {
			switch(countries[y]) {
			case "USA":
				System.out.println("The capital is Washington DC");
				break;
			case "Poland":
				System.out.println("The capital is Warsaw");
				break;
			case "Ukraine":
				System.out.println("The capital is Kiev"); 
				break;
			}
		}
	}

	
}


