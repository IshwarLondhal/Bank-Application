package com.exp.bankapplication.model;

public class Account {

	private int accountNo;
	private String accountName;
	private long aadharcard;
	private String pancard;
	private long contact;
	private String mail;
	private double accountBalence;

	public int getAccountNo() {
		return accountNo;
	}

	public void setAccountNo(int accountNo) {
		this.accountNo = accountNo;
	}

	public String getAccountName() {
		return accountName;
	}

	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}

	public long getAadharcard() {
		return aadharcard;
	}

	public void setAadharcard(long aadharcard) {
		this.aadharcard = aadharcard;
	}

	public String getPancard() {
		return pancard;
	}

	public void setPancard(String pancard) {
		this.pancard = pancard;
	}

	public long getContact() {
		return contact;
	}

	public void setContact(long contact) {
		this.contact = contact;
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	public double getAccountBalence() {
		return accountBalence;
	}

	public void setAccountBalence(double accountBalence) {
		this.accountBalence = accountBalence;
	}

	@Override
	public String toString() {
		return "Account [accountNo=" + accountNo + ", accountName=" + accountName + ", aadharcard=" + aadharcard
				+ ", pancard=" + pancard + ", contact=" + contact + ", mail=" + mail + ", accountBalence="
				+ accountBalence + "]";
	}

}
