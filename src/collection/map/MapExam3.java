package collection.map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class MapExam3 {

	public static void main(String[] args) {
		HashMap<Integer,String> map = new HashMap<>();
		map.put(1,"가만두지 않겠다.");
		map.put(2,"마지막이다.");
		map.put(3,"음...");
		System.out.println(map);
		//고양이 이름은 냥이1~냥이10
		// 나이는 랜덤으로 1살부터 30살까지
		HashMap<String,Object> cat = new HashMap<>();		// Flexible 함
		List<HashMap<String,Object>> Cat = new ArrayList<>();
			
		for(int i=0; i<10; i++) {
			cat = new HashMap<>();
			cat.put("이름","냥이"+(i+1));
			cat.put("나이",(int)(Math.random()*29)+1);
			Cat.add(cat);
		}
//		for(int i=0; i<Cat.size(); i++) {
//			System.out.println(Cat.get(i));
//		}
		for(int i=0; i<10; i++) {
			HashMap<String,Object> c = Cat.get(i);
			System.out.println(c);
		}
	}
}
