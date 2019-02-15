package oop.inherit;

public class Final {
	final int num;		// final 상수(처음 값을 넣고 난뒤에는 값을 변경할수 없다.)
	Final(){
		num=3;			// 반드시 사용하기 전에 값을 초기화 해줘야 한다.
	}
						
	public static void main(String[] args) {
		Final f = new Final();
		System.out.println(f.num);
		//f.num = 3;		// 값 변경 불가능
	}
}
