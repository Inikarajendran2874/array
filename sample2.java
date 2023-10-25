package arrays;
import java.util.Scanner;
class Demo1
{
	int i,j,m,n;
	Scanner sc=new Scanner(System.in);
	int empid[][]=new int[2][2];
	void get1()
	{
		System.out.println("Enter the m and n value:");
		n=sc.nextInt();
		m=sc.nextInt();
		for(i=0;i<n;i++)
		{
			for(j=0;j<m;j++)
			{
				System.out.println("Enter the array value is:");
			empid[i][j]=sc.nextInt();
			}
			
		}
	}
	void get2()
	{
	
		for(i=0;i<n;i++)
		{
			for(j=0;j<m;j++)
			{
				System.out.println("Your array value is :"+empid[i][j]);
			}
			
		}
	}
	
}


public class sample2 {

	public static void main(String[] args) {
		Demo1 d1=new Demo1();
		d1.get1();
		d1.get2();
		
	}

}
