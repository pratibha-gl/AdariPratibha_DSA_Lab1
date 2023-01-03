package com.gl.emailapp.service;

import java.util.Random;

import com.gl.emailapp.model.Employee;

public class CredentialServiceImpl implements CredentialService {

	@Override
	public String passwordGenerator() {

		  String capitalCaseLetters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
	      String lowerCaseLetters = "abcdefghijklmnopqrstuvwxyz";
	      String specialCharacters = "~`! @#$%^&*()_-+={[}]|\\:;\"'<,>.?/";
	      String numbers = "1234567890";
	      String values = capitalCaseLetters + lowerCaseLetters + specialCharacters + numbers;
	      Random random = new Random();
	      char[] password = new char [8];
	      for (int i = 0; i < 8; i++) {
	    	  int randomNumber = random.nextInt(values.length());
	    	  password[i] = values.charAt(randomNumber);
	    	  
	      }
		// TODO Auto-generated method stub
		return new String (password);
	}

	public String emailGenerator(Employee employee, String department) {
		// TODO Auto-generated method stub
		return (employee.getFirstName() + employee.getLastName()).toLowerCase() + department + "@" + ".abc.com";
	}

	@Override
	public void displayCredentials(Employee emp, String department) {
		System.out.println("Dear" + emp.getFirstName() + "  " +emp.getLastName() + "Your credentials are as follows :" );
		System.out.println("YOur email is :" + emailGenerator(emp,department));
		System.out.println("Your passoword is:" + passwordGenerator());
		// TODO Auto-generated method stub

	}

}