package com.syntax.class13;

public class HWQuestion1 {

	public static void main(String[] args) {
		// HOMEWORK
		// Part 1: Programming Questions
		// Write a program to swap 2 numbers without a temporary variable?
		//Swap 2 strings without a temporary variable?
		// Write a java program to check whether a given number is prime or not?
		// Write a Java Program to print first 10 numbers of Fibonacci series.
		// Find out how many alpha characters are present in a String? Find number of
		// words in string?
		// Write a java program to reverse String? Reverse a string word by word?
		// Write a Java Program to find whether a String is palindrome or not?
		// Write a java program to find the second largest number in the array? Maximum
		// and minimum number in the array?
		int a = 10;
		int b = 20;
		//swapping 2 numbers without a temp variable
		a=a+b; //30 
		b=a-b; //30-20=10 is assigned to b
		a=a-b;
		
		System.out.println("The value of a = " +a);
		System.out.println("The value of b = " +b);
		
		String str1="Syntax"; //was Day, can change these becuase we use str.length so its okay to change it lol
		String str2="Technologies"; //was Night
		
		str1=str1+str2; //DayNight is the total in this line, length of this is 8 right now
		str2=str1.substring(0, str1.length()-str2.length()); //Day begins at 0 and ends with 3 because the amount of letters in it
		//line 32 we changed to str1.length instead of counting the amount of letter then subtracted str2.length
		str1=str1.substring(str2.length()); //Night //start at 3 because it will cut the first letter of the word we are trying to get
		//line 34, changed from 3 to str2.length
		System.out.println("The value of str1 =" + str1);
		System.out.println("The value of str2 =" + str2);
		
		//another way
		String s1="Hello";
		String s2="Bye";
		
		String shorterstr1= s1+s2;
		s2=shorterstr1.replace(s1, "");
		s1=shorterstr1.replace(s2, "");
		
		System.out.println("Value of s1 = "+ s1);
		System.out.println("Value of s2 = "+ s2);
	}

}
