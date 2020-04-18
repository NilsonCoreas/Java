package com.syntax.class19;

public class ThisKeyword {

		int a; //10
		int b; //20
		public ThisKeyword() {
			System.out.println("I am non argument construtor");
		}
		
		public ThisKeyword(int a, int b) {
			this.a=a;
			this.b=b;
		}
		public void sum(int a, int b) {
			//sum of which variables am i calculating?
			System.out.println("Sum of local variables "+(a+b)); //output=300 for obj.sum, obj2=60
			System.out.println("Sum of instance variables "+(this.a+this.b)); //output=30 for ThisKeyword obj=new ThisKeyword(10,20);, second output=0
		}
		
		
		public static void main(String[] args) {
			ThisKeyword obj=new ThisKeyword(10,20);
			obj.sum(100, 200);
			
			System.out.println("----------------------------");
			ThisKeyword obj2=new ThisKeyword(); //accessing int a and int b which are currently 0
			obj2.sum(20, 40);
		}
}
