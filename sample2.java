package inheritance1;
import java.util.Scanner;
class B
{
	int cid;
	int cnum;
	String cname;
	Scanner sc = new Scanner(System.in);
	void get1()
	{
		System.out.println("enter cid is:");
		cid = sc.nextInt();
	}
	class D1 extends B
	{
		void get2()
		{
			System.out.println("enter cnum is:");
			cnum = sc.nextInt();
		}
	}
	class D2 extends B
		{
			void get3()
			{
				System.out.println("enter the cname is:");
				cname = sc.next();
			}
		}
	class D3 extends B
	{
		void get4()
		{
			System.out.println("enter cid is:"+cid+"enter cnum is:"+cnum+"enter cname is:"+cname);
		}
	}
}

public class sample2 {

	public static void main(String[] args) {
		D3 f1 = new D3();
		D2 f2 = new D2();
		D1 f3 = new D1();
		f1.get2();
		f2.get3();
		f3.get3();
		
	}

}
