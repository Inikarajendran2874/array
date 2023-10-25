package string;

public class sample {

	public static void main(String[] args) {
		String s1="Hi Inika";
		String s2=" We welcome you";
		System.out.println("without instance:"+s1);
		System.out.println("With instance:"+s2.length());
		System.out.println("first element:"+s2.charAt(5));
		System.out.println("position of element:"+s2.indexOf('6'));
		System.out.println("joining:"+s1.concat(s2));
		System.out.println("comparision:"+s1.compareTo (s2));
		System.out.println("equals or not:"+s1.equals("inika"));
		System.out.println("contains:"+s1.contains(s2));
		System.out.println("replacing two:"+s2.replaceAll(s2, s1));
	}

}
