package com.encapsulation;

public class Bank {

	public int accountNo = 123456;
	private int pinNo = 1234;
	private double balanceAmount = 100000;
	
	public void withdrawAmount(int acntno, int pin, double amount) {
		if(acntno==accountNo && pin==pinNo) {
			if(amount<=balanceAmount) {
				balanceAmount = amount - balanceAmount;
				System.out.println("Amount withdraw succesful   "+amount);
			}else {
					System.out.println("Insufficient Balance!!..");
				}
				
		}else {
			System.out.println("Invalid credentials!!!!....");
		}
	}
	public void updatePin(int acntNo, int oldpin, int newpin) {
		if(acntNo==accountNo && oldpin==pinNo) {
			pinNo = newpin;
			System.out.println("Pin changed successfully");
		}else {
			System.out.println("Invalid credentials!!!");
		}
	}
	public double deposit(int acntNo, int pin, double amount) {
		if(acntNo==accountNo && pin==pinNo) {
			balanceAmount = balanceAmount + amount;
		}else {
			System.out.println("Invalid credentials");
		}
		return balanceAmount;
	}
}
