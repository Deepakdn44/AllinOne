package com.encapsulation;

public class ATM {

	public static void main(String[] args) {
		Bank obj = new Bank();
		obj.updatePin(123456, 1234, 2222);
		obj.withdrawAmount(123456, 1234, 1000);
		double balanceamount = obj.deposit(123456, 2222, 50000);
		System.out.println(balanceamount);
	}

}
