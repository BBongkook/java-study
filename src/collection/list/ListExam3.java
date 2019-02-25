package collection.list;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class ListExam3 {

	public static void main(String[] args) {
		List<String> al = new ArrayList<>();		//세가지 Array 다 List를 구현받고 있다.
		List<String> ll = new LinkedList<>();		// implements
		List<String> v = new Vector<>();
		
		System.out.println(al);
		System.out.println(ll);
		System.out.println(v);		
		al.add("1");
		ll.add("1");
		v.add("1");	
		System.out.println(al); 	// 같은 표준인 List를 보고 만들어졌다.
		System.out.println(ll);
		System.out.println(v);
		
	}
}
