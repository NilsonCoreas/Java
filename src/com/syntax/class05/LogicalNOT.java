package com.syntax.class05;

public class LogicalNOT {

	public static void main(String[] args) {
		//NOT(!) - reverse the codition
		boolean b=!true; //added ! to make it reverse which is false
		boolean val=!false; // added ! to make it true
		
		System.out.println(b);
		System.out.println(val);
		
		boolean isCold=true;
		if(!isCold) {
			System.out.println("Hello");
		}else {
			System.out.println("bye");
		}
		
		
		String day1="Tuesday";
	
		//if it is not Monday or Friday --> Find me at Syntax
		if(!day1.equals("Monday") && day1.equals("Friday")) { //will perform each operation separate and reverse at the same time 
			System.out.println("Find me at Syntax"); //False then reversed to True, False then reverse to True
		}
		if (!(day1.equals("Monday") && day1.equals("Friday"))) { //will perform whole operation inside () then reverse it
			System.out.println("Find me at Syntax");
		}
	}

}
