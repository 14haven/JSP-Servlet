package test;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.NavigableSet;
import java.util.Set;
import java.util.TreeSet;

public class SetTest2 {

	public static void main(String[] args) {

		// Set<String> set = new TreeSet<>(); // (O)
		NavigableSet<String> set = new TreeSet<>(); // (O)
		set.add("java");
		set.add("python");
		set.add("python");
		set.add("jsp");
		set.add("python");
		set.add("servlet");
		set.add("python");
		
		// 배열 치환 => 요소 추가
		String[]arr = {"C", "C++", "C++", "C#", "kotlin"};
		set.addAll(Arrays.asList(arr));
		
		// 일부분 제거
		set.removeAll(Arrays.asList(arr));
		
		// 정렬
		// set = set.descendingSet();
		set.forEach(System.out::println);
		
//		Iterator<String> it = set.descendingIterator();
//		while (it.hasNext()) {
//			System.out.println(it.next());
//		}
		
		// 일부분 추출
//		set.subSet("maven", true, "servlet", true)
//		   .forEach(System.out::println); 
		
		// set.headSet("servlet", true).forEach(System.out::println);
		// set.tailSet("python").forEach(System.out::println);
		
		// 개별 요소 추출
		// System.out.println(set.first());
		// System.out.println(set.last());
		
	} //

} //