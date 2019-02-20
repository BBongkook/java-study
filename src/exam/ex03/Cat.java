package exam.ex03;

public class Cat {
	public String name;
	public int age;
	
	public String toString() {
		return "이 고양이의 이름은 " + name + "이구요, 나이는 " + age+"입니다";
		// println()을 호출하면 Object의 toString()으로 보낸다.
		// 하지만 오버라이딩을 해서 Cat에 있는 toString() 이 실행된다.
	}
	public static void main(String[] args) {
		Cat[] c1 = new Cat[3];
		
		for(int i=0; i<c1.length; i++) {
			c1[i] = new Cat();
			c1[i].name="이름"+(i+1);
			c1[i].age=i;
		}
		for(int i=0; i<c1.length; i++) {
			System.out.println("c1["+i+"].name="+c1[i].name);
			System.out.println("c1["+i+"].age="+c1[i].age);
			System.out.println(c1[i]);
		}
	}
}
