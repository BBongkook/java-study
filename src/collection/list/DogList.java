package collection.list;

import java.util.ArrayList;
import java.util.List;

class Dog{
	private String name;
	private int age;
	
	public void setName(String name) {
		this.name=name;
	}
	public String getName() {
		return this.name;
	}
	
	public void setAge(Integer age) {
		this.age=age;
	}
	public int getAge() {
		return this.age;
	}
}
// dogList를 만들어서 반복문으로 1부터 10까지
// Dog를 총 10개 생성하여
// name => 강아지1~강아지10, age= 1~10
public class DogList {

	public static void main(String[] args) {
		List<Dog> dl = new ArrayList<>();

		for(int i=0; i<10; i++) {
			Dog d = new Dog();
			d.setAge(i+1);
			d.setName("강아지"+i);
			dl.add(d);
		}
		
		for(Dog d:dl) {
			System.out.println(d.getName());
			System.out.println(d.getAge());	
		}
	}
}


