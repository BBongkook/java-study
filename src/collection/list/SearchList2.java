package collection.list;

import java.util.ArrayList;
import java.util.Scanner;

public class SearchList2 {

	public static void main(String[] args) {
		ArrayList<Integer> numList = new ArrayList<>();
		for(int i=0; i<5; i++) {
			int ranNum = (int)(Math.random()*20)+1;
			numList.add(ranNum);
		}
		Scanner scan = new Scanner(System.in);
		System.out.println("맞출번호를 ,를 기준으로 입력해주세요 : ");
		String strNum = scan.nextLine();
		String[] strNums = strNum.split(",");
		ArrayList<Integer> anList = new ArrayList<>();
		for(int i=0; i<strNums.length; i++) {
			int num = Integer.parseInt(strNums[i]);
			anList.add(num);
		}
		int num=0;
		for(int i=0; i<numList.size(); i++) {
			for(int j=0; j<anList.size(); j++) {
				if(numList.get(i)==anList.get(j)) {
					num++;
				}
			}
		}
		System.out.println(numList);
		System.out.println(anList);
		System.out.println("맞춘 개수 : "+num);
		
		//System.out.println(anList); // ArrayList 는 오버라이딩이 되어있다.
	}								  // 메모리 주소값이 나오지 않아
}
