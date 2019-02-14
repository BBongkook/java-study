package oop;

public class ClassExam2 {
	String[] strs;
	int num;
	double db;
	boolean bl;
	char c;
	
	public static void main(String[] args) {
		ClassExam2 ce2 = new ClassExam2();
		System.out.println(ce2.strs); // null  기본값으로 모두 초기화
		System.out.println(ce2.num); // 0
		System.out.println(ce2.db); // 0.0
		System.out.println(ce2.bl); // false
		System.out.println(ce2.c); // 빈문자
								   // 레퍼런스 데이터타입은 null
		//ce2.strs = new String[3];
		//System.out.println(ce2.strs[0]);
	}
}
