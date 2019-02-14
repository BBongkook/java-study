package oop;

public class ThisExam2 {
	int num1;
	String str;
	
	ThisExam2(){} // 생성자 만들기
	
	ThisExam2(int num1, String str){ // 아래 main문 처럼 하면 
		this.num1=num1;				 // 생성자 안만들어짐
		this.str=str;
		System.out.println(this.num1); 
		System.out.println(this.str);
	}
	
	public static void main(String[] args) {
		ThisExam2 te2 = new ThisExam2(10,"abc");
		
	}
}
