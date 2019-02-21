package syntax;

public class Loop3 {
	public static void main(String[] args) {
		int[] nums = new int[10];
		for(int i=0; i<nums.length; i++) {
			nums[i] = i;
		}
		
		for(int i=0; i<nums.length; i++) {
			System.out.print(nums[i]);
		}
		
		for(int num:nums) { // 받는 데이터타입은 구성원의 데이터타입
			System.out.print(num);
		}
	}
}
