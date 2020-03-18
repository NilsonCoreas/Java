package com.syntax.class11;

public class StringDemo {

	public static void main(String[] args) {
		String school="Syntax";
		String str=new String("Hello");
		String str1="This is a String 7676, &^&^";
		
		System.out.println("---LENGTH() FUNCTION----");
		//how many characters String has
	    System.out.println(school.length()); //the amount of characters in the word Syntax (line 6)
	    
	    int size=str.length();
	    System.out.println("String length is " + size);
	    
	    //convert String to lowercase or uppercase
	    System.out.println("----TO UPPER/LOWER CASE FUNCTION----");
	    System.out.println(school.toUpperCase());
	    System.out.println(str.toLowerCase());
	    System.out.println(str);
	    
	    System.out.println("----CONCAT FUNCTION----");
	    //concatinate 2 String
	    String newString=str+school;
	    System.out.println(newString);
	    
	    String day="Saturday";
	    String date="14";
	    
	    String newDate=day.concat(date);
	    System.out.println(newDate);
	    
	    char grade='A';
	    String str2="Student";
	    //below code will give CE, since concat() method is used to attach 1 String to another String
	    //str2.concat(grade);
	    
	    System.out.println("-----isEmpty FUNCTION----");
	    //tells true if there no characters inside the String
	    //tells false if any characters are inside the String
	    String str3="";
	    boolean empty=str3.isEmpty();
	    System.out.println(empty);
	    
	    System.out.println("----trim() FUNCTION----");
	    //removes empty space/white space at the beginning and end of the String
	    String str4="       Welcome to Syntax!     ";
	    str4=str4.trim();
	    System.out.println("String with no leading or trailing spaces: "+ str4);
	}

}
