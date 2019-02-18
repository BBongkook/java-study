package test00001;

public class Overlloading {
	
	static void goHome(String str) {
		System.out.println("카카오톡을 한다");
	}
	static void goHome(int cash, String str) {
		System.out.println("카카오톡 " + str + " 쓸수 있다"); 
	}
	static String goHome(String target, String strMessage) {
		return "답을 기다립니다.";
	}
	
	public static void main(String[] args) {	
		goHome("스마트폰");
		goHome(2000, "프렌즈이모티콘");
		System.out.println(goHome("박경훈","선생님 도와주세요"));
	}
}
