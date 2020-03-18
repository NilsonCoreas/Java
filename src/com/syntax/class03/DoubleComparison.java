package com.syntax.class03;

public class DoubleComparison {

	public static void main(String[] args) {
		
		double num1=30;
		double num2=50;
				
		if (num1>num1) {
			System.out.println("Double value " + num1 + " is larger than " + num2);
		}else {
			System.out.println("Double value " + num1 + " is not larger than " + num2);
		}

		
		int temp=40;
		int freezeTemp=32;
		
		if(temp<freezeTemp) {
			System.out.println("Water will freeze with temperature");
		} else {
			System.out.println("Water will not freeze with temperature");
		}
	}

}
