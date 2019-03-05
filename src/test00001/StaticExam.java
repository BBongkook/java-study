package test00001;

public class StaticExam{
	static String STR = "1";
	public static void main(String[] args) {
		StaticExam se2;
		se2.STR = "111";
		System.out.println(StaticExam.se2);
		StaticExam se = new StaticExam();
		System.out.println(StaticExam.se2);
		se.STR = "333";
		System.out.println(StaticExam.se2);
	}
}
