package exam.ex01;

public class Son extends Father{
	public String toString() {
		return "아들클래스";
	}
	public void printInfo() { // 상속되어 있는 Father에 이미 선언되어 있어
							  // 오버라이딩이 되어있어 데이터타입을 다르게 쓸수 없다.
		System.out.println("내소개를 시작하지~");
	}
}
