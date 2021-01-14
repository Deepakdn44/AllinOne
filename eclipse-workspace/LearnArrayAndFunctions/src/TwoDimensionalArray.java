
public class TwoDimensionalArray {

	public static void main(String[] args) 
	{
		int rows = 4;
		int cols = 5;
		int two[][] = new int[rows][cols];
		System.out.println(two.length);
		System.out.println(two[0].length);
		two[0][0] = 10;
		two[0][1] = 11;
		two[0][2] = 12;
		two[0][3] = 13;
		two[0][4] = 14;
		
		two[1][0] = 20;
		two[1][1] = 21;
		two[1][2] = 22;
		two[1][3] = 23;
		two[1][4] = 24;
		
		two[2][0] = 30;
		two[2][1] = 31;
		two[2][2] = 32;
		two[2][3] = 33;
		two[2][4] = 34;
		
		two[3][0] = 40;
		two[3][1] = 41;
		two[3][2] = 42;
		two[3][3] = 43;
		two[3][4] = 44;
		
		for(int i=0;i<two.length;i++)
		{
			for(int j=0;j<two[0].length;j++)
			{
				System.out.print(" "+two[i][j]);
			}
			System.out.println(" ");
		}
	}

}
