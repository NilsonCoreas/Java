package com.syntax.class11;

import java.util.Scanner;

public class MoreStringTasks {

	public static void main(String[] args) {
		//Username and Password cannot be  empty, if so→ message=“Username and Password cannot be empty”.
			//	Password should be minimum 8 characters, if less → message=“Password is too short”.
			//Password cannot contain username if so, → message=“Password cannot contain username”.
			//	Password should match confirmed password, if not  → message=“Passwords do not match”.
			//	Only after all requirements met → message “Your username and password has been created”
		Scanner scan;
		String username;
		String password;
		String confirmedPassword;
		String message=null;
		
		scan=new Scanner(System.in);
		System.out.println("Please enter your username");
		username=scan.nextLine();
		
		System.out.println("Please enter your password");
		password=scan.nextLine();
		
		if(!(username.isEmpty() || password.isEmpty())) {
			if(password.length()>=8) {
				if(!password.contains(username)) {
					System.out.println("Please confrim password");
					confirmedPassword=scan.nextLine();
					if(password.equals(confirmedPassword)) {
						System.out.println("Your account is created"); {
						}
					}
				}else {
					System.out.println("Password cannot contain username");
				}
				
			}else {
				System.out.println("Password is too short");
			}
		
		}else {
			message="Username and password cannot be empty";
		}
		System.out.println(message);
	}

}
