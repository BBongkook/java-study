package syntax;

public class ClassExam {
	int a = 1;
	char c = '1';
	String s = "1";
	
	void test() { // 앞에 static 이 없으면 ClassExam 꺼
		System.out.println("난 ClassExam꺼!");
	}
	
	public static void main(String[] args) {
		int a = 2;
		ClassExam ce = new ClassExam(); // ClassExam 호출하면 그때 알아먹는다.
		System.out.println(ce.a); // . 은 ce의 a
		System.out.println(ce.c); // . 은 ce의 c
		System.out.println(ce.s); // . 은 ce의 s
		
		ce.test();
		
	}
}
