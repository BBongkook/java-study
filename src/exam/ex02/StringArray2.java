package exam.ex02;

public class StringArray2 {

	public String[] strs;
	
	public static void main(String[] args) {
		StringArray2 sa1 = new StringArray2();
		StringArray2 sa2 = new StringArray2();
		
		sa1.strs = new String[10];
		sa2.strs = new String[10];
		
	
		//input
		for(int i=0; i<sa1.strs.length; i++) {
			sa1.strs[i]=(i+1)+"";
		}
		for(int i=0; i<sa2.strs.length; i++) {		
			sa2.strs[i]=(10-i)+"";
		}
		
		//output
		for(int i=0; i<sa1.strs.length; i++) {
			System.out.println("sa1.strs["+i+"]="+sa1.strs[i]);
		}
		
		System.out.println();
		
		for(int i=0; i<sa2.strs.length; i++) {					
			System.out.println("sa2.strs["+i+"]="+sa2.strs[i]);
		}
	}
}
