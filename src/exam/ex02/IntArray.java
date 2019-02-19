package exam.ex02;

public class IntArray {
	public int[] nums = new int[10];
	
	public boolean compare(int num) {
		for(int i=0; i<nums.length; i++) {
			if(nums[i]==0) return false;
			
			if(nums[i]==num) return true;
		}
		return false;
	}
	
	public static void main(String[] args) {
		IntArray ia = new IntArray();

		int num=0; 
		
		for(int i=0; i<ia.nums.length; i++) {
			num=(int)(Math.random()*10)+1;
			if(ia.compare(num)) {
				i--;
			}else {
				ia.nums[i]=num;
			}
			//System.out.println(ia.nums[i]);
		}
		
		
		int tmp=0;
		
		for(int i=0; i<ia.nums.length; i++) {
			for(int j=i+1; j<ia.nums.length; j++) {
				if(ia.nums[i]>ia.nums[j]) {
					tmp=ia.nums[i];
					ia.nums[i]=ia.nums[j];
					ia.nums[j]=tmp;
				}
			}
		}
		for(int i=0; i<ia.nums.length; i++) {
			System.out.println("ia.nums["+i+"]="+ia.nums[i]);
		}
	}
}
