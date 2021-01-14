
public class NestedLoops {

	public static void main(String[] args) 
	{
		int i=0;
		int count=0;
		while(i<4)
		{
			for(int j=0;j<5;j++) 
			{
				int k=0;
				do 
				{
					System.out.println(k);
					k++;
					count++;
				}while(k<6);
			}
			i++;
		}
		System.out.println("Count is "+count);

	}

}
