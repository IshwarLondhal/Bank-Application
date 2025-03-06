package com.exp.bankapplication.validations;

import java.util.*;
import java.util.regex.Pattern;

public class Validations {

	public static String validateAccountHolderName() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your name");
		String name = sc.nextLine();
//		char[] ch = name.toCharArray();
		boolean flag = true;
//		for (int i = 0 ; i<ch.length ; i++) {
//			if(!(name.charAt(i) >= 'a' &&  name.charAt(i) <= 'z') && !(name.charAt(i) >= 'A' && name.charAt(i) <= 'Z')){
////			if(!(name.charAt(i)>='a' && !(name.charAt(i)<='z')) && !(name.charAt(i)>='a' && !(name.charAt(i)<='z')))
//				flag = false;
//				
//			}
//			
//		}	
//		if(!flag) {
//			System.out.println("Invalid Input");
//			return validateAccountHolderName();
//		}
//		return name;
		if (Pattern.matches("[a-zA-Z]+", name)) {
			flag = false;
//			System.out.println("valid");
		} else {
			System.out.println("Invalid");
			return validateAccountHolderName();
		}
		return name;
	}

	public static long validateAccountHolderAadhar() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your Aadhar number ");
		long Aadhar = validAccountHolderAadhar();
		String aadhar = Long.toString(Aadhar);
//		char[] ch = aadhar.toCharArray();
//		boolean flag = true;
		if (Pattern.matches("[0-9]{12}+", aadhar)) {
			return Aadhar;
		} else {
			System.out.println("Invalid Input");
//			sc.close();
			return validateAccountHolderAadhar();
		}
//		sc.close();

	}

	public static String validateAccountHolderPancard() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your Pancard number...");
		String pan = sc.next();
//		char[] ch = pan.toCharArray();

		if (Pattern.matches("[A-Z]{5}[0-9]{4}[A-Z]{1}", pan)) {

			return pan;
		} else {
			System.out.println("Invalid Input");
			return validateAccountHolderPancard();
		}

	}

	public static String validateAccountHolderMailid() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your Mail Id");
		String mailid = sc.next();
//		char[] ch = mailid.toCharArray();

		if (Pattern.matches("^[a-zA-Z0-9+_.-]+@[a-zA-Z0-9.-]+$", mailid)) {
			return mailid;
		} else {
			System.out.println("Invalid Input");
			return validateAccountHolderMailid();
		}

	}

	public static long validateAccountHolderContactno() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your Contact number");
//		boolean flag = true;
		long contact = validAccountHolderContactno();
		String Contact1 = Long.toString(contact);
		if (Pattern.matches("[0-9]{10}+", Contact1)) {
//			flag = false;
			return contact;
		} else {
			System.out.println("Invalid Input");
			return validateAccountHolderContactno();
		}
		
	

	}
	
	public static int getValidAddAccountChoise() {
		Scanner sc = new Scanner(System.in);
		int ac;
		try {
			 ac = sc.nextInt();
			 return ac;
		} catch (Exception e) {
			System.out.println(e);
			System.out.println("Invalid input type please enter interger value");
			return getValidAddAccountChoise();
		}
	}
	public static long validAccountHolderAadhar() {
		Scanner sc = new Scanner(System.in);
		long aadhar;
		try {
			 aadhar = sc.nextLong();
			 return aadhar;
		} catch (Exception e) {
			System.out.println(e);
			System.out.println("Invalid input type please enter interger value");
			return validAccountHolderAadhar();
		}
	}
	public static long validAccountHolderContactno() {
		Scanner sc = new Scanner(System.in);
		long contactno;
		try {
			 contactno = sc.nextLong();
			 return contactno;
		} catch (Exception e) {
			System.out.println(e);
			System.out.println("Invalid input type please enter interger value");
			return validAccountHolderContactno();
		}
	}

}
