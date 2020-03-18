package com.syntax.class06;

import java.util.Scanner;

public class HomeworkNestIfAndScanner {
	public static void main(String[] args) {
		
	

	Scanner scan;
    int num1;
    int num2;
    int num3;
    scan=new Scanner(System.in);
    System.out.println("Please enter 3 distinct numbers");
    num1=scan.nextInt();
    num2=scan.nextInt();
    num3=scan.nextInt();
    
   
    
    
    if (num1>num2 && num1>num3) {
      System.out.println("The largest number is " + num1);
    }else if (num2>num1 && num2>num3) {
    	System.out.println("The largest number is " + num2);
    }else if (num3>num1 && num3>num2) {
    	System.out.println("The largest number is " + num3);
    }else  {
    	System.out.println("Enter valid character");
    }

    
   System.out.println("-------NEXT ASSIGNMENT--------");
   
  
   
   
   
   
   
   
   
   
}

}