package com.syntax.class15;

public class LarNum {

	
		// Create a method that will take 2 parameters as a numbers and prints which number is larger.
		//Create a method that will take a number and prints whether the number is even or odd.
		//Create a method that will print whether given String is palindrome or not.
		//Create a method that will say Hello in different language based on the country that will passed when method is executed. 
		 void bigNum(int a , int b) {
		        if(a > b) {
		            System.out.println(a +" is bigger than " + b);
		        }else {
		            System.out.println(b +" is bigger than " + a);
		        }
		    }
		    void evenNum (int a) {
		        if (a % 2 == 0) {
		            System.out.println(a + " is even number");
		        }else {
		            System.out.println(a + " is odd number");
		        }
		        
		    }
		    
		    void palin(String word) {
		        String reverse = "";
		        for(int i = word.length()-1; i >= 0; i--) {
		            reverse += word.charAt(i);
		        }
		        System.out.print(reverse);
		        if(word.equals(reverse)) {
		            System.out.println(" is a palidrome");
		        }else {
		            System.out.println(" is Not a palindrome");
		        }
		        
		    }
		    void lang(String word) {
		        switch(word) {
		        case "Russia":
		            System.out.println("Privet");
		            break;
		        case "Tajikistan":
		            System.out.println("Salom");
		            break;
		        case "Mexico":
		            System.out.println("hola");
		            break;
		            default:
		                System.out.println("wrong language");
		        
		        }
		    }
		    public static void main(String[] args) {
		        LarNum obj = new LarNum();
		        
		        obj.palin("abba");
		        obj.bigNum(30,40);
		        obj.evenNum(41);
		        obj.lang("Tajikistan");
		        

}
}
