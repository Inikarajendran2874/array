package inheritance;
import java.util.Scanner;
class B
{
	int empid;
	String empname;
	Scanner sc=new Scanner(System.in);
	void get1()
	{
		System.out.println("Enter the empid is:");
		empid=sc.nextInt();
	}
class D1 extends B
{
	void get2()
	{
		System.out.println("Enter the empname is:");
		empname=sc.next();
	}
}
class D2 extends B
{
	void get3()
	{
		System.out.println("the empid is:" +empid);
		System.out.println("the empname is"+empname);
	}
}
public class sample{
	public void main(String[] args) {
		D1 f1 = new D1();
		f1.get1();
		f1.get2();
		D2 f2 = new D2();
		f2.get3();
	}
		
	}
}