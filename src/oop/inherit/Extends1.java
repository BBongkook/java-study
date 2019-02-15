package oop.inherit;

class Mother{
	int age = 55;
	String name = "송정숙";
	Mother(){
		System.out.println("난 엄마 생성자!");
	}
	
	void attack() {
		System.out.println("엄마가 등짝 스매싱 기술을 시전합니다.");
	}
}
/*class Father{
	int age = 10;
	String name = "가나다";
	
	Father(){
		System.out.println("매메메");
	}
	
	int test(int a) {
		System.out.println("메루돌우다류흊2");
		this.age=a;
		return this.age;
	}
}*/

public class Extends1 extends Mother
{
	Extends1(){
		System.out.println("난 확장 생성자!!");
		
	}
	public static void main(String[] args) {
		Extends1 e = new Extends1();
		System.out.println(e.age);
		
		
	}
}
