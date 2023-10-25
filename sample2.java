package java1;
import java.util.Scanner;
public class sample2 {
	int empid;
	String empname;
	Scanner sc=new Scanner (System.in);
	void input()
	{
		System.out.println("Enter the empid:");
		empid=sc.nextInt();
		System.out.println("Enter the empname:");
		empname=sc.next();
	}
    void display ()
    {
    	System.out.println("your empid is :"+empid);
    	System.out.println("your empname is :"+empname);
    }
	public static void main(String[] args) {
		sample s1=new sample();
		s1.input();
		s1.display();
		
	}

}
