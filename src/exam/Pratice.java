package exam;

import java.util.Scanner;

class Dog{
	String name;
	int age;
}
class Cat{
	String name;
	int age;
}
class Food{
	String food;
}
public class Pratice {
	public static void main(String[] args) {
		
		Dog[] dg = new Dog[5];
		Cat[] ct = new Cat[5];
		Food[] fd = new Food[5];
		
		for(int i=0; i<5; i++) {
			dg[i] = new Dog();
			ct[i] = new Cat();
			fd[i] = new Food();
		}
		Scanner scan1 = new Scanner(System.in);
		Scanner scan2 = new Scanner(System.in);
		
		for(int i=0; i<dg.length; i++) {
			System.out.print(i+1+" 번째 개 이름을 입력하세요: ");
			dg[i].name = scan1.nextLine();
			System.out.print(i+1+" 번째 개 나이를 입력하세요: ");
			dg[i].age = scan2.nextInt();
		}
		
		for(int i=0; i<dg.length; i++) {
			System.out.println(i+1 + " 번째 개이름은" +dg[i].name+ "이고 나이는 : " + dg[i].age);
		}
	}
}
