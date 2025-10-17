package Bank_Management_System;
import java.util.*;
public class Bank {
	private HashMap<String,Account> accounts=new HashMap<>();
	
	public void createAccount( String accountNumber,String name,double initial_balance) {
		if(accounts.containsKey(accountNumber)) {
			System.out.println("Account with This number Already Exists !");
		}
		else {
			Account newacount=new Account(accountNumber,name,initial_balance);
			accounts.put(accountNumber,newacount);
			System.out.println("Account Created Succesfully !");
		}
	}
	public Account getAccount(String accountNumber) {
					return
				accounts.get(accountNumber);
	}
	public void displayAllAcounts() {
		if(!accounts.isEmpty()) {
			System.out.println("\n ALL Accounts ");
			for(Account acc:accounts.values()) {
				acc.displaydetails();
			}
		}
	}
}
