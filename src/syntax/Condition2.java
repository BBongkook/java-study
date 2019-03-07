package syntax;

public class Condition2 {
	public static String getStr() {
		return "ABC"; 
	}
	public static void main(String[] args) {
		int a = 4;
		/*
		 * String str = "a는 3이 아니다";
		 * if(a==3) { str = "a는 3이다"; }
		 */
		String str = (a==3)?"a는 3이다.":"a는 3이아니다.";
		System.out.println(str);	// 맞으면 앞 틀리면 뒤
	
		String s1 = "Dog";
		System.out.println(s1.toLowerCase().equals("dog"));
								// s1 값을 toLowerCase 소문자로 변환
		System.out.println(s1.equalsIgnoreCase("dog"));
								// s1 값을 equalsIgnoreCase 대소문자 무시
		s1.toLowerCase().equals("dog");
		
		String str1 = getStr();
		System.out.println(str1);
		System.out.println(str1.toLowerCase());
		System.out.println(str1);
		str1 = str1.toLowerCase();
		System.out.println(str1.toLowerCase().equals("abc"));
	}
}
