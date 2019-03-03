package test00001;

class Person{
	private int perID;
	private int milID;
	
	public Person(int pID, int mID) {
		this.perID=pID;
		this.milID=mID;
	}
	public Person(int pID) {
		this.perID=pID;
		this.milID=0;
	}
	public void showInfo() {
		System.out.println("민번 : "+perID);
		if(milID!=0) {
			System.out.println("군번 : "+milID+'\n');
		}else {
			System.out.println("군번 없음 \n");
		}
	}
}

public class Overloading {

	public static void main(String[] args) {
		Person man = new Person(900617, 1072004980);
		Person woman = new Person(881027);
		man.showInfo();
		woman.showInfo();
	}
}
