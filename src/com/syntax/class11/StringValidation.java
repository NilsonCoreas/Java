package com.syntax.class11;

public class StringValidation {

	public static void main(String[] args) {
		
		String str1="Welcome Syntax Students";
		
		String str2="Welcome Syntax Students";
		
		//to compare two Strings
		System.out.println("---- equals() equalsIgnoreCase() FUNCTION----");
		
		System.out.println(str1.equals(str2)); //will be false
		System.out.println(str.equalsIgnoreCase(str2)); //will be true
		
		String expected="Home - Syntax Technologies";
		String actual="Home - Syntax Technologies";
		
		if(actual.equals(expected)) {
			System.out.println("Test Case pass. Titles are matched");
		}else {
			System.out.println("Test Case fails. Titles are not matched");
		}
		if(actual.trim().equals(expected)) {
			System.out.println("Test Case pass. Titles are matched");
		} else {
			System.out.println("Test Case fails. Titles are not matched");
		}
		String browser="Chrome";
		if(browser.equalsIgnoreCase("Chrome")) {
			System.out.println("Test executed on Chrome browser");
		}
		//OR 
		if(browser.toLowerCase().equals("Chrome")) {
			System.out.println("Test executed on Chrome browser");
		}
	}

}
