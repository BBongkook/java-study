package exam.ex03;

public class MethodExam01 {
	public String name ="홍길동"; // 스태틱이 아니기 때문에 생성자 호출
	
	public static void setTest(MethodExam01 me1) {
		me1 = new MethodExam01(); // 8줄에서 끝난다.
		System.out.println(me1.name);
	}
	public static void main(String[] args) {
		MethodExam01 me = new MethodExam01();
		me.name="임꺽정";
		MethodExam01.setTest(me);	// 클래스 메소드는 스태틱 메소드
		System.out.println(me.name);
	}
}
