package oop.inherit;

class GrandFather {
	GrandFather(){
	
	}
	void work() {
		System.out.println("할아버지가 농사를 짓습니다.");
	}
}

class Father extends GrandFather {
	Father(){
		super.work(); 
	}

	void work() {
				// 할아버지 work() 를 출력
		System.out.println("아빠가 일함.");
		
	}
}
public class Son extends Father {
	Son(){
		super.work();
		this.work();
	}
	void work() {  				// 오버라이딩 아빠꺼 위에 아들게 올라타다.
		          				// 아빠 work() 를 출력
		System.out.println("아들이 공부함");
	}
	public static void main(String[] args) {
		Son s = new Son();
		
	}
}
