package oop;

public class ThisExam {
	int num = 10;
	
	void setNum(int num) {
		this.num = num;    // >> this.num 본 클래스의 num
	}
	int getNum() {
		return this.num;   // >> this.num 본 클래스의 num
	}
	
	public static void main(String[] args) {
		ThisExam te = new ThisExam();
		System.out.println(te.num);
		System.out.println(te.getNum());
		te.setNum(5);
		System.out.println(te.num);
		System.out.println(te.getNum());
	}
}
