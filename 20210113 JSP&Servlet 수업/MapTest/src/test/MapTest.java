package test;

import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;

public class MapTest {

	public static void main(String[] args) {
		// Map<String, String> map = new TreeMap<>();
		
		// 오름차순 정렬
		NavigableMap<String, String> map = new TreeMap<>();
		
		map.put("안성","유기");
		map.put("이천","쌀");
		map.put("안동","소주");
		map.put("전주","종이");
		map.put("제주","말");
		map.put("울릉도","오징어");
		
		// 오름차순 정렬(asc)
		// map.keySet().forEach(x->System.out.println(x+"="+map.get(x)));
		// map.entrySet().forEach(x->System.out.println(x));
		// entrySet()은 한덩어리임 알아서  안동=소주 이런식으로 나온다.
		
		// map.forEach((x,y)->System.out.println(x+"="+y));
		
		
		// 내림차순(desc)
		//  map.descendingKeySet().forEach(x->System.out.println(x+"="+map.get(x)));
		// map.descendingMap().forEach((x,y)->System.out.println(x+"="+y));
		
		// 일부분 추출
		// map.subMap("울릉도", "제주").forEach((x,y)->System.out.println(x+"="+y)); // 제주는 포함x
		// map.subMap("울릉도",true, "제주",true).forEach((x,y)->System.out.println(x+"="+y)); // 제주 포함
		// map.headMap("울릉도").forEach((x,y)->System.out.println(x+"="+y));
		// map.headMap("울릉도",true).forEach((x,y)->System.out.println(x+"="+y));
		// map.tailMap("울릉도").forEach((x,y)->System.out.println(x+"="+y));
		 map.tailMap("울릉도",true).forEach((x,y)->System.out.println(x+"="+y));
	}

}
