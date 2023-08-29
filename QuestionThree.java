package com.cozentus.AbstractQuestions;

abstract class BankAccount{
	abstract void deposit();
	abstract void withdraw();
}

class SavingsAccount extends BankAccount{
	void deposit() {
		System.out.println("Deposit method of Savings");
	}
	void withdraw() {
		System.out.println("Withdraw method of Savings");
	}
}

class CurrentAccount extends BankAccount{
	void deposit() {
		System.out.println("Deposit method of Current");
	}
	void withdraw() {
		System.out.println("Withdraw method of Current");
	}
}

public class QuestionThree {
	public static void main(String [] args) {
		SavingsAccount sa = new SavingsAccount();
		CurrentAccount ca = new CurrentAccount();
		sa.deposit();
		sa.withdraw();
		ca.deposit();
		ca.withdraw();
	}
}
