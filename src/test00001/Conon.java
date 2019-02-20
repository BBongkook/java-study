package test00001;

public class Conon {
	public static void main(String[] args) {
		//1부터 100까지 소수 찾기 메소드 따서 상수 true 아니면 false
//		소수는 1과 자기 자신밖에 나눠지지 않는수
//		예를들어 1,3,5,7,11,13,17 이수들이 
//		오면은 true
//		아니면 false
		
		int nums=0;

		for(int i=1; i<=100; i++) {
			
			for(int j=1; j<=100; j++) {
				if(i%j==1) {
					nums++;
				}
			}
			if(nums==2) {
				System.out.println(i+"=true");
			}
		}
	}
}
