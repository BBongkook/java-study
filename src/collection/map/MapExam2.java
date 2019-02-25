package collection.map;

import java.util.HashMap;
import java.util.Set;

public class MapExam2 {

	public static void main(String[] args) {
		HashMap<String,String> map = new HashMap<>();
		map.put("이름","홍길동");
		map.put("나이","33");
		map.put("주소","전라도 광주");
		map.put("직업","도적");
		
		System.out.println(map);
		
		Set<String> keys = map.keySet(); // map에 대한 키셋 
		System.out.println(keys.size()); // 키 사이즈
		for(String key:keys) {			 // 향상된 for문으로 키밸류 가지고 오고
			System.out.println(key + " : " + map.get(key)); // 키밸류와 밸류를 찍는다.
		}				// Iterator 를 쓴다.
	}
}
