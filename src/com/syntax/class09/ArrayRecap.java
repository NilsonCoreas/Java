package com.syntax.class09;

public class ArrayRecap {

	public static void main(String[] args) {
		
		int[] grades=new int[4];
		grades[0]=90;
		grades[1]=67;
		grades[2]=89;
		grades[3]=78;
		
		//what is average grade
		int average=(grades[0]+grades[1]+grades[2]+grades[3])/4;
		System.out.println("Average grade is " +average);
		
		System.out.println("------------------------------");
		//array of cities
		String[] cities= {"Washington DC", "New York", "Paris", "Miami", "L.A", "Dallas", "Chantilly"};
		System.out.println("I live in " +cities[0]);
		
		int x=1;
		System.out.println(cities[x]);
		x+=3;
		System.out.println("I moved to "+cities[x]); //Output is L.A
		
		//how many elements stored inside an array?
		int arraySize=cities.length;
		System.out.println("Total elemtns "+arraySize);
		
		//how can we access last element from an array?
		System.out.println(cities[arraySize-1]);
		
		//access al elements from an array
		//cities[0]. cities[1], cities[2]
		for(int i=0; i<arraySize; i++) {
			System.out.println(cities[i]);
		}

	}

}
