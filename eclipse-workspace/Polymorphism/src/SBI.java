
public class SBI extends RBI{

	public static void main(String[] args) 
	{
		RBI obj1 = new SBI();// Polymorphic reference
		SBI obj = new SBI();
		System.out.println(obj.getHomeROI());
		System.out.println(obj1.getObject());
	}
	public double getHomeROI()
	{
		return 9;
	}

}
