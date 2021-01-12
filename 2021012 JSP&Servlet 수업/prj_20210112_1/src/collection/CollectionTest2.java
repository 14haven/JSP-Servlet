package collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class CollectionTest2 {

	public static void main(String[] args) {
		
		Map<String, String> map = new HashMap<>();
		map.put("회", "노량진");
		map.put("순대", "신림");
		map.put("떡볶이", "신당");
		map.put("떡볶이", "종로");
		map.put("육고기", "마장");
		map.put("부대찌개", "의정부");
		map.put("부대찌개", "을지로");
		map.put("족발", "장충");
	
		// 크기
		System.out.println(map.size());
	
		// 낱개의 요소
		System.out.println(map.get("떡볶이"));
		
		Set<String> set = map.keySet();

		Iterator<String> it = set.iterator();
		
		while(it.hasNext()) {
			String key = it.next();
			String value = map.get(key);
			System.out.println(key+" = "+value);
		}
		
		//map.entrySet().forEach(x->System.out.println(x));
		//map.entrySet().forEach(System.out::println);
		//map.forEach((x,y)->System.out.println(x+"="+y));
		//map.keySet().forEach(x->System.out.println(x+"="+map.get(x)));
		
	}

}
