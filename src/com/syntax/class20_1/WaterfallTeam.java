package com.syntax.class20_1;

public class WaterfallTeam {

	public static void main(String[] args) {
		
		WaterfallTeam wteam=new WaterfallTeam();
		Employee.company="Syntax";
		wteam.empNumber=124;// protected variables is visible to the child class in different Package
		//wteam.salary // CE: default is not visible
		//BREAK TILL 8:55
	}
}
