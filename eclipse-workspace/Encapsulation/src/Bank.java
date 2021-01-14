
public class Bank 
{
	public int acntno = 12345;
	private int pin = 1234;
	private double balanceamt = 10000;
	
	public void WithdrawAmount(int act, int pinno, double amt)
	{
		if(acntno==act && pin==pinno)
		{
			if(amt<=balanceamt)
			{
				balanceamt=balanceamt-amt;
				System.out.println("Withdrawl successfull :"+amt);
			}
			else
			{
				System.out.println("Insuffucuent Balance!!");
			}
		}
		else
		{
			System.out.println("Invalid credentials!!!");
		}
	}
	public void UpdatePin(int act, int oldpin, int npin)
	{
		if(act==acntno && oldpin==pin)
		{
			pin=npin;
			System.out.println("Pin has been changed");
		}
		else
		{
			System.out.println("Invalid credentials!!!");
		}
	}
}
