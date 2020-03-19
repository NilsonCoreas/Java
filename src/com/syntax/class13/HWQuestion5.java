package com.syntax.class13;

public class HWQuestion5 {

	public static void main(String[] args) {
		// Write a java program to reverse String? Reverse a string word by word?
		
		String given="I love Java";
		String reversed="";
		
		for(int i=given.length()-1; i>=0; i--) {
			
			reversed=reversed+given.charAt(i);
			
		}
		System.out.println("Reversed String = " +reversed); //output=Reversed String = avaJ evol I
		
		String[] array=given.split(" ");
		String reverseWords="";
		for(int i=array.length-1; i>=0; i--) {
			reverseWords=reverseWords+array[i]+ " "; //added " " to put space in the output between words
			
			
		}
		System.out.println("Reversed String word by word = "+ reverseWords);

	}

}
