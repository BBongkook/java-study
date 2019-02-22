package collection.list;

import java.util.ArrayList;
import java.util.Scanner;

public class SearchList3 {
	public static void main(String[] args) {
		ArrayList<Integer> numList = new ArrayList<>();
		for(int i=0; i<6; i++) {
			numList.add((int)(Math.random()*45)+1);
		}
		
		System.out.println(numList);
		
		Scanner scan = new Scanner(System.in);
		System.out.print(", 기준으로 6개 값을 입력해주세요 : ");
		String numStr = scan.nextLine();
		String[] nums = numStr.split(",");
		System.out.println("입력하신 숫자는 : "+nums);
		
		int cnt=0;
		for(int i=0; i<6; i++) {
			if(numList.indexOf(Integer.parseInt(nums[i]))!=-1) {
				cnt++;
			}
		}
		System.out.println("맞춘 개수는 : "+cnt);
	}
}
