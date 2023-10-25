package looping1;
import java.util.Scanner;

public class forloop {

		int i,j,m,n;
		Scanner sc=new Scanner(System.in);
	void input()
	{
		System.out.println("Enter the m and n value:");
		n = sc.nextInt();
		m = sc.nextInt();
		
	}
	void display()
	{
		for(i=0;i<n;i++)
		{
			for(j=0;j<m;j++)
			{
				System.out.println("I value is :"+i);
				System.out.println("J value is :"+j);
			}
			
		}
		  
	}
	public static void main(String[] args) {
		forloop f1=new forloop();
		f1.input();
		f1.display();
	}

}
