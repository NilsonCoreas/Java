package com.syntax.class09;

import java.lang.reflect.Array;

public class ArrayDemoReview {

	public static void main(String[] args) {
		//silly way, not preferred
		int a0=5;
		int a1=7;
		int a2=8;
		int a3=9;
		int a4=20;
		//System.out.println(a0);
		//System.out.println(a1);
		//System.out.println(a2);
		//System.out.println(a3);
		//System.out.println(a4);
		
		//1st professiona; way
		//declaring an array, all elements have the default value
		int[] numbers = new int[5];// do this first
		
		//initializing valuues for array elements
		//second step......numbers is the array
		numbers[4]=20;
		numbers[3]=9;
		numbers[2]=8;
		numbers[1]=7;
		numbers[0]=5;
		System.out.println(numbers[0]);
		System.out.println(numbers[1]);
		System.out.println(numbers[2]);
		System.out.println(numbers[3]);
		System.out.println(numbers[4]);
		
		//printing the element with index 2
		System.out.println("Print using index with variable");
		int i=2; //i is the index
		System.out.println(numbers[i]);
		i++;
		System.out.println(numbers[i]);
		int arrayLength=numbers.length;
		System.out.println("The length of the array is " + arrayLength);
		
		//a. method using for loop, this method can iterate from start point to end point
		System.out.println("Using for loop");
		for(int j=0; j<=4; j++) { //will be between 0-4 or if i use j<5 then it will still stop at numbers[4], can also put arrayLength
			System.out.println(numbers[j]);
		}
		System.out.println("Using for each/enhanced/advanced loop"); //doesn't go in reverse such as 10 to 1
		//b. method using for-each/advanced/enhanced for loop, this method iterates the whole array
		for(int num : numbers) { //num is the name of the variable, int is the variable
			System.out.println(num);
		}
		//2nd professional way of initializing array
		System.out.println("Second way using curly brackets");
		int[] numbers2 = {4, 6, 8, 9, 15}; //index is 0-4 since we start counting from 0, and length is 5 (5 elements)
		System.out.println("Length is "+numbers2.length);
		
		for(int j=0; j<numbers2.length; j+=2) { //can use j again becuase its local which means its inside the for loop, putting j+=2 will print out even index numbers ex 0,2,4
			System.out.println(numbers2[j]);
		}
		System.out.println("Enhanced For Loop");
		for()


	}

}
