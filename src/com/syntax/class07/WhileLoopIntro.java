package com.syntax.class07;

public class WhileLoopIntro {

	public static void main(String[] args) {
		int time=10;
		if(time<12) {
		System.out.println("Good Morning");
		}
		System.out.println("---------WHILE LOOP---------");
		//while(time<12) {
		//System.out.println("Good Morning"); //CODE WILL EXECUTE INFINITELY
	//	}
		while(time<12) { //condition has to be true for it to execute
			System.out.println("Good Morning")/77
			time++;//will get executed 2 times because from 10 to 12 with 2 executions
	}

		//how to print numberd from 1-50
		int num=1; //will capture numbers between 1-50 since we started at 1 and a true condition of <=50
		while(num<=50) {
			System.out.println(num);
			num++;
		}
		//how to print numbers from 20 to 30
		int num1=20;
		while(num1<=30) {
			System.out.println(num1);
			num1++; //num1--; gives infinite numbers going into negatives
		}
		System.out.println("*************************");
		// how to print numbers from 5-15 all in 1 line
		int num2=5;
		while(num2<=15) {
			System.out.print(num2 + " "); //take out ln to make it all in one line
			num2++;
		}
		// how to print values from 10-1
		int num3=10;
		while(num3>=1) {
			System.out.println(num3);
			num3--;
		}
		//how to print 50-1
		int num4=50;
		while(num4>=1) {
			System.out.println(num4);
			num4--;
		}
		//how to print odd numbers from 1-20
		int num5=1;
		while(num5<=20) {
			System.out.println(num5);
			num5 +=2; 
			//if (num5 % 2 !=0) {
			// System.out.println(num5);
			//} num4++;
			
		}
		
}
}