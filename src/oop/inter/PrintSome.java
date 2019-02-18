package oop.inter;

public interface PrintSome {
	public void printString(String str);  // 인터페이스 안에서 메서드 앞에 쓸수 있는 
	public void printChar(char c);		   // 접근제어자는 Public 밖에 없다.
	public void printInt(int num);		   // 안쓰면 기본 Public 이다.
}
