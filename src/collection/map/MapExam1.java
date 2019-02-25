package collection.map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class MapExam1 {

	public static void main(String[] args) {	// 
		HashMap<String,String> hm = new HashMap<>();
		hm.put("1이루미","홍길동");
		hm.put("우라두1","홍길동");
		hm.put("아럳1","홍길동");
		hm.put("이럼1","홍길동");
		hm.put("1","홍길동");
		hm.put("1","홍길동1");
		hm.put("1","홍길동2");   // 키밸류가 같으면 마지막에 넣은값으로 들어감
		
		System.out.println(hm); // 순서대로가 보장 되지 않는다.
		System.out.println(hm.get("우라두1")); // 키밸류의 대한 값이 나온다.
		
		List<HashMap<String,String>> ll = new ArrayList<>();
		//ll.add("해시","해시");
	}
}
