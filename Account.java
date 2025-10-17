package Bank_Management_System;

public class Account {
	private String accountNumber;
	private String accountHoldername;
	private double balance;
	
	public Account(){
	}
	public Account(String accountNumber ,String accountHoldername,double balance) {
		this.accountNumber=accountNumber;
		this.accountHoldername=accountHoldername;
		this.balance=balance;
		
	}
	public String getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}
	public String getAccountHoldername() {
		return accountHoldername;
	}
	public void setAccountHoldername(String accountHoldername) {
		this.accountHoldername = accountHoldername;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	public void deposite(double amount) {
		if(amount>0) {
			balance+=amount;
			System.out.println("Amount Succesfuly Deposite ");
		}
		else {
			System.out.println("Deposite Amount Must Be Positive ");
		}
	}
	public void withdrawl(double amount) {
		if(amount>0 && amount<=balance) {
		balance-=amount;
		System.out.println("Succesfully Withraw Money ");
		}else {
			System.out.println("Invalid Withrawal Amount or Insufficient Balance !");
		}
		
		
	}
	public void displaydetails() {
		System.out.println("\n --Account Details-- ");
		System.out.println("Account Number     :"+this.accountNumber);
		System.out.println("Account Holdername :"+this.accountHoldername);
		System.out.println("Balance            :"+this.balance);
	}
	
	
	
}
