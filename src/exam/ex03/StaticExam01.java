package exam.ex03;

public class StaticExam01 {
	public static String name = "하하";
	public String name1 = "호호";
	
	public static void test() {
		System.out.println(StaticExam01.name);
		
	}
	public static void main(String[] args) { // 모든 클래스 는 스태틱
		StaticExam01 se = new StaticExam01();
		se.name = "히히";			 
		se.name1 = "허허허허허";
		se = new StaticExam01();
		System.out.println(se.name);
		System.out.println(se.name1);
	}
}
