package arrays;

public class sample3 {
	
	enum data{info1(100),info2(200)};
	public int h;
	data (int f1)
	{
		h=f1;
		System.out.println("****"+f1);
	}

	public static void main(String[] args) {
		data g1=data.info2 ;
		g1.display;
		
	}

}
