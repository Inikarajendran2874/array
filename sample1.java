package arrays;
import java.util.Scanner;
class Demo
{
	int n;
	int empid[]=new int[5];
	Scanner sc=new Scanner (System.in);
	void get1()
	{
		System.out.println("Enter the n value:");
		n=sc.nextInt();
		for(int i=0;i<n;i++)
		{
			System.out.println("Enter the array value:");
			empid[i]=sc.nextInt();
		}
		
	}
	void get2()
	{
		for(int i=0;i<n;i++)
		{
			System.out.println("Array value is:"+ empid[i]);
		}
	}
	
}


public class sample1 {

	public static void main(String[] args) {
		Demo d1=new Demo();
		d1.get1();
		d1.get2();
		
	}

}
