package com.ibm.training;

public class Account {
	
	String userName;
	String accountNo;
	String address;
	String phoneNo;
	int balance;
	
	
	public Account(String userName, String accountNo, String address, String phoneNo, int balance) {
		
		this.userName = userName;
		this.accountNo = accountNo;
		this.address = address;
		this.phoneNo = phoneNo;
		this.balance = balance;
	}
	public Account() {
		
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getAccountNo() {
		return accountNo;
	}
	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getPhoneNo() {
		return phoneNo;
	}
	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	
	
	

}
