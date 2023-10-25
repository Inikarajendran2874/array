package operators;
import java.util.Scanner;
class demo
{
	int a1,b1;
	Scanner sc= new Scanner(System.in);
	void arithmeticOPerator()
	{
		System.out.println("Enter the value:");
		a1=sc.nextInt();
		b1=sc.nextInt();
		System.out.println("Addition:" + (a1+b1));
		System.out.println("Subraction:" +(a1-b1));
		System.out.println("Multiplication"+ (a1*b1));
	}
	void relationalOperator()
	{
		System.out.println("Less than:" + (a1<b1));
		System.out.println("Lessthan or equalto"+(a1<=b1));
		System.out.println("Equal to"+(a1==b1));
	}
	void logicalOperator()
	{
		System.out.println("LogicalAND:"+((a1<b1)&&(b1>a1)));
		System.out.println("LogiclOR"+((a1>b1)||(b1>a1)));
		
	}
	
}

public class sample4 {

	public static void main(String[] args) {
		{
			demo f1=new demo();
			f1.arithmeticOPerator();
			f1.relationalOperator();
			f1.logicalOperator();
		}

	}

}
