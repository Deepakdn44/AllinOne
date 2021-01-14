
public class IfElse {

	public static void main(String[] args) 
	{
		int num= (int)(Math.random()*20);
			System.out.println(num);
			if(num==10)
				System.out.println(num+" Number is equal to 10");
			else
				if(num>10)
					System.out.println(num+" Number is greater than 10");
				else
					System.out.println(num+" Number is less than 10");
	}

}
