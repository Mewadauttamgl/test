package com.college.controller;
import com.college.service.StudentService;
import java.util.*;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import com.college.model.Student;
import com.college.service.StudentService;

public class Main {

 public static void main(String[] args) {

 Scanner sc=new Scanner(System.in);

 int rollno = 0;
	do {
		System.out.print("Enter rollno: ");
		String rollstr = sc.nextLine();
		
		try {
			rollno = Integer.parseInt(rollstr);
			if (String.valueOf(rollno).length() != 4) rollno = 0;
		} catch (Exception e) {}
	} while (rollno == 0);
	
	String studentName = "";
	boolean lowercasefound;
	do {
		System.out.print("Enter name: ");
		studentName = sc.nextLine();
		
		lowercasefound = false;
		for (int i = 0; i < studentName.length(); i++) {
			if (Character.isLowerCase(studentName.charAt(i))) {
				lowercasefound = true;
				break;
			}
		}
		
	} while (studentName.length() > 20 || lowercasefound);
	
	/*String standard = "";
	String[] standards = {"I", "II", "III", "IV", "V", "Vi", "VII", "VIII", "IX", "X"};
	List<String> list = new ArrayList<String>(Arrays.asList(standards));
	do {
		System.out.print("Enter standard: ");
		standard = sc.nextLine();
	} while (!list.contains(standard));*/
	System.out.print("Enter standard: ");
	 String standard = sc.nextLine();
	System.out.print("Enter D.O.B.: ");
	String dob = sc.nextLine();
	
	Double fees = 0.0;
	do {
		System.out.print("Enter fees: ");
		if (sc.hasNextDouble())
			fees = sc.nextDouble();
	} while (fees == 0.0);
	
	

 Student student=new Student(rollno,studentName,standard,dob,fees);

 StudentService service=new StudentService();

 String res=service.Insert(student);

 System.out.println(res);

 }

}