package com.oops.java;

class Account{
	int accno;
	String name;
	float amount;

void insert(int accno, String name, float amount) {
	this.accno=accno;
	this.name=name;
	this.amount=amount;
}

void deposit(int amt) {
	amount=amount+amt;
	System.out.println("Amount added:" +amt   );
	System.out.println("Total balance:"+amount);
	
}

 void withdraw(int amt) {
	
	 if(amount<amt) {
		 System.out.println("Insufficeient balance");
	 }else {
		 amount= amount-amt;
		 System.out.println("Amount Withdraw:" +amt);
		 System.out.println("Total Balance after withdrawl in the account:" +amount);
	 }
 }
  void display() {
	  System.out.println(accno+" "+name+" "+amount);
  }
	 void checkBalance() {
		 System.out.println(" Present Balance in the account"  +    amount);
	 }
 }

public class TestAccount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Account a1 = new Account();
a1.insert(1111, "McCullumn", 1000);
a1.display();
a1.deposit(2000);
a1.withdraw(500);
a1.checkBalance();

	}
}
