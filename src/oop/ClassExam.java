package oop;

public class ClassExam {
	int[] nums = new int[10];
	String str = "abc";
	
	public static void main(String[] args) {
		ClassExam ce = new ClassExam();
		
		for(int i=1; i<=ce.nums.length; i++) {
				ce.nums[i-1] = i*10;	
			}
		for(int j=0; j<ce.nums.length; j++) {
			System.out.println(ce.nums[j]);
		}
	}
}
