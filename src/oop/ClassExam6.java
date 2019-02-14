package oop;

import java.util.Scanner;

public class ClassExam6 {
	int[] nums;
	
	ClassExam6(int num){
		nums=new int[num];
	}
	
	public static void main(String[] args) {
	
		Scanner scan = new Scanner(System.in);
		
		System.out.print("방 개수를 입력하시오 : ");
		int se = scan.nextInt();
		ClassExam6 ce6 = new ClassExam6(se);
		System.out.println("방의 개수는 : " + ce6.nums.length);
	}
}
