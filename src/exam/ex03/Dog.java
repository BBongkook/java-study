package exam.ex03;

public class Dog {
	private String name;
	private int age;
	
	public void setName(String name) {
		this.name=name;
	}
	public String getName() {
		return this.name;
	}
	public void setAge(int age) {  // get/set 메소드
		this.age=age;			   // set 은 세터메소드
	}							   // set 은 게터메소드
	public int getAge() {		   // 모든 멤버변수는 private
		return this.age;		   // 메소드도 private 다른 클래스 참조는 public
	}
	public static void main(String[] args) {
		Dog d = new Dog();
		d.name="카드";
		//d.back();
		d.setAge(10);
		System.out.println(d.age);
	}
}
