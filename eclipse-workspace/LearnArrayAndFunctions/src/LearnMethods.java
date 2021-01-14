
public class LearnMethods {

	public int add(int a,int b) 
	{	
		int sum=a+b;
		return sum;
	}
	public int subs(int a,int b) 
	{
		int sub=a-b;
		return sub;
	}
	public int mult(int a,int b) 
	{
		int mul=a*b;
		return mul;
	}
	public int div(int a,int b) 
	{
		int div = a/b;
		return div;
	}
	public static void main(String[] args) 
	{
		LearnMethods lm = new LearnMethods();
		int add=lm.add(4, 4);
		int sub=lm.subs(4, 4);
		int mul=lm.mult(4, 4);
		int div=lm.div(4, 4);
		System.out.println("Addition of two numbers is :"+add);
		System.out.println("Substraction of two numbers is :"+sub);
		System.out.println("Multiplication of two numbers is :"+mul);
		System.out.println("Division of two numbers is :"+div);


		
	}

}
