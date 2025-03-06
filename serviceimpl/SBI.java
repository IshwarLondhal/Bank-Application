package com.exp.bankapplication.serviceimpl;

import java.util.Scanner;

import com.exp.bankapplication.model.Account;
import com.exp.bankapplication.service.RBI;
import com.exp.bankapplication.validations.Validations;

public class SBI implements RBI {

	Scanner sc = new Scanner(System.in);
	Account ac = new Account();
	Account a[] = new Account[5];
//	Validations vali = new Validations();

	@Override
	public void createAccount() {
		// TODO Auto-generated method stub
		System.out.println("How many Accounts you want to add : ");
		int n = ValidHowManyAccountChoise();

		for (int i = 0; i < n; i++) {
			Account ac = new Account();
			System.out.println("Enter your account number");
			int accNo = ValidAccountNumber();
			ac.setAccountNo(accNo);
//		System.out.println("Enter your Name"); 
//		String name = sc.next();
			String name = Validations.validateAccountHolderName();
			ac.setAccountName(name);
//		ac.setAccountName(Validations.validateAccountHolderName());
//		System.out.println("Enter your Aadhar card");
			long aadhar = Validations.validateAccountHolderAadhar();
			ac.setAadharcard(aadhar);
//		ac.setAccountName(Validations.validateAccountHolderAadhar());
//		System.out.println("Enter your Pan card");
			String pan = Validations.validateAccountHolderPancard();
			ac.setPancard(pan);
//		ac.setAccountName(Validations.validateAccountHolderPancard());
//		System.out.println("Enter your mail id");
			String mailid = Validations.validateAccountHolderMailid();
			ac.setMail(mailid);
//		ac.setAccountName(Validations.validateAccountHolderMailid());
//		System.out.println("Enter your Contact number");
			long contact = Validations.validateAccountHolderContactno();
			ac.setContact(contact);
//		ac.setAccountName(Validations.validateAccountHolderContactno());
			System.out.println("Enter your account opening amount");
			ac.setAccountBalence(sc.nextDouble());

			a[i] = ac;
			System.out.println("Account Creation Sucess...");

		}
	}

	@Override
	public void showAccountDetails() {
		// TODO Auto-generated method stub

		System.out.println("------- Display all Accounts -------");
//		int accNo = sc.nextInt();

		for (Account acc : a) {
			if (acc != null) {
				System.out.println(acc);
			}
		}

	}

	@Override
	public void showAccountBalence() {
		// TODO Auto-generated method stub
		System.out.println("Enter your Account number");
		int accNo = ValidAccountNumber();
		for (Account acc : a) {

			if (acc != null && acc.getAccountNo() == accNo) {
				System.out.println("Current account balence " + acc.getAccountBalence());
				break;
			} else if (acc != null) {

			} else {
				System.out.println("Account doesn't exist...");
			}
		}

	}

//	@Override
//	public void showAccountMoney() {
//		// TODO Auto-generated method stub
//		
//	}
	@Override
	public void depositeMoney() {
		// TODO Auto-generated method stub
		System.out.println("Enter your Account number");
		int accNo = ValidAccountNumber();
//		if(ac.getAccountNo() == accNo) {
//			System.out.println("Enter money you want to deposite...");
//			double add = sc.nextDouble();
//			double updatedBalence = add + ac.getAccountBalence();
//			ac.setAccountBalence(updatedBalence);
//			System.out.println("Current account balence " +ac.getAccountBalence());
//		}else {
//			System.out.println("Account doesn't exist...");
//		}

		for (Account ac : a) {

			if (ac.getAccountNo() == accNo) {
				System.out.println("Enter money you want to deposite ...");
				double deposite = sc.nextDouble();

				double updatedBalence = ac.getAccountBalence() + deposite;
				ac.setAccountBalence(updatedBalence);
				System.out.println("Your money has been deposited...");
				System.out.println("Your Updated account balence " + ac.getAccountBalence());
				break;
			} else {
				System.out.println("Account doesn't exist...");
			}
		}

	}

	@Override
	public void withdrawMoney() {
		// TODO Auto-generated method stub
		System.out.println("Enter your Account number");
		int accNo = ValidAccountNumber();
		int count = 0;
		for (Account ac : a) {

			if (ac != null && ac.getAccountNo() == accNo) {
				System.out.println("Enter money you want to withdraw...");
				double withdraw = sc.nextDouble();
				if (withdraw <= ac.getAccountBalence()) {
					double updatedBalence = ac.getAccountBalence() - withdraw;
					ac.setAccountBalence(updatedBalence);
					System.out.println("Take your money");
					System.out.println("Updated account balence " + ac.getAccountBalence());
					count++;
					break;

				} else {
					System.out.println(
							"Your entered amount is more then your available balence, please ensure that your entered amount is less than or equal to your avaiable balence.");
				}

			}if(count >0) {
				System.out.println("Account doesn't exist  uthvghvhgv...");
			}
			
		}

	}

	@Override
	public void updateAccountDetails() {
		// TODO Auto-generated method stub
		System.out.println("Enter your Account number");
		int accNo = ValidAccountNumber();
		for (Account account : a) {

			if (account != null && account.getAccountNo() == accNo) {
				boolean b = true;
				while (b) {
					System.out.println("1 :Update your Name");
					System.out.println("2 :Update your Contact number");
					System.out.println("3 :Update your mail id");
					System.out.println("4 :Exit");
					System.out.println("Enter choise what you want to update from your account...");
					int choise = sc.nextInt();
					switch (choise) {
					case 1:
//						System.out.println("Enter your new Name");
						String name = Validations.validateAccountHolderName();
						account.setAccountName(name);
//				ac.setAccountName(sc.next());
						break;
					case 2:
//						System.out.println("Enter your new Contact number");
						long contact = Validations.validateAccountHolderContactno();
						System.out.println(contact);
						account.setContact(contact);
//				ac.setContact(sc.nextLong());
						break;
					case 3:
//						System.out.println("Enter your new mail id");
						String mailid = Validations.validateAccountHolderMailid();
						account.setMail(mailid);
//				ac.setMail(sc.next());
						break;
					case 4:
						b = false;
						break;
					default:
						System.out.println("invalid choise plese enter valid choise...");

					}
				}

				System.out.println("Account Updated Sucessful...");
			} else if(account == null) {
				
			}else {
				System.out.println("Account doesn't exist...");
			}
			
		}

	}

	@Override
	public void displaySingleAccountDetails() {
		// TODO Auto-generated method stub
		System.out.println("Enter Account number : ");
		int an = ValidAccountNumber();
		for (Account acc : a) {
			if (acc != null && acc.getAccountNo() == an) {
				System.out.println(acc);
			}

		}

	}
	
	
	public static int ValidHowManyAccountChoise() {
		Scanner sc = new Scanner(System.in);
		int au;
		try {
			 au = sc.nextInt();
			 return au;
		} catch (Exception e) {
			System.out.println(e);
			System.out.println("Invalid input type please enter interger value");
			return ValidHowManyAccountChoise();
		}
	}
	
	public static int ValidAccountNumber() {
		Scanner sc = new Scanner(System.in);
		int au;
		try {
			 au = sc.nextInt();
			 return au;
		} catch (Exception e) {
			System.out.println(e);
			System.out.println("Invalid input type please enter interger value");
			return ValidAccountNumber();
		}
	}

}
