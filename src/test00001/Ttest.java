package test00001;

public class Ttest {

	public static void main(String[] args) {
		
		Ttest1 t1 = new Ttest1();
		int tmpNum=0;
		int[] numsArray = new int[10];
		int[] numsArray1 = new int[10];
		
		for(int i=0; i<10; i++) {
			tmpNum=(int)(Math.random()*30)+1;
			if(numsArray[i])
			numsArray[i]=tmpNum;
		}
		numsArray1=t1.sortArray(numsArray);
		
		for(int i=0; i<numsArray1.length; i++) {
			System.out.print(numsArray1[i]+", ");
		}
	}
}
