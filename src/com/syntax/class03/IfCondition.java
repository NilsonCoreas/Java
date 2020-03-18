package com.syntax.class03;

public class IfCondition {

	public static void main(String[] args) {
		// Declare a number and compare if number is larger than 100
		//if number is larger than 100-> my number is large
		System.out.println("Starting coding");
		
		int num=178;
		
		if(num>100) {
			System.out.println("My number is large");
		} //will only codition is true
      System.out.println("End of the program");
	
	System.out.println("---------------");
	
	int expectedHours=15;
	int actualHours=4;
	//if actual is more than expected --> you will love Java
	
if(actualHours>=expectedHours) {
	System.out.println("You will love Java"); 
}else //wont output since condition is not true
	{System.out.println("You will not like Java"); //otherwise (if false) -> go inside else block
	}
	//if condition if true, action happens and rest of code
//if condition is false, no action, then rest of code

   System.out.println("-----------");
   
   double budget=10000;
   double carPrice=12000;
   //using if we are doing verification and selective execution
   if(budget>carPrice) {
	   System.out.println("I Will buy this car today");
   }else {
	   System.out.println("I will not buy this car today, I will go learn Java");
   }
   
   System.out.println("I am code after if condition");
   
   System.out.println("------------");
   
   double num1=30000;
   double num2=20000;
   
   if(num1>num2) {
	   System.out.println("Double value " + num1 + " is larger than " + num2);
   }else {System.out.println("Double value " + num1 + " is not larger than " + num2);
   }
   
   
	}
	
       

}
