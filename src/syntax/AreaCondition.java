package syntax;

public class AreaCondition {
	public static void main(String[] args) {
		int num1 = 10;
		
		if(num1==1) {
			System.out.println("num1은 1");
		}else if(num1<10) {
			System.out.println("num1 은 10보다 작다");
		}else if(num1>10) {
			System.out.println("num1 은 10보다 크다");
		}else {
			System.out.println("num1은 10이다.");
		}
	}
}
