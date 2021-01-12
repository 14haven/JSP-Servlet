package collection;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class CollectionTest {

	public static void main(String[] args) {
		// 요소(element)의 중복 허용하지 않음 , index 없음
		// Map의 Key 성분과 동일 => Map.keyset()
		// ex) 경품 추첨, 복권...
		String [] arr = {"정연","모모","사나","쯔위","채영","미나", "지효"};
		Set<String> set = new HashSet<>();
		set.add("나연");
		set.add("나연");
		set.add("나연");
		set.add("다현");
		set.add("다현");
		set.addAll(Arrays.asList(arr));
		System.out.println("set의 크기 : "+set.size());
		
		// 전체 나열
		// 방법 1
		Iterator<String> it = set.iterator();
		while(it.hasNext()) {
			System.out.println(it.next()+" ");
		}
		
		// 방법 2
		set.forEach(x->System.out.println(x));
		
		// 방법 3
		set.forEach(System.out::println);
	
		//방법 4
		set.stream().forEach(System.out::println);
	}
}
