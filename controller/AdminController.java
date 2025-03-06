package com.exp.bankapplication.controller;

import java.util.Scanner;

import com.exp.bankapplication.service.RBI;

import com.exp.bankapplication.serviceimpl.SBI;

public class AdminController {

	
	public static void main(String[] args) {

		System.err.println("******* Welcome to SBI ********");

		Scanner sc = new Scanner(System.in);

		boolean flag = true;
		RBI rbi = new SBI();

		while (flag) {
			System.out.println("------------------------------------------");
			System.out.println("1 : CREATE BANK ACCOUNT");
			System.out.println("2 : SHOW ACCOUNT DETAILS");
			System.out.println("3 : SHOW ACCOUNT BALENCE");
			System.out.println("4 : WITHDROW MONEY");
			System.out.println("5 : DEPOSITE MONEY");
			System.out.println("6 : UPDATE ACCOUNT DETAILS");
			System.out.println("7 : EXIT");

			System.out.println(" ENTER YOUR CHOISE BETWEEN 1 TO 7");
			int ch = ValidChoise();

			switch (ch) {

			case 1:
				rbi.createAccount();
				break;

			case 2:
				System.out.println("How many accounts you want to display");
				System.out.println("1 : for Single account");
				System.out.println("2 : for All accounts");
				int au = ValidAddAccountChoise();;
				switch (au) {
				case 1:
					rbi.displaySingleAccountDetails();
					break;

				case 2:
					rbi.showAccountDetails();
					break;

				}
				break;

			case 3:
				rbi.showAccountBalence();
				break;

			case 4:
				rbi.withdrawMoney();
				break;

			case 5:
				rbi.depositeMoney();
				break;

			case 6:
				rbi.updateAccountDetails();
				break;

			case 7:
				flag = false;
				break;

			default:
				System.out.println("Entered number is invalid please enter valid choise");

			}

		}

	}
	public static int ValidChoise() {
		Scanner sc = new Scanner(System.in);
		try {
			int ch = sc.nextInt();
			return ch;
		} catch (Exception e) {
			System.out.println(e);
			e.printStackTrace();
			e.getMessage();
			System.out.println("Invalid input please provide correct input ...");
			return ValidChoise();
		}
	}
	
	public static int ValidAddAccountChoise() {
		Scanner sc = new Scanner(System.in);
		int au;
		try {
			 au = sc.nextInt();
			 return au;
		} catch (Exception e) {
			System.out.println(e);
			System.out.println("Invalid input type please enter interger value");
			return ValidAddAccountChoise();
		}
	}

}
