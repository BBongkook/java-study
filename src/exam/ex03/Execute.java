package exam.ex03;

public class Execute {

	public static void main(String[] args) {
		Dog[] dogs = new Dog[10];
		
		for(int i=0; i<dogs.length; i++) {
			dogs[i]=new Dog();
			dogs[i].setName(i+"로");
			dogs[i].setAge(i+1);
		}
	
		for(int i=0; i<dogs.length; i++) {
			System.out.println(i+"번째  개이름: "+dogs[i].getName());
			System.out.println(i+"번째  개나이: "+dogs[i].getAge());
			System.out.println();
		}	
	}
}
