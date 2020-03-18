package com.syntax.class05;

public class MoreLogicalOperators {

	public static void main(String[] args) {
		/*We have total 7 days in a week
		 * if day is 2, 3 --> SDLC
		 * if day 6,7 --> Java Class
		 * if day 1, 5 --> off day
		 * if day 4 --> review class
		 */
		int day=6; //AND both has to be true , OR (||) one can be true in order for output to happen
		// to compare numbers we use equality ops
		if (day==2 && day==3) {
			System.out.println("SDLC Class");
		}else if (day==6 || day==7) { //change && to || to make statement into output
			System.out.println("Java Class");
		}else if (day==1 && day==5) {
			System.out.println("Off Day");
		}else if (day==4) {
			System.out.println("Review Class");
		}else {
			System.out.println("Invalid Day");
		}
		
		System.out.println("----using Strings----");
		// to compare Strings, we use equals
		String day1="Saturday";
		
		if (day1.equals("Tuesday") || day1.equals("Wednesday")) {
			System.out.println("SDLC");
		}else if (day1.equals("Saturday") || day1.equals("Sunday")) {
			System.out.println("Java Class");
		}else if (day1.equals("Monday") || day1.equals("Friday")) {
			System.out.println("Off Day");
		}else if (day1.equals("Thursday")) {
			System.out.println("Review Class");
		}else {
			System.out.println("Invalid Day");
		}
	}

}
