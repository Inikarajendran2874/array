package looping1;

public class patern2 {
	public static void main (String[] args) 
	{
		int n=6;
		for(int i=n;i>=0;i--)
		{
			for(int j=0;j<=i;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
