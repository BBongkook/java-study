package method;

public class VoidMethod {
	
	static void test(int startNum, int endNum) {
		for(int i=startNum;i<=endNum;i++) {
			System.out.println(i);
		}
	}
	public static void main(String[] args) {
		test(10,30); // void : 넘기지 않으면 대입 할 수 없다.
					 // ex) String str = test(10,30);
	}
}
