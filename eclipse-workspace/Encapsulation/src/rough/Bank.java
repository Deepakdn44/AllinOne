package rough;

public class Bank {
	
	public int acnum = 123456;
	private int pinNum = 4567;
	private double balance = 100000;


	public void withdrawAmount(int accNum, int pin, int amount) {
		if(accNum==acnum &&  pin==pinNum) {
			if(amount<=balance) {
				balance = balance - amount;
				System.out.println("Amount withdrawl :"+amount);
			}else {
				System.out.println("Insufficient balance");
			}
		}else {
			System.out.println("Invalid credentials");
		}
		
	}
	
	public void updatePin(int accntNum, int oldPin, int newPin) {
		if(accntNum==acnum && oldPin==pinNum) {
			pinNum=newPin;
			System.out.println("Pin changed succesfully");
		}else {
			System.out.println("Invalid credentials");
		}
	}
	
	public double depositeAmt(int accntNum, int pin, int deposit) {
		if(accntNum==acnum && pinNum==pin) {
			balance = balance + deposit;
		}else {
			System.out.println("Invalid credentials");
		}
		return balance;
	}

}













