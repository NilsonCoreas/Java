package com.syntax.class15;

public class CreatingMethods {
	char mark(int a) {
		char grade;
		if(a>90) {
			grade='A';
		}else if (a<=90 && a>80) {
			grade='B';
		}else if (a<=80 && a>70) {
			grade='C';
		}else {
			grade='F';
		}return grade;
	}
	public static void main(String[] args) {
		CreatingMethods obj = new CreatingMethods();
		char grade = obj.mark(75);
		System.out.println(grade);
		
		//if grade is A or B --> good job, otherwise study more
		if(grade == 'A' || grade == 'B') {
			System.out.println("Good job");
		}else {
			System.out.println("Study more");
		}
	}
}
