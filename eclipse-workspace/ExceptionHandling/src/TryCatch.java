
public class TryCatch {

	public static void main(String[] args) 
	{
		int i,j,k;
		i=8;
		j=1;
		k=i+j;
		try 
		{
			if(k<10)
			{
				throw new Exception();
			}	
			
		}
		catch(Exception e)
		{
			System.out.println("Mininum op is 10");
		}
	}

}

