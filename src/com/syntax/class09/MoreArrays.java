package com.syntax.class09;

public class MoreArrays {

	public static void main(String[] args) {
		
		String[] students=new String[3];// will not work because too many students compared to what number is given on this line
		students[0]="Hassna";
		students[1]="Faisal";
		students[2]="Kemal";
		//students[3]="Aaron";
		
		//System.out.println(students[3]);
		
		String[] inClassStudents=new String[5];
		inClassStudents[1]="Hichem";
		inClassStudents[2]="Tetteh";
		inClassStudents[3]="Alice";
		inClassStudents[4]="Walio";
		//inClassStudents[5]="Pete";
		System.out.println(inClassStudents[0]); //stored less elements than we declared, compiler will add default values 

	}

}
