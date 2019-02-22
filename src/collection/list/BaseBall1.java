package collection.list;

import java.util.ArrayList;
import java.util.Scanner;

public class BaseBall1 {

	public static void main(String[] args) {
		ArrayList<Integer> numList = new ArrayList<>();
		for(int i=0; i<3; i++) {
			int ranNum = (int)(Math.random()*9)+1;
				if(numList.indexOf(ranNum)>=0) {
					i--;
				}
				else numList.add(ranNum);
			
		}
		System.out.println("numList : " + numList);
		int[] nums = new int[3]; // 초기화 할때만 가능
		
		Scanner scan = new Scanner(System.in);
		System.out.print(", 를 기준으로 3개 입력 : ");
		String str = scan.nextLine();
		String[] strs = str.split(",");
		
		for(int i=0; i<nums.length; i++) {
			nums[i]=Integer.parseInt(strs[i]);
		}
	
		int sCnt=0, bCnt=0;
		
		for(int i=0; i<nums.length; i++) {
			if(numList.indexOf(nums[i])!=-1) {
				if(numList.get(numList.indexOf(nums[i]))==nums[numList.indexOf(nums[i])]){
					sCnt++;
				}
				else {
					bCnt++;
				}	
			}
		}
		if(sCnt+bCnt==0) {
			System.out.println("아웃");
		}else System.out.println(sCnt+"S"+bCnt+"B");
	}
}
