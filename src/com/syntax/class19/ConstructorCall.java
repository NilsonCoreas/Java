package com.syntax.class19;

public class ConstructorCall {

		public ConstructorCall() {
			System.out.println("I am non argument constructor");
		}
		public ConstructorCall(String str) {
			this(); //using this to call constructor into another constructor
		}
		public ConstructorCall(String str, String str1) {
			this(str);
		}
		
		public static void main(String[] args) {
			ConstructorCall obj=new ConstructorCall("Java", "Love"); 
		}
}
