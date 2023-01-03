package com.gl.emailapp.main;

import java.util.Scanner;

import com.gl.emailapp.model.Employee;
import com.gl.emailapp.service.CredentialServiceImpl;

public class EmailApp {
	
	public static void main(String[] args) {
		
		CredentialServiceImpl service = new CredentialServiceImpl();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first name");
		String firstName = sc.next();
		System.out.println("Enter last name");
		String lastName = sc.next();
	    Employee employee = new Employee (firstName, lastName);
		String dept = null;
		service.passwordGenerator();
		System.out.println("Enter the department");
		System.out.println("1. Press 1 for Technical");
		System.out.println("2. Press 2 for Admin");
		System.out.println("3. Press 3 for Human Resource");
		System.out.println("4. Press 4 for Legal");
		System.out.println("------------------");
		int choice = sc.nextInt();
		switch (choice){
		case 1:
			dept = "tech";
			break;
		case 2:
			dept = "admin";
			break;
		case 3:
			dept = "hr";
			break;
		case 4:
			dept ="legal";
			break;
		default:
			System.out.println("Please enter the correct choice");
		service.emailGenerator(employee, dept);
		service.displayCredentials(employee,dept);
		
		}	
		
	}
}
