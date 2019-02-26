package collection.list;

import java.util.ArrayList;
import java.util.List;

class Cat{
	private String name;
	private int age;
	
	public Cat() {
		super();
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "Cat [name=" + name + ", age=" + age + "]";
	}
}

public class CatList {

	public static void main(String[] args) {
		Cat cat = new Cat();
		//System.out.println(cat);
		List<Cat> catList = new ArrayList<>();
		int num=0;
		for(int i=0; i<10; i++) {
			//고양이 이름은 냥이1~냥이10
			//나이는 랜덤으로 1살부터 30살까지
			cat = new Cat();
			cat.setName("냥이"+(i+1));
			cat.setAge((int)(Math.random()*29)+1);
			catList.add(cat);
		}
		for(int i=0; i<catList.size(); i++) {
			System.out.println(catList.get(i));
		}
	}// 반복문을 사용해서 위에서 생성된 고양이들을 출력해주세요.
}
