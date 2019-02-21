package collection.list;

import java.util.ArrayList;

public class ListExam {

	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<>(); // <> 다이아몬드
					// 방 추가하면서 10을 넣는다. // String 선언
		 			// 방 추가하면서 20을 넣는다.
					// ArrayList는 구성원타입이 
					// Object라 아무거나 다 넣을수있다.
		al.add("abc");

		
		System.out.println(al.size());
		al.remove(0); // 번 인덱스 하나 삭제
		System.out.println(al.size());
		
		ArrayList<Integer> numList = new ArrayList<>(); 
		numList.add(1);						 // 원시형 데이터타입은 안됨
	}										 // ex) int, long, double
}											 // Integer 이런건됨
