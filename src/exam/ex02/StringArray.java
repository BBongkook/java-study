package exam.ex02;

import java.util.Scanner;

public class StringArray {

	public StringArray(){
		strs = new String[5];
	}
	public String[] strs;
	
	public static void main(String[] args) {
		StringArray sa = new StringArray();
		System.out.println("5개의 글자를 , 를 기준으로 입력해주세요.");
		
		Scanner scan = new Scanner(System.in); // Scanner는 기본 생성자가 없다.
											   // 파라미터를 넣어줘야 한다.
											   // System.in in인 변수이고 Static
											   // 메모리leak 열어둔걸 닫아줘라
		String input = scan.nextLine();
		System.out.println(input);
		sa.strs = input.split(",");			   // ,로 나눠준다. split의 데이터타입 String배열
		//System.out.println(sa.strs[0]);
		System.out.print("검색할 단어를 입력해주세요 : ");
		String search = scan.nextLine();
		
		for(int i=0; i<sa.strs.length; i++) {
			if(sa.strs[i].equals(search)) {
				System.out.println("sa.strs["+i+"] ="+sa.strs[i]);
			}
		}
//		for(int i=sa.strs.length-1; i>=0; i--) {
//			System.out.println("sa.strs["+i+"] ="+sa.strs[i]);
//		}
		scan.close(); 						   // scan 닫기
	}
}
