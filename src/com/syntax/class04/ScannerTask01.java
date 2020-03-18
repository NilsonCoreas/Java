package com.syntax.class04;

import java.util.Scanner;

public class ScannerTask01 {

	public static void main(String[] args) {
		Scanner abd=new Scanner(System.in);
		System.out.println("How old are you ? ");
		int age= abd.nextInt();
		if (age<10) {
			System.out.println("You are too young");
		}else if (age>20){
			System.out.println("You are growing");
		}else {
			System.out.println("You are getting old my friend");
		}
			}
	}

