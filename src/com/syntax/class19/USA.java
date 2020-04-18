package com.syntax.class19;

public class USA {
	String state, stateCapital;
	
	public USA(String state, String stateCapital) {
		
		this.state=state; //Use this. to be able to print out the results on line 20 rather than getting null
		this.stateCapital=stateCapital;
		
	}
	
	public void displayState() {
		System.out.println(state);
	}
	public void displayStateCapital() {
		System.out.println(stateCapital);
	}
	//call 1 method inside another method
	public void displayInfo() {
		displayState(); //by default compiler adds this keyword to a method
		displayStateCapital();
		
	}
	
	public static void main(String[] args) {
		USA state1=new USA("Texas", "Austin");
		//state1.displayState();
		//state1.displayStateCapital();
		state1.displayInfo();
		
		state1=new USA("Georgia", "Atlanta");
		state1.displayInfo();
	}
}
