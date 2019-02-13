package syntax;

public class ThreeSixNine {
	public static void main(String[] args) {
		for(int i=0; i<10; i++) {
			if(i==3 || i==6 || i==9) {
				System.out.print(" 짝 ");
			}else
				System.out.print(" "+i+" ");
		}
	}
}
