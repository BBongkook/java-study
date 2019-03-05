package test00001;

class TTTtest{
	public int pr(int a, int b) {
		return a+b;
	}
}
class TTtest extends TTTtest{
	public int pr(int a, int b) {
		return a+b;
	}
}
public class Test extends TTtest{

	public static void main(String[] args) {
		Test T = new Test();
		System.out.println(T.pr(1, 2));
	}
}