package oop;

public class ClassExam3 {
	int num = 1;
	
	void setNum() {
		System.out.println(num);
	}
	int getNum() {
		return num;
	}
	
	public static void main(String[] args) {
		ClassExam3 ce3 = new ClassExam3(); // 기본생성자
		System.out.println(ce3.num);
		ce3.num=5;
		System.out.println(ce3.getNum());
		ce3.setNum();
	}
}
