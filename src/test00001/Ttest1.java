package test00001;

public class Ttest1 {

	public int[] sortArray(int[] nums) {
		int numsArray[] = nums;
		int tmp=0;
		for(int i=0; i<numsArray.length; i++) {
			for(int j=0; j<numsArray.length; j++) {
				if(numsArray[i]<numsArray[j]) {
					tmp = numsArray[i];
					numsArray[i]=numsArray[j];
					numsArray[j]=tmp;
				}
			}
		}
		return nums;
	}
	
}
