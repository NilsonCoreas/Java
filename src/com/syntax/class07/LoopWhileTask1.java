package com.syntax.class07;

public class LoopWhileTask1 {

	public static void main(String[] args) {
		/*Create a boolean variable workDay and assign true create int variable day and assign it to 1

As long as it is workDay print “I need a day off” and increase day.
Once day is 6 print “I do not need a day off any more”
		 * 
		 * 
		 * 
		 * 
		 */
		boolean workDay=true;
		int day=1;
		
		while(workDay) {
			if(day<6) {
				System.out.println("i need a day off");
			}else {
				System.out.println("i don't need a day off anymore");
				workDay=false;
			}
			day++; //MUST USE THIS TO INCREMENT THE DAY UNTIL IT GOES UP TO 5 IN THIS SITUATION
		}
	}

}
