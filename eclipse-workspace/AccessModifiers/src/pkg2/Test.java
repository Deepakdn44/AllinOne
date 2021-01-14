package pkg2;

import pkg1.Sample;

public class Test extends Sample{

	public static void main(String[] args) 
	{
		Test obj = new Test();
		System.out.println(obj.publicvariable);
		System.out.println(obj.privatevariable);
		System.out.println(obj.protectedvariable);// Protected can be access in another package with an inheritance property
		System.out.println(obj.defaultvariable);
		
	}

}
