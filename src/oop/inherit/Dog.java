package oop.inherit;

public class Dog extends Animal{
	Dog(int age, String type){
		this.age = age;
		this.type = type;
	}
	public static void main(String[] args) {
		Dog dog = new Dog(6,"푸들");
		dog.eat();
		dog.sleep();
		dog.run();
	}
}
