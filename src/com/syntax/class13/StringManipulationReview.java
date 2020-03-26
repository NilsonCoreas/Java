package com.syntax.class13;

public class StringManipulationReview {

	public static void main(String[] args) {
		String str= "Hello";
		System.out.println(str.length()); //output is 5
		System.out.println(str.toUpperCase()); //out put is HELLO
		
		//str has not changed
		System.out.println(str); //out is Hello
		
		System.out.println(str.toLowerCase()); //output it hello
		
		System.out.println(str.equals("Hello!")); //false since boolean is not equals, so not true
		System.out.println(str.equalsIgnoreCase("hello")); //true is I used ignore case
		
		boolean starts= str.startsWith("he");
		System.out.println("str.startsWith(he)--> "+starts); //output is false
		System.out.println(str.endsWith("lo")); //output is true
		
		str.toLowerCase().startsWith("he"); //method chaining, it be true
		System.out.println(starts);
		
		char fifthCharacter= str.charAt(4);
		System.out.println(fifthCharacter); //output is o since it is the 5th character in Hello
		String reverse = "";
		char[] charArray= str.toCharArray();
		for (int i = charArray.length; i<=0; i++) {
			System.out.println(charArray[i]); //H e l l o  is printted vertical , can use int i=charArray.length-1; i>=0; i-- to make is reverse
			reverse +=charArray[i];
		}
		System.out.println("reverse is --> " + reverse); //output is reverse is olleh
		
		int index = str.indexOf("llo");
		System.out.println(index); //output is 2
		
		String example = "Something inside here";
		int index2 = example.indexOf("e");
		System.out.println(index2); //output is 3, third one in the String example
		
		

	}

}
