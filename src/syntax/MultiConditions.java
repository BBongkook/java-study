package syntax;

public class MultiConditions {
	public static void main(String[] args) {
		int num1 = 1;
		int num2 = 4;
		
		if(num1==1 && num2==4 && num1==num2) {
			System.out.println("OK!");
		}else {
			System.out.println("Nope!");
		}
		
		if(num1==2 || num2==5) {
			System.out.println("OK!");
		}else {
			System.out.println("Nope!");
		}
	}
}