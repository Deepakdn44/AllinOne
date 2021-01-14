package pkg1;

public class Test {

	public static void main(String[] args) 
	{
		Sample obj = new Sample();
		System.out.println(obj.publicvariable);
		System.out.println(obj.privatevariable);// -- private variable only we can use inside the class
		System.out.println(obj.protectedvariable);
		System.out.println(obj.defaultvariable);
	}

}
