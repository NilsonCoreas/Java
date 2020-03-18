package com.syntax.class08;

public class LoopContinued {
	public static void main(String[] args) {
		// I want to celebrate my son's 20 birthdays except the 13th birthday
		//
		for(int age =1; age <= 20; age++) {
			//1st way without continue
		//	if (age !=13)
	//	System.out.println("Happy Birthday! You are " + age + " years old.");
		//}
		//2nd way using continue
		if (age==13) {
			continue;
		}
	}
}
}