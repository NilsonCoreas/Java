package com.syntax.class24;

public class PhoneTest {
public static void main(String[] args) {
	
	//new Phone(); CE, cannoy instantiate/create an object of Phone class because it is abstract
	
	Phone iphone=new iPhone(); //create object of Phone type by assigning it to Child class whic is upcasting
	iphone.call();
	iphone.text();
	iphone.takePicture();
	iphone.playMusic();
	
	Phone samsung=new Samsung();
	samsung.call();
	samsung.text();
	samsung.takePicture();
	samsung.playMusic();
}
}
