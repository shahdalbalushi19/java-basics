package com.training;

public class Account {
		 protected int accountNumber;
		    protected String customerName;
		    protected double balance;
		    //constructor now 
		    public Account(int accountNumber, String customerName, double balance) {
		        this.accountNumber = accountNumber;
		        this.customerName = customerName;
		        this.balance = balance;
	}

			public int getAccountNumber() {
				return accountNumber;
			}

			public void setAccountNumber(int accountNumber) {
				this.accountNumber = accountNumber;
			}

			public String getCustomerName() {
				return customerName;
			}

			public void setCustomerName(String customerName) {
				this.customerName = customerName;
			}

			public double getBalance() {
				return balance;
			}

			public void setBalance(double balance) {
				this.balance = balance;
			}
			// deposit
		public void deposit(double amount) {
			        balance += amount;
			        System.out.println(amount + " deposited successfully");
			        //balance = balance +amount
			    }
		
		// withdraw
	    public void withdraw(double amount) {
	        if (amount <= balance) {
	            balance -= amount;
	            System.out.println(amount + " withdrawn successfully.");
	        } else {
	            System.out.println("Lack of balance");
	           
	        }
	    }
	    // Display balance 
	    public void displayBalance() {
	        System.out.println("Account Balance: " + balance);
	    }
}
	    
	

// Interface: 100% abstract
