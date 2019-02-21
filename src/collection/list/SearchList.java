package collection.list;

import java.util.ArrayList;

public class SearchList {
	public static void main(String[] args) {
		ArrayList<Integer> intList = new ArrayList<>();
		for(int i=1; i<=5; i++) {
			intList.add(i);
		}
		System.out.println(intList.indexOf(3)); // n의 인덱스 찾아줌
	}											// 나올수없는 인덱스는
}												// -1을 출력
