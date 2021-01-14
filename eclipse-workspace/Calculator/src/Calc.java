
public class Calc {
	int i=10;
	static int j=20;

	public static void main(String[] args) 
	{
		System.out.println("Call go method");
		Calc c=new Calc();
		c.go();
		go1();
	}
public void go()
{
	System.out.println("Called Go method");
	go2();
}
public static void go1() 
{
	System.out.println("Called Go1 method");
	
}
public void go2() 
{
	System.out.println("Called Go2 method");
	go1();
	
}

}
