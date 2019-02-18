package test00001;

class Global{
	void capital() {
		System.out.println("세계");
	}
}
class SouthKorea extends Global{
	void capital() {
		//super.capital();
		System.out.println("대한민국");
	}
}
public class SeoulCity extends SouthKorea{
	void capital() {
		//super.capital();
		System.out.println("서울");
	}
	public static void main(String[] args) {
		SeoulCity se = new SeoulCity();
		se.capital();
	}
}
