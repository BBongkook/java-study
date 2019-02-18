package exam.ex01;

public class Executer {
	public static void main(String[] args) {
		Object f = new Father();
		System.out.println(f.toString());
		
		Object f1 = new Father();
		Son s = new Son();
		Father f2 = new Father();
		f2 = new Son(); // extends, implements 면 대입할수 있다.
						// Son이 Father 를 상속 받고 있어서 가능한것
		
		Object obj = new Son();
		Father f3 = new Father();
		Son s1 = new Son();
		
		f3.printInfo();
		s1.printInfo();
		
		Object[] objs = new Object[3];
		objs[0] = obj;
		objs[1] = f3;
		objs[2] = s1;
		
//		Father f4 = (Father)objs[1];  <---- ((Father)objs[1]).printInfo(); 함축한것
//		f4.printInfo();
		
		((Father)objs[1]).printInfo(); // 캐스팅 해주면 가능
		
	}
}
