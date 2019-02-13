package syntax;

import java.util.Scanner;

public class GuGuDan {
	/*
	static void guGuDan(int receiveNum) {
		for(int i=1; i<=receiveNum; i++) {
			for(int j=1; j<10; j++) {
					System.out.print(i+"X"+j+"="+i*j+" ");
			}
			System.out.println();
		}
	}*/
	
	public static void main(String[] args) {
		
		for(int i=9; i>0; i--) {
			for(int j=9; j>0; j--) {
					System.out.print(i+"X"+j+"="+(i*j));
				if(j!=1) {
					System.out.print(",");
				}
			}
			System.out.println();
		}
	}
		/*Scanner scan = new Scanner(System.in);
		System.out.print("구구단 몇 단까지 출력 하겠습니까? : ");
		int number = scan.nextInt();
		guGuDan(number);
		*/
}
