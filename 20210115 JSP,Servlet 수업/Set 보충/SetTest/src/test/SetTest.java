package test;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetTest {

	public static void main(String[] args) {

		// Set set = new Set(); // (X)
		// HashSet set = new HashSet(); // (O)
		// Set set = new HashSet(); // (O)
		// Set<String> set = new HashSet<String>(); // (O)
		Set<String> set = new HashSet<>(); // (O)
		set.add("java");
		set.add("python");
		set.add("python");
		set.add("jsp");
		set.add("python");
		set.add("servlet");
		set.add("python");
		
		// 중복 배제
//		System.out.println("set의 크기 : "+set.size());
		
		String[]arr = {"C", "C++", "C++", "C#", "kotlin"};
		// Collection<String> collection =
		//		Arrays.asList(arr);
		// set.addAll(collection);
		set.addAll(Arrays.asList(arr));
		
//		for (String s : set) {
//			System.out.println(s);
//		}
		
//		Iterator<String> it = set.iterator();
//		while (it.hasNext()) {
//			System.out.println(it.next());
//		}
		
		// set.remove("python");
		// set.clear();
		
		// 함수형 프로그래밍
//		set.forEach(x->System.out.println(x));
		set.forEach(System.out::println);
		
//		System.out.println("특정요소 포함 여부 : "
//					+set.contains("java"));
	
		System.out.println("----------------------");
		
		System.out.println(set.retainAll(Arrays.asList(arr)));
		
//		Object[] objs = set.toArray();
//		for (int i=0; i<objs.length; i++) {
//			System.out.println(objs[i]);
//		}
		
//		String strArr[] = new String[set.size()];
//		strArr = set.toArray(strArr);
//		
//		for (int i=0; i<strArr.length; i++) {
//			System.out.println(strArr[i]);
//		}
		
		System.out.println(set.isEmpty());
		
	} //

} //