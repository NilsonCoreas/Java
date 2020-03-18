package com.syntax.class04;

public class NestedIf {

	public static void main(String[] args) {
		boolean classToday=false;
		boolean flag=true;
		//if block is fale, then it'll skip it and go to the else outside the block
		if(flag) {
			System.out.println("Hello");
			if(classToday) {
				System.out.println("Hello Friends");
			} else {
				System.out.println("Hello family");
			}
		}else {
			System.out.println("Bye");
		}
		System.out.println("-------------");

		//declafe date and a day
		//if day is Friday -> if date is 13 -> watch a scary movie
		//                 -> if date is not 13 -> watch a comedy
		boolean isFriday=false;
		int date=13;
		
		if(isFriday) {
			System.out.println("Today is Friday, Im going to watch a movie");
			if(date==13) {
				System.out.println("I'll watch a scary movie");
			}else {
				System.out.println("I'll watch a comedy");
			}
		}else {
			System.out.println("Today is not Friday, I'm staying home");
		}
		System.out.println("----------");
		
		//check if patient has an allergies
		//if no allergies-> you are healthy
		//otherwise check if patient has:
		     // orange allergy-> do not eat oranges
		     //apple allergy-> do not eat apples
		     //kiwi allergy -> do not eat kiwis
		
		boolean allergy=true;
		boolean appleAllergy=false;
		boolean orangeAllergy=true;
		boolean kiwiAllergy=false;
		
		if(allergy) {
			System.out.println("Please answer below");
			
			if(orangeAllergy) {
				System.out.println("Do not eat oranges");
			}
			
		}else {
			System.out.println("You are healthy");
		}
		
		/*if student completed a quiz we will check for a score
		 * if score > 90 ->great job
		 * if score > 80 ->well done
		 * if score > 70 ->could have done better
		 * 
		 * if student didn't complete the quiz -> not good
		 * please do homework on time
		 */
		
		boolean quizCompleted=true;
		int score=86;
		
		if(quizCompleted) {
			System.out.println("We will check for a score");
			if(score>90) {
				System.out.println("Great job");
			}else if(score>80) {
				System.out.println("Well done");
			}else if(score>70) {
				System.out.println("Could have done better");
			}else {
				System.out.println("You failed");
			}
		
			
		}else {
			System.out.println("Please do homework on time");
		}

		System.out.println("-------------");
		//user has diploma -> congrats -> check GPA score, otherwise suggest getting a degree
		//GPA score >= 3.5 -> you are eligable for scholarships ->otherwise study harder
		//
		boolean userDegree=true;
		double gpa=3.5;
		
		if(userDegree) {
			System.out.println("Congrats");
		if(gpa>=3.5) {
			System.out.println("You're eligable for a scholarship");
		}else if(gpa<3.5) {
			System.out.println("Study harder");
		}
		}else 
		{
			System.out.println("suggest getting a degree");
		}
		
		System.out.println("--------");
		
		
		int mortgageRate=4;
		int mortgagePrice=334000;
		
		if(mortgageRate>4.5) {
			System.out.println("I will not buy the house");
		}else {
			System.out.println("I will buy the house");
			if(mortgagePrice>200000) {
				System.out.println("I will take the loan");
			}else if(mortgagePrice<200000)
			{
				System.out.println("I will pay cash");
			}
		}
	}

}
