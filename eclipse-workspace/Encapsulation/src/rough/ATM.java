package rough;

public class ATM {

	public static void main(String[] args) {
		Bank obj = new Bank();
		obj.updatePin(123456, 4567, 2222);
		obj.withdrawAmount(123456, 2222, 1000);
		//obj.depositeAmt(123456, 2222, 100000);
	
	}
}