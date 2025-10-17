package Bank_Management_System;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Bank bank=new Bank();
		int choice ;
		
		while(true) {
		System.out.println("\n=== Bank Managerment System ===");
		System.out.println(" 1.Create New Bank Account  ");
		System.out.println(" 2.Display All Accounts  ");
		System.out.println(" 3.Deposit Money ");
		System.out.println(" 4.Withraw Money");
		System.out.println(" 5.Check Balance ");
		System.out.println(" 6.Exit ");
		
		System.out.println(" Enter Your Choice : ");
		choice =sc.nextInt();
		switch(choice) {
		case 1:
			System.out.println("Enter Account Number     :");
			String accno=sc.next();
			sc.nextLine();
			System.out.println("Enter Account Holder Name:");
			String name=sc.nextLine();
			System.out.println("Enter Initial Balance    :");
			double balance=sc.nextDouble();
			bank.createAccount(accno, name,balance);
			break;
		case 2:
			bank.displayAllAcounts();
			break;
		case 3:
			System.out.println("Enter Account Number    :");
			String enternumber=sc.next();
			sc.nextLine();
			Account acc=bank.getAccount(enternumber);
			if(acc!=null) {
				System.out.println("Enter Deposit Amount :");
				double amount=sc.nextDouble();
				acc.deposite(amount);
								
			}else {
				System.out.println("Account Not Found !");
			}
			break;
		case 4:
		System.out.println("Enter Account Number       :");
			enternumber=sc.next();
			sc.nextLine();
	     acc=bank.getAccount(enternumber);
	     if(acc!=null) {
	    		System.out.println("Enter withraw Amount :");
				double amount=sc.nextDouble();
				acc.withdrawl(amount);
				
	     }
	     else {
	    	 System.out.println("Account Not Found !");
	     }
		break;
		case 5:
			System.out.println("Enter Account Number       :");
			enternumber=sc.next();
			sc.nextLine();
	     acc=bank.getAccount(enternumber);
	     if(acc!=null) {
	    		acc.displaydetails();
	     }
	     else {
	    	 System.out.println("Account Not Found !");
	     }
	     break;
		case 6:
			System.out.println("Thank You For Using Bank Management System !");
			System.exit(choice);
			break;
		default:
			System.out.println("Invalid Choice !");
			
		}
	}
		
	}
	

}
