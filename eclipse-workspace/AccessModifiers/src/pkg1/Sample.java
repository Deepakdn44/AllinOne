package pkg1;

public class Sample 
{
	public int publicvariable = 10;
	private int privatevariable = 20;
	protected int protectedvariable = 30;
	int defaultvariable = 40;
	public static void main(String[] args) 
	{
		Sample obj = new Sample();
		System.out.println(obj.publicvariable);
		System.out.println(obj.privatevariable);
		System.out.println(obj.protectedvariable);
		System.out.println(obj.defaultvariable);
	}

}
