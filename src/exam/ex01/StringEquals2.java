package exam.ex01;

public class StringEquals2 {
	String str = "1";
	//String str = new String("1"); 이럴경우 false
	
	public static void main(String[] args) {
		StringEquals2 se1 = new StringEquals2();
		System.out.println(se1.str);
		StringEquals2 se2 = new StringEquals2();
		System.out.println(se1.str==se2.str);
		se2.str = "2";
		System.out.println(se1.str==se2.str);
		
		StringEqual se = new StringEqual();
		System.out.println(se1.str==se.str);
	}
}
