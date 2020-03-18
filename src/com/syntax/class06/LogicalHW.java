package com.syntax.class06;

import java.util.Scanner;

public class LogicalHW {

	public static void main(String[] args) {
		/*Create a program that prompt user with question:  "Do you need a loan?"
If the result is true then prompt user with question: "What is your credit score?". Otherwise eligibility is "Unknown"
Based on the score define users eligibility:
if score is below  600 --> eligibility = "Not eligible"
if score is between 600 and 700 inclusive -->  eligibility = "Maybe eligible"
if score is between 701 and 800 inclusive -->  eligibility = "Eligible"
if score is higher than any other previous values --> eligibility = "Definitely eligible" .   

Output:  repl 35
"The eligibility is ____"
		
		 */
		  Scanner scan;
		    String loan;
		    int creditScore;
		    scan=new Scanner (System.in);
		    System.out.println("Do you need a loan?");
		    loan=scan.nextLine();
		    System.out.println("What is your credit score?");
		    creditScore=scan.nextInt();
		    String creditResult=scan.nextLine();
		    
		   
		    if(creditScore<600) {
		      creditResult="Not eligible";
		    }else if(creditScore>=600 && creditScore<=700) {
		      creditResult="Maybe eligible";
		    }else if(creditScore>=701 && creditScore<=800) {
		      creditResult="Eligible";
		    }else if(creditScore>=801) {
		     creditResult="Definitely eligible";
		    }else {
		     creditResult="Unknown";
		    	
		    }
		    System.out.println("The eligibility is " + creditResult);
		    
		    
		  

	}	

	}

